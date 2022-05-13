package CBS;

public class Bubble_Sort {

	public static void main(String[] args) {
		int i,j,tmp;
		int data[] = {6,5,9,7,2,8};
		
		System.out.println("The Bubble Sort");
		System.out.println("Originally:");
		for(int x:data) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		for(i = data.length - 1;i > 0;i--) {
			for(j = 0;j < i;j++) {
				if(data[j] > data[j + 1]) {
					tmp = data[j];
					data[j] = data[j + 1];
					data [j +1] = tmp;
				}
			}
			
			System.out.print("The " + (data.length - i) + " time(s) sortting is ");
			for(int x:data) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nAfter sorting:");
		for(int x:data) {
			System.out.print(x + " ");
		}
	}

}
