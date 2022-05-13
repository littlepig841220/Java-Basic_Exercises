package CBS;

public class Continue_Example {

	public static void main(String[] args) {
		int i,j;
		System.out.println("jump out and continue from statement");
		for(i = 1;i <= 10;i++) {
			for(j = 1;j <= i;j++) {
				if(j == 5) {
					continue;
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("\nBreak out from multiple loop");
		out1:
			for(i = 1;i <= 10;i++) {
				for(j = 1;j <= i;j++) {
					if(j == 5) {
						continue out1;
					}
					System.out.print(j);
				}
				System.out.println();
			}
	}

}
