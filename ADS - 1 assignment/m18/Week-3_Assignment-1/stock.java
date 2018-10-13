class stock implements Comparable<stock>{
	String name;
	Float change;
	stock(String n, Float c) {
		this.name = n;
		this.change = c;
	}
	public String getname(){
		return this.name;
	}
	public Float getchange() {
		return this.change;
	}
	public int compareTo(stock that){
		if(this.getchange() > that.getchange()) {
			return 1;
		} else if(this.getchange() < that.getchange()) {
			return -1;
		} else if(this.getname().compareTo(that.getname()) > 0) {
			return 1;
		} else if(this.getname().compareTo(that.getname()) < 0) {
			return -1;
		} else {
			return 0;
		}

	}
	public String toString() {
		return this.getname() + " " + this.getchange();
	}
}