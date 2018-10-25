import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashTable hashing = new HashTable();
		String[] tokens = s.nextLine().split(" ");
		for(int i = 0; i < Integer.parseInt(tokens[0]);i++) {
			String key = s.next();
			hashing.put(key,i);
		}
		int[] a = new int[50];
		int size = 1;
		for(int i = 0; i < Integer.parseInt(tokens[1]);i++) {
			String key = s.next();
			if(hashing.contains(key)) {
			 	// hashing.delete(key);
			 	int value = hashing.get(key);
			 	//System.out.print(value + " ");
				if(!contain(value,a,size)) {
					a[size++] = value;
				} else {
					System.out.println("No");
					return;
				}
			 }
		}
		// System.out.println(size);
		if(size == Integer.parseInt(tokens[1])) {
			System.out.println("Yes");
		}
		//hashing.display();
	}
	public static boolean contain(int value,int[] a,int size) {
		for(int i = 0; i < size; i++) {
			if(a[i] == value) {
				return true;
			}
		}
		return false;
	}

}