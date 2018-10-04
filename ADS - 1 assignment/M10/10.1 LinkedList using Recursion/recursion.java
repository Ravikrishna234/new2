final class recursion {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Node head;
    private Node tail;
    private int size;
    private static int count = 0;
    /**node.**/
    class Node {
        /**
         * variable.`
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
    recursion() {
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
    public void push(final int value) {
    //     if(head == null) {
    //     //Node oldHead = head;
    //     Node node = new Node();
    //     node.value = value;
    //     node.next = null;
    //     head = node;
    // }
    // else {
    //     Node node = new Node();

    //     node.value = value;;
    //     node.next = null;
    //     head = node;
    // }
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;

    size++;
    }
    /**
     * @param value value
     * Time complexity is 1 as it adds one element.
     */
    public void insert(int position,int value) {
        //System.out.println(getsize());

        insertAt(head,position,value);

    }
    public void insertAt(Node head,int position,int value) {
        // System.out.println(count);
        if(position == 0) {
        push(value);
        count = 0;
        return;
    }
    // if(position == 0) {
    //     push(value);
    //     // count++;
    //     return;
    // }
    if(count+1 == position) {
        Node temp = new Node();
        temp.value = value;
        temp.next = head.next;
        head.next = temp;
        count = 0;
        size++;
        return;
    }
    count++;
    insertAt(head.next,position,value);



    // else {
    //     Node oldHead = head;
    //     head = new Node();
    //     head.value = value;
    //     head.next = oldHead;
    // }
    }
    /**
     * @param value value
     * Time complexity is 1 as it adds one element.
     */

    /**
     * @param value value
     * Time complexity is 1 as it adds one element.
     */
    public void reverse() {
        head = recursive(head);
    }
    public Node recursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node p = recursive(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
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