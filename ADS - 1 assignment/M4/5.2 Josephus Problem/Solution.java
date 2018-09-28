import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList link = new LinkedList();
		int num = Integer.parseInt(s.nextLine());
		int j = 0;
		while(j < num) {
			String[] tokens = s.nextLine().split(" ");
			 int num1 = Integer.parseInt(tokens[0]);
			 int num2 = Integer.parseInt(tokens[1]);
			 String s2 = "";
			 for(int i = 0; i < num1; i++) {
			 	link.Insertback(i);
			 }
			 while(!link.isEmpty()) {
			 for(int i = 0; i < num2 - 1; i++) {
			 	link.Insertback(link.Deletefront());
			 }
			 s2 += link.Deletefront() + " ";
			}
			System.out.print(s2.substring(0,s2.length() - 1));
			System.out.println();
			 j++;
		}
	}
}