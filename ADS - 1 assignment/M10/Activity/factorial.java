import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int res = factorial(n);
		System.out.println(res);
	}
	public static int factorial(int n) {
	int fact = 1;
	if(n == 0) {
	return 1;
	}
	if(n == 1) {
	return 1;
	}
	 return fact = n * factorial(n - 1);
	}
}