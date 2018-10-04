import java.util.Scanner;
/**RECURSIONSTACK.**/
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
        recursion rec = new recursion();
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
        String[] tokens = s.nextLine().split(" ");
        switch (tokens[0]) {
        case "insertAt" : int a = Integer.parseInt(tokens[1]);
        if (a < 0) {
        System.out.println("Can't insert at this position.");
        }  else if (a > rec.getsize() + 1) {

        System.out.println("Can't insert at this position.");
        } else {
                rec.insert(Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[2]));
                System.out.println(rec.displayAll());
                }
             break;
                case "reverse": if (rec.getsize() == 0) {

            System.out.println("No elements to reverse.");
                } else {
                     rec.reverse();
                    System.out.println(rec.displayAll());
                        }
                 break;
                default:
                        break;
        }
    }
    }
}
