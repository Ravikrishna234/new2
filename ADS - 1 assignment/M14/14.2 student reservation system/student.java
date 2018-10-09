/**STUDENT.**/
import java.util.Arrays;
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
class store {
	student[] student;
	int size;
	store() {
		student = new student[50];
		size = 0;
	}
	/**
	 * @param student value
	 * time complexity is O(1).
	 */
	public void addStudent(final student s) {
		student[size++] = s;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * time complexity is O(N^2).
	 */
	public void sort() {
        int n = size;
        for (int k = n/2; k >= 1; k--)
            sink(student, k, n);
        while (n > 1) {
            exch(student, 1, n--);
            sink(student, 1, n);
        }
    }
    /**
     * @param student [description]
     * @param pq student
     * @param c value
     * @param n value
     * time complexity is O(N).
     */
	 public void sink(final student[] pq, final int c, final int n) {
	 	int k = c;
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) j++;
            if (!less(pq, k, j)) break;
            exch (pq, k, j);
            k = j;
        }
    }
    /**
     * @param student value
     * @param i value
     * @param j value
     * @return value
     * time complexity is O(1).
     *
     */
    public boolean less(final student[] student, final int i, final int j) {
        return student[i - 1].compare(student[j - 1]) >= 0;
    }
    /**
     * @param team student
     * @param i value
     * @param loc value
     * time complexity is O(1).
     */
    public void exch(final student[] team, final int i, final int loc) {
        student swap = team[i - 1];
        team[i - 1] = team[loc - 1];
        team[loc - 1] = swap;
    }
    /**
     * @param arr value
     * @param val value
     * time complexity is O(N).
     * @return value
     */
    public boolean contains(final int[] arr, final int val) {
        for (int n : arr) {
            if (val == n) {
                return true;
            }
        }
        return false;
    }
	/**
	 * time complexity is O(N).
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < size - 1; i++) {
			s += student[i].getname() + "," + student[i].gettotal()
			+ "," + student[i].getreserve();
			s += "\n";
		}
		s += student[size - 1].getname() + "," + student[size - 1].gettotal()
		+ "," + student[size - 1].getreserve();
			return s;
	}
	/**
	 * time complexity is O(1).
	 * @param vacancy value
	 * @return value
	 */
	public String toString1(final int vacancy) {
		String s = "";
		for (int i = 0; i < vacancy - 1; i++) {
			s += student[i].getname() + "," + student[i].gettotal()
			+ "," + student[i].getreserve();
			s += "\n";
		}
		s += student[vacancy - 1].getname() + "," + student[vacancy - 1].gettotal()
		+ "," + student[vacancy - 1].getreserve();
			return s;
	}
	/**
	 * time complexity is O(1).
	 * @param open [description]
	 * @param n value
	 * @param bc value
	 * @param sc value
	 * @param st value
	 */
	public void getr(final int c,final int c1, final int c2, final int c3, final int c4) {
		int open = c;
		int n = c1;
		int bc = c2;
		int sc = c3;
		int st = c4;
		int[] array = new int[bc + sc + st];
        int i = 0;
		for (int k = open;k < n; k++) {
			if(bc > 0) {
			if (student[k].getreserve().equals("BC")) {
				array[i++] = k;
				bc--;
			}
		}  if(sc > 0) {
			if (student[k].getreserve().equals("SC")) {
				array[i++] = k;
				sc--;
			}
		}  if(st > 0) {
			 if (student[k].getreserve().equals("ST")) {
				array[i++] = k;
				st--;
			}
		}
		}
		if (bc > 0) {
            for (int k = open; k < n; k++) {
            if (student[k].getreserve().equals("Open") && bc > 0) {
                    if (!contains(array, k)) {
                        array[i++] = k;
                        bc--;
                    }
                }
            }
        }
        if (sc > 0) {
            for (int k = open; k < n; k++) {
            if (student[k].getreserve().equals("Open") && sc > 0) {
                    if (!contains(array, k)) {
                        array[i++] = k;
                        sc--;
                    }
                }
            }
        }
        if (st > 0) {
            for (int k = open; k < n; k++) {
            if (student[k].getreserve().equals("Open") && st > 0) {
                    if (!contains(array, k)) {
                        array[i++] = k;
                        st--;
                    }
                }
            }
        }
        Arrays.sort(array);
        for (int k = 0; k < array.length; k++) {
            System.out.println(student[array[k]].print());
        }
	}

}
