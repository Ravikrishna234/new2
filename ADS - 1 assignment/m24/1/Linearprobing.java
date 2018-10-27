import java.util.Arrays;
class LinearProbingHashST<Key, Value> {
    private static final int INIT_CAPACITY = 4;

    private int n;           // number of key-value pairs in the symbol table
    private int m;           // size of linear probing table
    private Key[] keys;      // the keys
    private Value[] vals;    // the values


    /**
     * Initializes an empty symbol table.
     */
    public LinearProbingHashST() {
        this(INIT_CAPACITY);
    }

    /**
     * Initializes an empty symbol table with the specified initial capacity.
     *
     * @param capacity the initial capacity
     */
    public LinearProbingHashST(int capacity) {
        m = capacity;
        n = 0;
        keys = (Key[])   new Object[m];
        vals = (Value[]) new Object[m];
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     *
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return n;
    }

    /**
     * Returns true if this symbol table is empty.
     *
     * @return {@code true} if this symbol table is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns true if this symbol table contains the specified key.
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key};
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     * Time complexity is O(1)
     */
    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(1)
     * @param key [description]
     * @return [description]
     */
    // hash function for keys - returns value between 0 and M-1
    private int hash(Key key) {
        return (key.hashCode() * 11) % m;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(N)
     * @param capacity [description]
     */
    // resizes the hash table to the given capacity by re-hashing all of the keys
    private void resize(int capacity) {
        LinearProbingHashST<Key, Value> temp = new LinearProbingHashST<Key, Value>(capacity);
        for (int i = 0; i < m; i++) {
            if (keys[i] != null) {
                temp.put(keys[i], vals[i]);
            }
        }
        keys = temp.keys;
        vals = temp.vals;
        m    = temp.m;
    }

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     *
     *
     * @param  key the key
     * @param  val the value
     * Time complexity is in average case (constant)
     * Time complexity in worst case O(log(N))
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");

        if (val == null) {
            delete(key);
            return;
        }

        // double table size if 50% full
        if (n >= m/2) resize(2*m);

        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % m) {
            if (keys[i].equals(key)) {
                vals[i] = val;
                return;
            }
        }
        keys[i] = key;
        vals[i] = val;
        n++;
    }

    /**
     * @param  key the key
     * @param  val the value
     * Time complexity is in average case (constant)
     * Time complexity in worst case O(log(N))
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public String get(Key key,int value) {
        Value v = get(key);
        String s = "";
        s+= v;
        //System.out.println(s);
        //System.out.println("i am in");
        String[] str = s.split(",");
        //System.out.println(Arrays.toString(str));
        if(v == null) {
            System.out.println("student doesn't exists...");
        } else if(value == 1) {
            //if(str.length == 1) {
                return str[0];
            }
        else {
            return str[0];
        }
        return null;
    }
    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        for (int i = hash(key); keys[i] != null; i = (i + 1) % m)
            if (keys[i].equals(key))
                return vals[i];
        return null;
    }

    /**
     * @param  key the key
     * @param  val the value
     * Time complexity is in average case (constant)
     * Time complexity in worst case O(log(N))
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        if (!contains(key)) return;

        // find position i of key
        int i = hash(key);
        while (!key.equals(keys[i])) {
            i = (i + 1) % m;
        }

        // delete key and associated value
        keys[i] = null;
        vals[i] = null;

        // rehash all keys in same cluster
        i = (i + 1) % m;
        while (keys[i] != null) {
            // delete keys[i] an vals[i] and reinsert
            Key   keyToRehash = keys[i];
            Value valToRehash = vals[i];
            keys[i] = null;
            vals[i] = null;
            n--;
            put(keyToRehash, valToRehash);
            i = (i + 1) % m;
        }

        n--;

        // halves size of array if it's 12.5% full or less
        if (n > 0 && n <= m/8) resize(m/2);

        //assert check();
    }


    // integrity check - don't check after each put() because
    // integrity not maintained during a delete()
    // private boolean check() {

    //     // check that hash table is at most 50% full
    //     if (m < 2*n) {
    //         System.err.println("Hash table size m = " + m + "; array size n = " + n);
    //         return false;
    //     }

    //     // check that each key in table can be found by get()
    //     for (int i = 0; i < m; i++) {
    //         if (keys[i] == null) continue;
    //         else if (get(keys[i]) != vals[i]) {
    //             System.err.println("get[" + keys[i] + "] = " + get(keys[i]) + "; vals[i] = " + vals[i]);
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(N)
     */
    public void display() {
        if(size() == 0) {
            System.out.println("{}");
            return;
        }
        String str = "{";
        for(int i=0; i<m;i++) {
            if(keys[i] != null) {
                str += keys[i] + ":" + vals[i] + ", ";
            }
        }
        str = str.substring(0, str.length()-2);
        str += "}";
        System.out.println(str);
    }
}