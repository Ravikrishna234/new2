import java.util.Scanner;
/**ADD.**/
class AddLargeNumbers {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private AddLargeNumbers() { }
    private static LinkedList link = new LinkedList();
    /**
     * @param number value
     * @return value
     */
    public static LinkedList numberToDigits(final String number) {
        //System.out.println("heo");
        int num = number.length();
        //System.out.println(num);
        for (int i = 0; i < num; i++) {
            char ch = number.charAt(i);
            //System.out.println(ch);
            link.push(ch);
        }
            return link;
    }
    /**
     * @param list value
     * @return value
     */
    public static String digitsToNumber(final LinkedList list) {
              return link.displayAll();
            }
              //System.out.println(link.displayAll());
    /**
     * @param list1 value
     * @param list2 value2
     * @return value
     */
    public static LinkedList
    addLargeNumbers(final LinkedList list1, final LinkedList list2) {
        String s = "";
        while (!list1.isEmpty()) {
            char c = list1.pop1();

            s += c;


        }
        String s1 = "";
        while (!list2.isEmpty()) {
            char c1 = list2.pop1();

            s1 += c1;
        }
        System.out.println(s);
        return list1;
}
}
/**add.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Solution() { }
    /**
     * @param args value
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        int num = p.length();
        //System.out.println(p);
        String q = sc.nextLine();
        switch (input) {
            case "numberToDigits":
                LinkedList pDigits = new LinkedList();
                pDigits = AddLargeNumbers.numberToDigits(p);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                int i = 0;
                while (i < num) {
                    pDigits.pop();
                    i++;
                }
                //System.out.println("j");
                LinkedList qDigits = new LinkedList();
                qDigits = AddLargeNumbers.numberToDigits(q);
                //System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));

                break;

            case "addLargeNumbers":
                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
                LinkedList result =
                AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                //System.out.println(AddLargeNumbers.digitsToNumber(result));
               break;
            default:
                    break;
        }
    }

}
