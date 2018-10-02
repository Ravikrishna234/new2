class Team {
	String name;
	int win;
	int losse;
	int draw;
	Team(String name,String win,String l,String d) {
		this.name = name;
		this.win = Integer.parseInt(win);
		this.losse = Integer.parseInt(l);
		this.draw = Integer.parseInt(d);
	}
	public String getname() {
		return this.name;
	}
	public int getwins(){
		return this.win;
	}
	public int getlosse(){
		return this.losse;
	}
	public int getdraws() {
		return this.draw;
	}
	/**
	 * time complexity is O(1)
	 */
public int compareTo(Team that) {
		if(this.getwins() > that.getwins()) {
			return 1;
		}
		else if(this.getwins() < that.getwins()) {
			return -1;
		} else {
		if(this.getlosse() < that.getlosse()) {
			return 1;
		}
		else if(this.getlosse() > that.getlosse()) {
			return -1;
		} else {
		if(this.getdraws() < that.getdraws()) {
			return -1;
		} else if(this.getdraws() > that.getdraws()) {
			return 1;
		} else {
		return 0;
	}
}
	}
}
}