import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int i = 0;
        while(i < n) {
            steque stq = new steque();
            while(s.hasNextLine()) {
                String[] tokens = s.nextLine().split(" ");
                switch(tokens[0]) {
                    case "push" : stq.push(Integer.parseInt(tokens[1]));
                                  System.out.println(stq.displayAll());
                                  break;
                    case "pop" :stq.pop();
                                if(stq.isEmpty()) {
                                System.out.println("Steque is empty");
                                } else {
                                 System.out.println(stq.displayAll());
                             }
                                 break;
                    case "enqueue":stq.Insertback(Integer.parseInt(tokens[1]));
                                    System.out.println(stq.displayAll());
                                    break;
                }

            }
            i++;
        }
    }
}