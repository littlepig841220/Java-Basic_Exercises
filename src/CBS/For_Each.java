package CBS;

public class For_Each {

	public static void main(String[] args) {
		char test[] = {'H','A','P','P','Y'};
		
		for(int i = 0;i < test.length;i++) {//Use traditional method to read a array
			System.out.print(test[i]);
		}
		
		System.out.println("");

		for(char i : test) {//Use for-each method to read a array
			System.out.print(i);
		}
	}
}
