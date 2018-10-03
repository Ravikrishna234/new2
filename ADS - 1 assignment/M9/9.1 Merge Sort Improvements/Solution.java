import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Merge m = new Merge();
		Scanner s = new Scanner(System.in);
		String[] tokens = new String[50];
		while (s.hasNextLine()) {
			 tokens = s.nextLine().split(",");
			 m.sort(tokens);
			System.out.println(m.show(tokens));
			System.out.println();
		}
	}
}