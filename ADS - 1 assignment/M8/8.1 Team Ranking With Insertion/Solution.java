import java.util.Scanner;
/**SELECTIONSORT.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Solution() { }
    /**
     * @param args value.
     */
    public static void main(final String[] args) {
        Match m = new Match();
        final int value = 1;
        final int value1 = 0;
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String[] tokens = s.nextLine().split(",");
            Team t = new Team(tokens[value1],tokens[value],
                tokens[value * 2],tokens[value * 3]);

            m.addteam(t);
        }
        m.selectionsort();
        System.out.println(m);
    }
}
