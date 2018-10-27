import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// LinearProbingHashST hashing = new LinearProbingHashST();
		LinearProbingHashST hashing = new LinearProbingHashST();
		int n = Integer.parseInt(s.nextLine());
		for(int i = 0; i < n; i++) {
		String[] tokens = s.nextLine().split(",");
		hashing.put(tokens[0], new Student(tokens[1],Double.parseDouble(tokens[2])));
		//System.out.println("hai");

	 }
	 int n1 = Integer.parseInt(s.nextLine());
	 //System.out.println("after loop");
	 int i = 0;
	 while(i < n1) {
	 String[] tokens1 = s.nextLine().split(" ");
	 //System.out.println(tokens1[0]);
	 if(tokens1[0].equals("get")) {
	 	//System.out.println("haiii");
	 	if(tokens1[2].equals("1")) {
	 		String a = hashing.get((tokens1[1]),Integer.parseInt(tokens1[2]));
	 		if(a.equals("Student doesn't exists...")) {
	 			System.out.println(a);
	 			return;
	 		} else {
	 		String[] b = a.split("==");
	 		System.out.println(b[0]);
	 	}
	 } else if(tokens1[2].equals("2")) {
	 	String c = hashing.get((tokens1[1]),Integer.parseInt(tokens1[2]));
	 	//System.out.println(c);
	 	if(c.equals("Student doesn't exists...")) {
	 		System.out.println(c);
	 	} else {
	 	String[] d = c.split("==");
	 	System.out.println(d[1]);
	 }
	 } else {
	 	return;
	 }


	 }
	 i++;
	}
	}
}