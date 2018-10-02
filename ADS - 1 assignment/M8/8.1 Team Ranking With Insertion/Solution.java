import java.util.Scanner;
/**SELECTIONSORT.**/
final class Solution {
	/**
	 * @brief [brief description]
	 * @details [long description]
	 */
	private Solution() { }
	/**
	 * @param args value.
	 */
	public static void main(final String[] args) {
		Match m = new Match();
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			String[] tokens = s.nextLine().split(",");
			Team t = new Team(tokens[0],tokens[1],tokens[2],tokens[3]);
			m.addteam(t);
		}
		m.selectionsort();
		System.out.println(m);
	}
}
