import java.util.Scanner;
/**STUDENT.**/
final class Solution {
	/**
	 * @brief [brief description]
	 * @details [long description]
	 */
	private Solution() { }
	/**
	 * @param args value
	 * Time complexity is O(N).
	 */
	public static void main(final String[] args){
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int vacancy = Integer.parseInt(s.nextLine());
		int uvacancy = Integer.parseInt(s.nextLine());
		int bc = Integer.parseInt(s.nextLine());
		int sc = Integer.parseInt(s.nextLine());
		int st = Integer.parseInt(s.nextLine());
		store sto = new store();
		student stud = new student(vacancy, uvacancy, bc, sc, st);
		int i = 0;
		while (i < n) {
			final int value = 0;
			final int value1 = 1;
			final int value5 = 5;
			String[] tokens = s.nextLine().split(",");
			stud = new student(tokens[value], tokens[value1 + value1],
		Integer.parseInt(tokens[value1 + value1]),
		Integer.parseInt(tokens[value5 - value1 - value1]),
		Integer.parseInt(tokens[value5 - value1]),
		Integer.parseInt(tokens[value5]), tokens[value5 + 1]);
			sto.addStudent(stud);
			i++;
		}
		sto.selectionsort();
		System.out.println(sto);
		System.out.print("\n");
		sto.selectionsort1();
		System.out.println(sto.toString1(vacancy));
	}
}