import java.util.Scanner;
class Solution{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Quick quick = new Quick();
		int n = Integer.parseInt(s.nextLine());
		for(int i = 0; i < n; i++) {
			int cutoff = Integer.parseInt(s.nextLine());
			String[] tokens = s.nextLine().split(" ");
			if(tokens[0].equals("")) {
				System.out.println("[]");
			} else {
			quick.sort(tokens,cutoff);
		}

		}
	}
}