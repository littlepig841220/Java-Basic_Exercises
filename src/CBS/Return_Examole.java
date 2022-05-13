package CBS;

public class Return_Examole {

	public static void main(String[] args) {
		int ans;
		ans = sum(10);
		System.out.print(ans);
	}
	
	private static int sum(int n) {
		int sum = 0;
		for(int i = 1;i <= n;i++) {
			sum = sum + i;
		}
		return sum;
	}
}
