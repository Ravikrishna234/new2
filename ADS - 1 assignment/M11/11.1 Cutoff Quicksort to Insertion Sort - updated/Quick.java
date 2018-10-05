import java.util.Collections;
class Quick {
	// Comparable[] arr;
	Quick() {

	}
// time complexity for this method is O(N^2).
// In first for loop and second loop it iterates through the size of array
	public void insertion(Comparable[] arr, int low, int high) {
		// int i = low;
		// int j = high;
		for (int i = low; i <= high; i++) {
    		for (int j = i; j > low && less(arr[j], arr[j - 1]); j--) {
             	swap(arr, j, j-1);
    		}
		}
	}
// time complexity of this method is O(1). It swaps the elements only once.
	public void swap(Comparable[] arr, int j, int min) {
		Comparable temp = arr[j];
	    arr[j] = arr[min];
	    arr[min] = temp;
	}
// time complexity of this method is O(N). It iterates through
// the array to print all the objects in array.
	public String toString(Comparable[] arr) {
		// System.out.println("in print");
		String str = "[";
		for (int i = 0; i < arr.length - 1; i++) {
			str += arr[i] + ", ";
		}
		str += arr[arr.length - 1] + "]";
		return str;
	}
// time complexity is O(N)
	public void sort(Comparable[] arr, int low, int high, int cutOff)
    {
        if (high <= low + cutOff - 1) {
        	insertion(arr, low, high);
        	System.out.println("insertionSort called");
        	//System.out.println(toString(arr));

        	return;
        }
        int k = partition(arr, low, high);
        System.out.println(toString(arr));
        sort(arr, low, k - 1, cutOff);
        sort(arr, k + 1, high, cutOff);
    }
//time complexity is O(1)
    public void sort(Comparable[] array, int cutOff) {
    	// Collections.shuffle(array);
    	sort(array, 0, array.length - 1, cutOff);
        System.out.println(toString(array));
    }
// time complexity is O(N)
    public int partition(Comparable[] arr, int low, int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (less(arr[++i], arr[low])) {
                if (i == high) {
                    break;
                }
            }
            while (less(arr[low], arr[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }
// time complexity is O(1)
    public boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}