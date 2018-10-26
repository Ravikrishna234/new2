import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinearProbingHashST linearprob = new LinearProbingHashST();
		int n = Integer.parseInt(s.nextLine());
		for(int i = 0; i < n;i++) {
			String[] tokens = s.nextLine().split(" ");
			switch(tokens[0]) {
				case "put": linearprob.put(tokens[1],Integer.parseInt(tokens[2]));
							break;
				case "get": System.out.println(linearprob.get(tokens[1]));
							break;
				case "delete":linearprob.delete(tokens[1]);
							break;
				case "display": linearprob.display();
							break;
				default:
						break;
			}
		}
	}
}