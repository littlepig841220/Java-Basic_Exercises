package CBS;

public class Do_While {

	public static void main(String[] args) {
		int i = 0;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("The while loop 1 is finish");
		
		int n = 0;
		while(true) {
			System.out.println(n);
			n++;
			
			if(n == 10) {
				break;
			}
		}
		System.out.println("The while loop 2 is finish");
		
		int x = 0;
		do {
			System.out.println(x);
			x++;
		}while(x <= 10);
		System.out.println("The do-while loop is finish");
	}
}
