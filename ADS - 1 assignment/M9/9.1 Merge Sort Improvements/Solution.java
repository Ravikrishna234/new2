import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		merged m = new merged();
		Scanner s = new Scanner(System.in);
		String[] tokens = new String[50];
		int i = 0;
		while (i < 2) {
			 tokens = s.nextLine().split(",");
			 m.sort(tokens,tokens.length);
			System.out.println(m);
			i++;
		}
	}
}