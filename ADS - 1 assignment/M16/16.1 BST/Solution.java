import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 Binarysearchtree bst = new Binarysearchtree();
	 while(s.hasNextLine()) {
	 String[] tokens = s.nextLine().split(",");

	 Book b = new Book(tokens[1],tokens[2],Float.parseFloat(tokens[3]));
	 switch(tokens[0]) {
	 	case "put":
	 				bst.put(b,Integer.parseInt(tokens[4]));
	 				break;
	 	case "get":
	 				System.out.println(bst.get(b));
					break;
	 }
	}
	}
}