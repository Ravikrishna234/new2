final class steque {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Node head;
    private Node tail;
    private int size;
    /**node.**/
    class Node {
        /**
         * variable.
         */
        private int value;
        /**
         * variable.
         */
        private Node next;
        /**
         * variable.
         */

    }
    /**
     * @brief [brief description]
     * @details [long description]
     */
    steque() {
        head = tail;
        head = null;
        size = 0;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @return value
     */
    public boolean isEmpty() {
        if (tail == null || head == null) {
            return true;
        }
        return false;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is 1 as it pop only one element.
     */
    public void pop() {
        if (head!=null) {
        head = head.next;
        size--;
    }
    }
    // public void Deleteback() {
    //     if (tail != null) {
    //    Node temp = head;
    //    while(temp.next.next != null) {

    //         temp = temp.next;
    //     }
    //     temp.next = null;
    //     tail = temp;
    //     size--;
    // }
    // }
    /**
     * @param value value
     * Time complexity is 1 as it adds one element.
     */
    public void push(final int value) {
        if(head == null) {
        //Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = null;
        tail = head;
    } else {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }
    size++;
    }
    /**
     * @param value value
     * Time complexity is 1 as it adds one element.
     */
public void Insertback(final int value) {
        if(tail == null || head == null) {
        //Node temp = tail;
            tail = new Node();
            tail.value = value;
            tail.next = null;
        //temp.next = tail;
            head = tail;
        }   else {
            Node temp = tail;
            tail = new Node();
            tail.value = value;
            tail.next = null;
            temp.next = tail;
        }

        size++;
    }
    /**
     * @param value value
     * Time complexity is 1 as it adds one element.
     */
    public int getsize() {
        return size;
    }
    /**
     * @param value value
     * Time complexity is 1 as it adds one element.
     */
    public String displayAll() {
        if(size!=0) {
            String s = "";
            Node temp = head;
            while(temp!=null){
                s += temp.value + ", ";
                temp = temp.next;
            }
            return s.substring(0,s.length()-2);
        }
        return "";
    }
}