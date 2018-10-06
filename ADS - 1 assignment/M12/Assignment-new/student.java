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
	student (int vacancy,int unre,int bc,int sc,int st) {
		this.vacancy = vacancy;
		this.unreserved = unre;
		this.bc = bc;
		this.sc = sc;
		this.st = st;
	}
	/**
	 * time complexity is 1
	 */
	public int getvacancy() {
		return this.vacancy;
	}
	/**
	 * time complexity is 1
	 */
	public int getst() {
		return this.st;
	}
	/**
	 * time complexity is 1
	 */
	public int getsc() {
		return this.sc;
	}
	/**
	 * time complexity is 1
	 */
	public int getbc() {
		return this.bc;
	}
	/**
	 * time complexity is 1
	 */
	public int getunreserve() {
		return this.unreserved;
	}
	int getage() {
        int age = 0;
        final int year = 2018, days = 365, month = 30, ten = 10;
        String[] token = this.getdob().split("-");
        age += (year - Integer.parseInt(token[2])) * days;
        age += (ten - Integer.parseInt(token[1])) * month;
        age += Integer.parseInt(token[0]);

        return age;
    }
	//Date start = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH)
                    //.parse(startDate);
	student(String name,String dob,int sub1,int sub2,int sub3,int total,String res) {
		this.name = name;
		this.dob = dob;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = total;
		this.reservation = res;
	}
	/**
	 * time complexity is 1
	 */
	public String getname() {
		return this.name;
	}
	/**
	 * time complexity is 1
	 */
	public String getdob() {
		return this.dob;
	}
	/**
	 * time complexity is 1
	 */
	public int get1() {
		return this.sub1;
	}
	/**
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
	/**
	 * time complexity is 1
	 */
	  int compareTo(student that) {
		if (this.gettotal() > that.gettotal()) {
			return 1;
		}
		else if (this.gettotal() < that.gettotal()) {
			return -1;
		 } else {
		return 0;
	}
		// else {
		// if(this.getlosse() < that.getlosse()) {
		// 	return 1;
		// }
		// else if(this.getlosse() > that.getlosse()) {
		// 	return -1;
		// } else {
		// if(this.getdraws() < that.getdraws()) {
		// 	return -1;
		// } else if(this.getdraws() > that.getdraws()) {
		// 	return 1;
		// }

}
	/**
	 * time complexity is 1
	 */
	public int compare(student that) {
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
		 } else if (this.getdob().compareTo(that.getdob()) > 0) {
		 	return 1;
		 } else if (this.getdob().compareTo(that.getdob()) < 0) {
		 	return -1;
		 }
			else {
		return 0;
	}
}

}
class store {
	student[] student;
	int size;
	store() {
		student = new student[50];
		size = 0;
	}
	public void addStudent(student s) {
		student[size++] = s;
	}
	public void selectionsort() {
		int loc;
		for (int i = 0; i < size - 1; i++) {
			loc = i;
			for (int j = i + 1; j < size; j++) {
				if ((student[j].compareTo(student[loc])) >= 0) {
					loc = j;
				}
			}
			exchange(student, i, loc);
		}
	}
	/**
	 * time complexity is O(1).
	 */
	public void exchange(student[] team,int i,int loc) {
	student temp = student[loc];
	student[loc] = student[i];
	student[i] = temp;
			}
	public void selectionsort1() {
		int loc;
		for (int i = 0; i < size - 1; i++) {
			loc = i;
			for (int j = i + 1; j < size; j++) {
				if ((student[j].compare(student[loc])) >= 0) {
					loc = j;
				}
			}
			exchange1(student,i,loc);
		}
	}
	/**
	 * time complexity is O(1).
	 */
	public void exchange1(student[] team1,int i,int loc) {
	student temp = student[loc];
	student[loc] = student[i];
	student[i] = temp;
			}
	public String toString() {
		String s = "";
		for (int i = 0; i < size - 1; i++) {
			s += student[i].getname() + "," + student[i].gettotal()
			+ "," +student[i].getreserve();
			s += "\n";
		}
		s += student[size - 1].getname() + "," + student[size - 1].gettotal()
		+ "," +student[size - 1].getreserve();
			return s;


	}
	public String toString1(int vacancy) {
		String s = "";
		for (int i = 0; i < vacancy - 1; i++) {
			s += student[i].getname() + "," + student[i].gettotal()
			+ "," +student[i].getreserve();
			s += "\n";
		}
		s += student[vacancy - 1].getname() + "," + student[vacancy - 1].gettotal()
		+ "," +student[vacancy - 1].getreserve();
			return s;


	}
}