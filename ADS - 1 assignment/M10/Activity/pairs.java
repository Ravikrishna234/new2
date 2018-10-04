import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String res = pairs(str);
		System.out.println(res);
	}
	public static String pairs(String str) {
	if(str.length() <= 1) {
	return str;
	}
	else {
	if(str.charAt(0) == str.charAt(1)) {
	return str.charAt(0)  + "*" + pairs(str.substring(1));
	}

	}
	return str.charAt(0) + pairs(str.substring(1));
	}
}