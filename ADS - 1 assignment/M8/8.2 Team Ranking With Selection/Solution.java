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
     * time coplexity is O(N)
     */
    public static void main(final String[] args) {
        Match m = new Match();
        final int value = 1;
        final int value1 = 0;
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String[] tokens = s.nextLine().split(",");
            Team t = new Team(tokens[value1], tokens[value],
                tokens[value + value], tokens[value + value + value]);

            m.addteam(t);
        }
        m.insertionsort();
        System.out.println(m);
    }
}
