/**STUDENT.**/
class student {
	/**
	 * variable.
	 */
	private String name;
	/**
	 * variable.
	 */
	private String dob;
	/**
	 * variable.
	 */
	private int sub1;
	/**
	 * variable.
	 */
	private int sub2;
	/**
	 * variable.
	 */
	private int sub3;
	/**
	 * variable.
	 */
	private int total;
	/**
	 * variable.
	 */
	private String reservation;
	/**
	 * variable.
	 */
	private int vacancy;
	/**
	 * variable.
	 */
	private int unreserved;
	/**
	 * variable.
	 */
	private int bc;
	/**
	 * variable.
	 */
	private int sc;
	/**
	 * variable.
	 */
	private int st;
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * time complexity is O(1).
	 */
	public int getage() {
        int age = 0;
        final int year = 2018, days = 365, month = 30, ten = 10;
        String[] token = this.getdob().split("-");
        age += (year - Integer.parseInt(token[2])) * days;
        age += (ten - Integer.parseInt(token[1])) * month;
        age += Integer.parseInt(token[0]);
        return age;
    }
    /**.
     * @brief [brief description]
     * @details [long description]
     *
     * @param String [description]
     * @param String [description]
     * @param int [description]
     * @param int [description]
     * @param int [description]
     * @param int [description]
     * @param String [description]
     */
	student(final String name, final String dob, final int sub1, final int sub2,
		final int sub3, final int total, final String res) {
		this.name = name;
		this.dob = dob;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = total;
		this.reservation = res;
	}
	/**.
	 * time complexity is 1
	 */
	public String getname() {
		return this.name;
	}
	/**.
	 * time complexity is 1
	 */
	public String getdob() {
		return this.dob;
	}
	/**.
	 * time complexity is 1
	 */
	public int get1() {
		return this.sub1;
	}
	/**.
	 * time complexity is 1
	 */
	public int get2() {
		return this.sub2;
	}
	/**
	 * time complexity is 1
	 */
	public int get3() {
		return this.sub3;
	}
	/**
	 * time complexity is 1
	 */
	public int gettotal() {
		return this.total;
	}
	/**
	 * time complexity is 1
	 */
	public String getreserve() {
		return this.reservation;
	}
	public String print() {
		return this.getname() + "," + this.gettotal() + "," + this.getreserve();
	}

	/**
	 * time complexity is 1
	 */
	public int compare(final student that) {
		if (this.gettotal() > that.gettotal()) {
			return 1;
		}
		 else if (this.gettotal() < that.gettotal()) {
		 	return -1;
		 }
		 else if (this.get3() > that.get3()) {
		 	return 1;
		 } else if (this.get3() < that.get3()) {
		 	return -1;
		 } else if (this.get2() > that.get2()) {
		 	return 1;
		 } else if (this.get2() < that.get2()) {
		 	return - 1;
		 } else if (this.getage() > that.getage()) {
		 	return -1;
		 } else if (this.getage() < that.getage()) {
		 	return 1;
		 }
			else {
		return 0;
	}
}

}
/**student.**/
