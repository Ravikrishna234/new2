import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		recursion rec = new recursion();
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) {
		String[] tokens = s.nextLine().split(" ");
		switch(tokens[0]) {
				case "insertAt" : int a = Integer.parseInt(tokens[1]);
								  // System.out.println(rec.getsize());
								  if(a < 0) {
								  System.out.println("Can't insert at this position.");
								}  else if(a > rec.getsize() + 1) {
									System.out.println("Can't insert at this position.");
								} else {
								  rec.insert(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
								  System.out.println(rec.displayAll());
								}
								  break;
				case "reverse":	  rec.reverse();
								  System.out.println(rec.displayAll());
								  break;
		}
	}
	}
}