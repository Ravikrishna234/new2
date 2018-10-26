class HashTable {
	private int M = 10;
	private Node[] st = new Node[M];

private static class Node {
	private String key;
	private int value;
	private Node next;
	Node(String key1,int value1,Node node) {
		this.key = key1;
		this.value = value1;
		this.next = node;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 * @return [description]
	 */
	public String getkey() {
		return this.key;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 * @return [description]
	 */
	public int getvalue() {
		return this.value;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 * @return [description]
	 */
	public String toString() {
		return this.key + " " + this.value;
	}
}
/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(N)
	 * @return [description]
	 */
public void put(String key,int value) {
	int i = hash(key);
	for(Node x = st[i]; x!=null;x = x.next) {
		if(key.equals(x.key)) {
			x.value = value;
			return;
		}
	}
	st[i] = new Node(key,value,st[i]);
}
/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 * @return [description]
	 */
private int hash(String key) {
	return (key.hashCode() & 0x7fffffff) % M;
}
/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(N)
	 * @return [description]
	 */
public int get(String key) {
	int i = hash(key);
	for(Node x = st[i];x!=null;x=x.next) {
		if(key.equals(x.key)) {
			return x.value;
		}
	}
	return -1;
}
/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 * @return [description]
	 */
public boolean contains(String key) {
	return get(key) != -1;
}
/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(N)
	 * @return [description]
	 */
public void delete(String key) {
	int i = hash(key);
	if(contains(key)) {
		delete(key);
	}
}
/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(N)
	 * @return [description]
	 */
public void display() {
for(int i = 0; i < st.length;i++) {
	System.out.println(st[i]);
}
}
}
