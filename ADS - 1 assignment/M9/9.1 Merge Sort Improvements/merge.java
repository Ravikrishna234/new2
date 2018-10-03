import java.util.Arrays;
class merged{
	int[] array;
	final int CUTOFF = 7;
	/**
	 * time complexity is O(N^2)
	 */
	public void insertionsort(int[] array,int low, int high) {
		int i = low;
		int j = high;
		System.out.println("Insertion");
		for(i = 1; i < array.length; i++) {
			for(j = i;j > 0 && array[j] < array[j - 1];j--) {
			exchange(array,j,j-1);
		}
	}
}
	/**
	 * time complexity is O(1)
	 */
	public void exchange(int[] array,int low,int high) {
	int temp = array[high];
	array[high] = array[low];
	array[low] = temp;
			}
	public void sort(int[] a,int[] aux,int low,int high) {
		int mid = low + (high - low) / 2;
		if(high < low + CUTOFF) {

		insertionsort(a,low,high);
		// System.out.println("Insertion sort method invoked...");
		// System.out.println(toString());
		return;
		} else {
		// System.out.println(mid);
		sort(a,aux,low,mid);
		sort(a,aux,mid+1,high);
		// System.out.println(a[mid] + " " + a[mid+1]);
		if(a[mid] < a[mid+1]) {
		System.out.println("Array is already sorted. So, skipped the call to merge...");
		return;
	}
		mergesort(a,aux,low,mid,high);
	}
	}
	public void sort(String[] token,int length) {
		array = new int[length];
		for(int i = 0;i < length;i++) {
			array[i] = Integer.parseInt(token[i]);
		}
		int[] aux = new int[array.length];
		sort(array,aux,0,array.length - 1);
	}
	public void mergesort(int[] array,int[] aux,int low,int mid,int high) {
		int i = low;
		int j = mid + 1;
		int l = low;
		while((i <= mid) && (j <= high)) {
			if(array[i] < array[j]) {
				aux[l] = array[i];
				l++;
				i++;
			} else {
				aux[l] = array[j];
				l++;
				j++;
			}
		}
		while(i <= mid) {
			aux[l] = array[i];
			i++;
			l++;
		}
		while(j <= high) {
			aux[l] = array[j];
			j++;
			l++;
		}
		for(int p = low; p <= high; p++) {
			array[p] = aux[p];
		}
	}

	/**
	 * time complexity is O(1).
	 */
	public String toString() {
		String str = "[";
		for(int i = 0; i < array.length - 1; i++) {
			str += array[i] + ",";
		}
		 str = str + array[array.length - 1] + "]";
		 return str;
	}
}