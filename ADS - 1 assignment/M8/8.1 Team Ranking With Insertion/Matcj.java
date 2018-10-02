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
	public String sort() {
		for(int i = 1; i < size; i++) {
			j = i+1;
			int value = team[i].compareTo(team[j]);
			while(j>=0 && value == -1) {
				if(a[j] < a[value]) {
					value = j;
				}
			}

		}
		}
	}