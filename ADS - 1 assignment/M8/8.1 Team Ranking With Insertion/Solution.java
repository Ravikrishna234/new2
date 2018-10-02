import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Match m = new Match();
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) {
			String[] tokens = s.nextLine().split(",");
			Team t = new Team(tokens[0],tokens[1],tokens[2],tokens[3]);
			m.addteam(t);
		}
		m.selectionsort();
		System.out.println(m);
	}
}
