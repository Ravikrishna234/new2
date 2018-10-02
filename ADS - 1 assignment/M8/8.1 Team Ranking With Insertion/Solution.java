import java.util.Scanner;
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
class Solution {
	public static void main(String[] args) {
		Match m = new Match();
		Scanner s = new Scanner(System.in);
		int i = 0;
		while(i < 7) {
			String[] tokens = s.nextLine().split(",");
			Team t = new Team(tokens[0],tokens[1],tokens[2],tokens[3]);
			m.addteam(t);
			i++;
		}
		m.selectionsort();
		System.out.println(m);
	}
}
