import java.util.Scanner;
/**STUDENT.**/
class Solution {
	/**
	 * @brief [brief description]
	 * @details [long description]
	 */
	private Solution() { }
	/**
	 * @param args value
	 * Time complexity is O(N).
	 */
	public static void main(String[] args){
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
			String[] tokens = s.nextLine().split(",");
			stud = new student(tokens[0],tokens[1],Integer.parseInt(tokens[2]),
				Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]),
				Integer.parseInt(tokens[5]),tokens[6]);
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