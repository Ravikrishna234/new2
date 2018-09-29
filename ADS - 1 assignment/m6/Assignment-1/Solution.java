import java.util.Scanner;
class AddLargeNumbers {
	static LinkedList link = new LinkedList();

    public static LinkedList numberToDigits(String number) {
    	//System.out.println("heo");
    	int num = number.length();
    	//System.out.println(num);
    	for(int i = 0; i < num; i++) {
    		char ch = number.charAt(i);
    		//System.out.println(ch);
    		link.push(ch);
    	}
    		return link;
    }

    public static String digitsToNumber(LinkedList list) {
    		  return link.displayAll();
    		}
    		  //System.out.println(link.displayAll());

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	return list1;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        int num = p.length();
        boolean x = true;
        //System.out.println(p);
        String q = sc.nextLine();
        boolean y = true;
        switch(input){
            case "numberToDigits":
            	LinkedList pDigits = new LinkedList();
                pDigits = AddLargeNumbers.numberToDigits(p);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                int i = 0;
                while(i < num) {
                	pDigits.pop();
                	i++;
                }
            	//System.out.println("j");
                LinkedList qDigits = new LinkedList();
               	qDigits = AddLargeNumbers.numberToDigits(q);
                //System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));

                break;

            // case "addLargeNumbers":
            //     LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            //     LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            //     LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            //     System.out.println(AddLargeNumbers.digitsToNumber(result));
               // break;
        }
    }

}
