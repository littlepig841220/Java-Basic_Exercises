package CBS;

public class Insert_Sort {

	public static void main(String[] args) {
		int i,j,tmp;
		int data[] = {6,5,9,7,2,8};
		
		System.out.println("The Insert Sort");
		System.out.println("Originally:");
		showdata(data);
		
		for(i = 1;i < data.length;i++) {
			tmp = data[i];
			j = i -1;
			while(j >= 0 && tmp < data[j]) {
				data[j +1] = data[j];
				j--;
			}
			data[j + 1] = tmp;
			System.out.print("The " + i + " time(s) sortting is ");
			showdata(data);
		}
		
		System.out.println("\nAfter sorting:");
		showdata(data);
	}
	
	static void showdata(int[] data) {
		for(int x:data) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
