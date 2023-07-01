import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt();
			int copyX = x, copyY = y;
			int ans = 500 - 2 * x + 1000 - 4 * (y + x);
			ans = Math.max(ans, 1000 - 4 * y + 500 - 2 * (x + y));
			System.out.println(ans);
		}
		fs.close();
	}
}
