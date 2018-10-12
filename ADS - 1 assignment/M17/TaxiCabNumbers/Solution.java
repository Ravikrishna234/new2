import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Minpq<Taxicab> pq = new Minpq<Taxicab>();
		String[] tokens = s.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int n1 = Integer.parseInt(tokens[1]);
		//taxicab(n1);
		for(int i = 1; i <= 1000; i++) {
			Taxicab tc = new Taxicab(i,i);
			pq.insert(tc);
		}
		int i = 1;
		//Taxicab old1 = new Taxicab(0,0);

		long count = -1;
		int cnt = 1;
		int numcount = 0;
		while(!pq.isEmpty()) {
			Taxicab new1 = pq.delMin();
				if(count == new1.getsum()) {
					//System.out.println(new1);
					//break;
					cnt++;
				} else {
					cnt = 0;
				}
				if(cnt == n1 - 1) {
					numcount++;
					if(numcount == n) {
						System.out.println(new1.getsum());
					}
				}
				count = new1.getsum();
			//System.out.println(new1);
			if(new1.getj() < 1000) {
				Taxicab tac = new Taxicab(new1.geti(), new1.getj() + 1);
				pq.insert(tac);
			}

}
}
}
