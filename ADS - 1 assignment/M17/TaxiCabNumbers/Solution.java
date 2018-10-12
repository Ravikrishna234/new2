import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Minpq<Taxicab> pq = new Minpq<Taxicab>();
		String[] tokens = s.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int n1 = Integer.parseInt(tokens[1]);
		//taxicab(n1);
		for(int i = 1; i <= 600; i++) {
			Taxicab tc = new Taxicab(i,i);
			pq.insert(tc);
		}
		int i = 1;
		Taxicab old1 = new Taxicab(0,0);

		int count = 0;
		while(!pq.isEmpty()) {
			Taxicab new1 = pq.delMin();
			if(old1.getsum() == new1.getsum()) {

				count++;
				i++;
				if(count == n) {
					System.out.println(new1);
					break;
				}
			}

			// else if(i > 1) {
			// 	i = 1;
			// }
			old1 = new1;
			//System.out.println(new1);
			if(new1.getj() < 600) {
				Taxicab tac = new Taxicab(new1.geti(), new1.getj() + 1);
				pq.insert(tac);
			}
		}
	}

}