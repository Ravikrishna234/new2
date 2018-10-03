import java.util.Scanner;
import java.util.Arrays;
class MergeX {
    // cutoff to insertion sort
    private final int CUTOFF = 7;
    private int[] array1;
    private int size;
    MergeX() {
        this.array1 = new int[1];
        this.size = 0;
    }
    public int getSize() {
        return this.size;
    }
    private void resize() {
        array1 = Arrays.copyOf(array1, 2 * array1.length);
    }
    public void add(final int item) {
        if (size == array1.length) {
            resize();
        }
        array1[size++] = item;
    }
    private void merge(int[] array, int[] aux, int lo, int mid, int hi) {
        assert isSorted(array, lo, mid);
        assert isSorted(array, mid + 1, hi);
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                aux[k] = array[j++];
            } else if (j > hi) {
                aux[k] = array[i++];
            } else if (less(array[j], array[i])) {
                aux[k] = array[j++];
            } else {
                aux[k] = array[i++];
            }
        }
        assert isSorted(aux, lo, hi);
    }
    private void sort(int[] array, int[] aux, int lo, int hi) {
        if (hi <= lo + CUTOFF) {
            insertionSort(aux, lo, hi);
            System.out.println("Insertion sort is Invoked...");
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(aux, array, lo, mid);
        sort(aux, array, mid + 1, hi);
        if (!less(array[mid + 1], array[mid])) {
            for (int i = lo; i <= hi; i++) {
                aux[i] = array[i];
            }
            System.out.println("Array is already sorted. So, skipped the call to merge");
            return;
        }
        merge(array, aux, lo, mid, hi);
    }
    /**
     * Rearranges the array in ascending order, using the natural order.
     */
    public void sort(String[] a,int length) {
        int[] array = new int[length];
        for(int i = 0; i < a.length; i++) {
            array[i] = Integer.parseInt(a[i]);
        }
        int[] aux = array.clone();
        sort(aux, array, 0, a.length - 1);
        assert isSorted(array);
    }
    // sort from a[lo] to a[hi] using insertion sort
    private void insertionSort(int[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
    private void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    private boolean less(int a, int b) {
        return (a < b);
    }
    private boolean isSorted(int[] a) {
        return isSorted(a, 0, a.length - 1);
    }
    private boolean isSorted(int[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
    public Object toString(Object[] a) {
        String s = "[";
        for(int i = 0; i < a.length - 1; i++) {
            s += a[i] + ",";
        }
        s += a[a.length - 1] + "]";
        return s;
    }
}