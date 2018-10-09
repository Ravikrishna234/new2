/**minimumheap.**/
class Priority<E extends Comparable<E>> {
	E[] array;
	int size;
	Priority(final E[] a) {
		this.array = a;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(log(N))
	 */
	public boolean isminHeap() {
		for(int i = 1; i < array.length; i++) {
			if(2 * i < array.length && greater(2 * i, i)) {
				return false;
			} if(( 2 * i) + 1 < array.length && greater(2 * i+1, i)) {
				return false;
			}
		}
		return true;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 */
    public boolean greater(int i, int j) {
    	return array[i].compareTo(array[j]) < 0;
    }
}