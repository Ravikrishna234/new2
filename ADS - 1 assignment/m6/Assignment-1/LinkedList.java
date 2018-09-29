import java.util.Scanner;
/**PARENTHESIS.**/
final class LinkedList {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Node head;
    private int size;
    /**node.**/
    public class Node {
        /**
         * variable.
         */
        private char value;
        /**
         * variable.
         */
        private Node next;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     */
    LinkedList() {
        head = null;
        size = 0;
            }
    /**
     * @brief [brief description]
     * @details [long description]
     * @return value
     */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @return value
     */
    public void pop() {
        if (head == null) {
            return;
        }
        char value = head.value;
        head = head.next;

    }
    /**
     * @param value value
     */
    public void push(final char value) {
        if(head == null) {
        //Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = null;
    } else {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }
    size++;
    }
    public String displayAll(){

            String s = "";
            Node temp = head;
            while(temp!=null){
                s += temp.value;
                temp = temp.next;
            }
            return s;
    }
}