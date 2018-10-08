import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Priority p =  new Priority();
		String s1 = s.nextLine();
		int n = Integer.parseInt(s.nextLine());
		int i = 0;
		while(i < n) {
			String[] tokens = s.nextLine().split(",");
			if(tokens[0].equals("")) {
				System.out.println("false");
			} else {
				System.out.println(p.addAll(tokens));
			}
			i++;
		}
	}
}