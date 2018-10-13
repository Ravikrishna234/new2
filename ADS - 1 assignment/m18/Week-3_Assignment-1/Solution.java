import java.util.Scanner;
class Solution{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		Binarysearch bs = new Binarysearch();
		Minpq min = new Minpq();
			Maxpq max = new Maxpq();
		for(int i = 0; i <6;i++) {
			for(int j = 0;j <n;j++) {
			String[] tokens = s.nextLine().split(",");
			stock stck = new stock(tokens[0],Float.parseFloat(tokens[1]));
			min.insert(stck);
			max.insert(stck);
			}
		Minpq mini = new Minpq();
			Maxpq maxu = new Maxpq();
		for(int l = 0; l < 5; l++) {
			maxu.insert(max.delMax());
		}
		//System.out.println();
		for(int h = 0; h < 5;h++) {
			mini.insert(min.delMin());
		}
		//System.out.println();
		System.out.println(mini);
		System.out.println();
		System.out.println(maxu);
		System.out.println();
	}


	}
}