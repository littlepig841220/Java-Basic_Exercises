package CBS;

public class Break_Example {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Break out from single loop");
		for(i = 1;i <= 10;i++) {
			for(j = 1;j <= i;j++) {
				if(j == 5) {
					break;
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
						break out1;
					}
					System.out.print(j);
				}
				System.out.println();
			}
	}

}
