import java.util.Arrays;
class Priority {
	Comparable[] array;
	int size;
	Priority() {
		array = new Comparable[20];
		size = 0;
	}
	public boolean addAll(Comparable[] arr) {
		for(int i = 0; i < arr.length; i++) {
		add(arr[i]);
	}
	if(isMinHeap(1)) {
		return true;
	} else {
		return false;
	}
	}
	public void add(Comparable t) {
		if(size == array.length - 1) {
			resize();
		}
		array[++size] = t;
	}
	public void resize() {
		array = Arrays.copyOf(array,array.length * 2);
	}
	 public boolean isMinHeap(int k) {
        if (k > size) {
        	return true;
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
}