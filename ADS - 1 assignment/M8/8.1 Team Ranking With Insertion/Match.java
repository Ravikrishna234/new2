import java.util.Arrays;
class Match {
	Team[] team;
	int size;
	Match() {
		team = new Team[20];
		size = 0;
	}
	public void addteam(Team t) {
		if(size == team.length) {
			resize();
		}
		team[size++] = t;
	}
	public void resize() {
		team = Arrays.copyOf(team,team.length * 2);
	}
	public void selectionsort() {
		int loc;
		for(int i = 0; i < size - 1; i++) {
			loc = i;
			for(int j = i + 1; j < size; j++) {
				if((team[j].compareTo(team[loc])) >= 0) {
					loc = j;
				}
			}
				Team temp = team[loc];
				team[loc] = team[i];
				team[i] = temp;
		}
	}
	public String toString() {
		String str = "";
		for(int i = 0; i < size - 1; i++) {
			str += team[i].getname() + ",";
		}
		 str = str + team[size - 1].getname();
		 return str;
	}
}