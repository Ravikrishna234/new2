import java.util.Scanner;
/**JOSEPHSON.**/
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
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());
        int j = 0;
        while (s.hasNextLine()) {
            String[] tokens = s.nextLine().split(" ");
             int num1 = Integer.parseInt(tokens[0]);
             int num2 = Integer.parseInt(tokens[1]);
             String s2 = "";
             LinkedList link = new LinkedList();
             for (int i = 0; i < num1; i++) {
                link.Insertback(i);
             }
             while (!link.isEmpty()) {
             for (int i = 0; i < num2 - 1; i++) {
                link.Insertback(link.Deletefront());
             }
             s2 += link.Deletefront() + " ";
            }
            System.out.print(s2.substring(0, s2.length() - 1));
            System.out.println();
             j++;
        }
    }
}
