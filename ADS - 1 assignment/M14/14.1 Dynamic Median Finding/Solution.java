import java.util.Arrays;
class median {
	int[] arr;
	int size;
	median() {
		arr = new int[20];
		size = 0;
	}
	public void add(int value) {
		if(size == arr.length - 1) {
			resize();
		}
		arr[size++] = value;
	}
	public void resize() {
		arr = Arrays.copyOf(arr,arr.length * 2);
	}
	 public void swim(int k) {
        while (k > 1 && greater(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }
    public void exch(int i, int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }
}