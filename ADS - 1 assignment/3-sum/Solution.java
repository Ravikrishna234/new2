import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] a = new int[size];
		for(int i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		int count = 0;
		for(int i = 0; i < size; i++) {
			for(int j = i+1 ; j < size; j++) {
				int low = j+1;
				int high = size - 1;
				while(low <= high) {
					int middle = (low + high) / 2;
					if(-(a[i] + a[j]) == middle) {
						count++;
					}
					else if(-(a[i] + a[j]) > high) {
						high = middle - 1;
					}
					else {
						low = middle + 1;
					}
				}
			}
		}
	}
}