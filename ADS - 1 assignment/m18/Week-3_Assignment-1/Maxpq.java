import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  The {@code Maxpq} class represents a priority queue of generic keys.
 *  It supports the usual <em>insert</em> and <em>delete-the-maximum</em>
 *  operations, along with methods for peeking at the maximum key,
 *  testing if the priority queue is empty, and iterating through
 *  the keys.
 *  <p>
 *  This implementation uses a binary heap.
 *  The <em>insert</em> and <em>delete-the-maximum</em> operations take
 *  logarithmic amortized time.
 *  The <em>max</em>, <em>size</em>, and <em>is-empty</em> operations take constant time.
 *  Construction takes time proportional to the specified capacity or the number of
 *  items used to initialize the data structure.
 *  <p>
 *  For additional documentation, see <a href="https://algs4.cs.princeton.edu/24pq">Section 2.4</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 *
 *  @param <Key> the generic type of key on this priority queue
 */

public class Maxpq<stock> implements Iterable<stock> {
    private stock[] pq;                    // store items at indices 1 to n
    private int n;                       // number of items on priority queue
    private Comparator<stock> comparator;  // optional comparator

    /**
     * Initializes an empty priority queue with the given initial capacity.
     *
     * @param  initCapacity the initial capacity of this priority queue
     */
    public Maxpq(int initCapacity) {
        pq = (stock[]) new Object[initCapacity + 1];
        n = 0;
    }

    /**
     * Initializes an empty priority queue.
     */
    public Maxpq() {
        this(1);
    }

    /**
     * Initializes an empty priority queue with the given initial capacity,
     * using the given comparator.
     *
     * @param  initCapacity the initial capacity of this priority queue
     * @param  comparator the order in which to compare the keys
     */
    public Maxpq(int initCapacity, Comparator<stock> comparator) {
        this.comparator = comparator;
        pq = (stock[]) new Object[initCapacity + 1];
        n = 0;
    }

    /**
     * Initializes an empty priority queue using the given comparator.
     *
     * @param  comparator the order in which to compare the keys
     */
    public Maxpq(Comparator<stock> comparator) {
        this(1, comparator);
    }

    /**
     * Initializes a priority queue from the array of keys.
     * Takes time proportional to the number of keys, using sink-based heap construction.
     *
     * @param  keys the array of keys
     * Time complexity is O(log(N))
     */
    public Maxpq(stock[] keys) {
        n = keys.length;
        pq = (stock[]) new Object[keys.length + 1];
        for (int i = 0; i < n; i++)
            pq[i+1] = keys[i];
        for (int k = n/2; k >= 1; k--)
            sink(k);
        assert isMaxHeap();
    }



    /**
     * Returns true if this priority queue is empty.
     *
     * @return {@code true} if this priority queue is empty;
     *         {@code false} otherwise
     *
     * Time complexity is O(1)
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * Returns the number of keys on this priority queue.
     * Time complexity is O(1)
     * @return the number of keys on this priority queue
     */
    public int size() {
        return n;
    }

    /**
     * Returns a largest key on this priority queue.
     * Time complexity is O(1)
     * @return a largest key on this priority queue
     * @throws NoSuchElementException if this priority queue is empty
     */
    public stock max() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        return pq[1];
    }

    // helper function to double the size of the heap array
    /**
    * Time complexity is O(N)
    */
    private void resize(int capacity) {
        assert capacity > n;
        stock[] temp = (stock[]) new Object[capacity];
        for (int i = 1; i <= n; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }


    /**
     * Adds a new key to this priority queue.
     *
     * @param  x the new key to add to this priority queue
     * /**
    * Time complexity is O(1)
    */
    public void insert(stock x) {

        // double size of array if necessary
        if (n == pq.length - 1) resize(2 * pq.length);

        // add x, and percolate it up to maintain heap invariant
        pq[++n] = x;
        swim(n);
        assert isMaxHeap();
    }

    /**
     * Removes and returns a largest key on this priority queue.
     *
     * @return a largest key on this priority queue
     * @throws NoSuchElementException if this priority queue is empty
     * /**
    * Time complexity is O(1)
    */
    public stock delMax() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        stock max = pq[1];
        exch(1, n--);
        sink(1);
        pq[n+1] = null;     // to avoid loiteing and help with garbage collection
        if ((n > 0) && (n == (pq.length - 1) / 4)) resize(pq.length / 2);
        assert isMaxHeap();
        return max;
    }


   /***************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/
   /**
    * Time complexity is O(log(N))
    */
    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }
    /**
    * Time complexity is O(log(N))
    */
    private void sink(int k) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(j, j+1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

   /***************************************************************************
    * Helper functions for compares and swaps.
    ***************************************************************************/
   /**
    * Time complexity is O(1)
    */
    private boolean less(int i, int j) {
        if (comparator == null) {
            return ((Comparable<stock>) pq[i]).compareTo(pq[j]) < 0;
        }
        else {
            return comparator.compare(pq[i], pq[j]) < 0;
        }
    }
    /**
    * Time complexity is O(N)
    */
    private void exch(int i, int j) {
        stock swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }

    // is pq[1..N] a max heap?
    /**
    * Time complexity is O(1)
    */
    private boolean isMaxHeap() {
        return isMaxHeap(1);
    }

    // is subtree of pq[1..n] rooted at k a max heap?
    /**
    * Time complexity is O(log(N))
    */
    private boolean isMaxHeap(int k) {
        if (k > n) return true;
        int left = 2*k;
        int right = 2*k + 1;
        if (left  <= n && less(k, left))  return false;
        if (right <= n && less(k, right)) return false;
        return isMaxHeap(left) && isMaxHeap(right);
    }
    public String toString() {
        String s = "";
        int i;
        for(i = 0; i < n - 1;i++) {
            if(pq[i]!=null) {
            s += pq[i] +"\n";
        }
    }
        s+= pq[n - 1] + "\n";
        return s;

    }

   /***************************************************************************
    * Iterator.
    ***************************************************************************/

    /**
     * Returns an iterator that iterates over the keys on this priority queue
     * in descending order.
     * The iterator doesn't implement {@code remove()} since it's optional.
     *
     * @return an iterator that iterates over the keys in descending order
     */
    public Iterator<stock> iterator() {
        return new HeapIterator();
    }

    private class HeapIterator implements Iterator<stock> {

        // create a new pq
        private Maxpq<stock> copy;

        // add all items to copy of heap
        // takes linear time since already in heap order so no keys move
        public HeapIterator() {
            if (comparator == null) copy = new Maxpq<stock>(size());
            else                    copy = new Maxpq<stock>(size(), comparator);
            for (int i = 1; i <= n; i++)
                copy.insert(pq[i]);
        }

        public boolean hasNext()  { return !copy.isEmpty();                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public stock next() {
            if (!hasNext()) throw new NoSuchElementException();
            return copy.delMax();
        }
    }
}