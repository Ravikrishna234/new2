import java.util.Arrays;
class Priority<E extends Comparable<E>> {
	E[] array;
	int size;
	Priority(final E[] a) {
		this.array = a;
	}
	public boolean isminHeap() {
		if(isMinHeap(1)) {
			return true;
		  } else {
		return false;
	}
	}
	// public void addAll(E[] arr) {
	// 	for(int i = 0; i < arr.length; i++) {
	// 	add(arr[i]);
	// }
	// }
	// public void add(E t) {
	// 	if(size == array.length - 1) {
	// 		resize();
	// 	}
	// 	array[++size] = t;
	// }
	public void resize() {
		array = Arrays.copyOf(array,array.length * 2);
	}
	 public boolean isMinHeap(int k) {
        if (k < size) {
        	return false;
        }

        if (2 * k <= size && greater(k, 2 * k)) {
        	return false;
        }
        if (2 * k + 1 <= size && greater(k, 2 * k+1)) {
        	return false;
        }
        return isMinHeap(2 * k) && isMinHeap(2 * k + 1);
    }
    public boolean greater(int i, int j) {
    	return (array[i].compareTo(array[j])) > 0;
    }
    public int compareTo(E that) {
    	if(this.compareTo(that) > 0) {
    		return 1;
    	} else if(this.compareTo(that) < 0)
    return -1;
    	return 0;
    }
}