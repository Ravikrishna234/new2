import java.util.Scanner;
/**MINIMUMHEAP.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Solution() { }
    /**
     * @param args [description]
     * Time complexity is O(N) for strings and O(N^2) for rest.
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int n = Integer.parseInt(s.nextLine());
        switch (s1) {
            case "String":
            while (n > 0) {
            String[] tokens = s.nextLine().split(",");
            Priority<String> m = new Priority<String>(tokens);
            System.out.println(m.isminHeap());
            n--;
                }
                break;
            case "Integer":
            while (n > 0) {
            String[] tokens = s.nextLine().split(",");
            Integer[] intTokens = new Integer[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                intTokens[i] = Integer.parseInt(tokens[i]);
               }
            Priority<Integer> m = new Priority<Integer>(intTokens);
            System.out.println(m.isminHeap());
            n--;
                }
                break;
            case "Double":
            while (n > 0) {
            String[] tokens = s.nextLine().split(",");
            Double[] idTokens = new Double[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                idTokens[i] = Double.parseDouble(tokens[i]);
            }
            Priority<Double> m = new Priority<Double>(idTokens);
            System.out.println(m.isminHeap());
            n--;
                }
        break;
        case "Float":
        while (n > 0) {
        String[] tokens = s.nextLine().split(",");
        if (tokens[0].equals("")) {
            System.out.println("false");
            break;
        } else {
        Float[] ftokens = new Float[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
                ftokens[i] = Float.parseFloat(tokens[i]);
            }
        Priority<Float> m = new Priority<Float>(ftokens);
        System.out.println(m.isminHeap());
        n--;
            }
        }
        break;
        default:
        break;
    }

    }
}
