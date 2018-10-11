class Book {
	String name;
	String author;
	Float price;
	Book(String n,String author1, Float price1) {
		this.name = n;
		this.author = author1;
		this.price = price1;
	}
	public String getname() {
		return this.name;
	}
	public String getauthor() {
		return this.author;
	}
	public Float getprice() {
		return this.price;
	}
	public int compareTo(Book that) {
		if(this.getname().compareTo(that.getname()) > 0) {
			return 1;
		} else if(this.getname().compareTo(that.getname()) < 0) {
			return -1;
		} else if(this.getauthor().compareTo(that.getauthor()) < 0) {
			return -1;
		} else if(this.getauthor().compareTo(that.getauthor()) > 0) {
			return 1;
		} else if(this.getprice() > that.getprice()) {
			return 1;
		} else if(this.getprice() < that.getprice()) {
			return -1;
		} else {
			return 0;
		}
	}
}
