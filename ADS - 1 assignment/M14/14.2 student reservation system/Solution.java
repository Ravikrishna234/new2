import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	store sto = new store();
	int n = Integer.parseInt(s.nextLine());
        int vacancies = Integer.parseInt(s.nextLine());
        int open = Integer.parseInt(s.nextLine());
        int bc = Integer.parseInt(s.nextLine());
        int sc = Integer.parseInt(s.nextLine());
        int st = Integer.parseInt(s.nextLine());
        int i = 0;
        while(i < n) {
        	String[] tokens = s.nextLine().split(",");
        	student stud = new student(tokens[0],tokens[1],Integer.parseInt(tokens[2]),
        		Integer.parseInt(tokens[3]),
        		Integer.parseInt(tokens[4]),Integer.parseInt(tokens[5]),
        			tokens[6]);
        	sto.addStudent(stud);
        	i++;
        }
        sto.sort();
        System.out.println(sto.toString());
        System.out.println("\n" +sto.toString1(open));
        sto.getr(open,n,bc,sc,st);
	}
}
