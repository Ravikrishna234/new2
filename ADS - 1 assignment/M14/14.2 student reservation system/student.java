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
	public String print() {
		return this.getname() + "," + this.gettotal() + "," + this.getreserve();
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
	public void sort() {
        int n = size;
        for (int k = n/2; k >= 1; k--)
            sink(student, k, n);
        while (n > 1) {
            exch(student, 1, n--);
            sink(student, 1, n);
        }
    }

	 public void sink(student[] pq, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) j++;
            if (!less(pq, k, j)) break;
            exch(pq, k, j);
            k = j;
        }
    }
    public boolean less(student[] student, int i, int j) {
        return student[i - 1].compare(student[j - 1]) >= 0;
    }

    public void exch(student[] team, int i, int loc) {
        student swap = team[i - 1];
        team[i - 1] = team[loc - 1];
        team[loc - 1] = swap;
    }

	/**
	 * time complexity is O(1).
	 */
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
	public void getr(int open,int n,int bc,int sc,int st) {
		for(int k = open;k < n; k++) {
			if(student[k].getreserve().equals("BC") && bc > 0) {
				System.out.println(student[k].print());
				bc--;
			}
			else if(student[k].getreserve().equals("SC") && sc > 0) {
				System.out.println(student[k].print());
				sc--;
			}
			else if(student[k].getreserve().equals("ST") && st > 0) {
				System.out.println(student[k].print());
				st--;
			}
		}
	}
}