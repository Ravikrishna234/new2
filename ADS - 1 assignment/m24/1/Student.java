class Student{
	int rollno;
	String name;
	Double marks;
	Student(String name1, Double marks1){
		//this.rollno =roll;
		this.name = name1;
		this.marks = marks1;
	}
	// public int getrollno() {
	// 	return this.rollno;
	// }
	public String getname() {
		return this.name;
	}
	public Double getmarks1() {
		return this.marks;
	}
	public String toString() {
		return this.getname() + "==" + this.getmarks1();
	}

}
