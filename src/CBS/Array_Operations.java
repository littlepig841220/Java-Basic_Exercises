package CBS;

import java.util.Arrays;

public class Array_Operations {

	public static void main(String[] args) {
		int A[] = {2,4,6,8,20,12};
		
		/* Array reset */
		int[] B;
		System.out.println("Show the array element before reset");
		for(int a:A) {
			System.out.print(a + " ");
		}
		
		System.out.println("\nShow the array element after reset");
		B = new int[A.length + 1];
		for(int b:B) {
			System.out.print(b + " ");
		}
		
		System.out.println("\nUse fill method to reset a array");
		Arrays.fill(B, 5);
		for(int b2:B) {
			System.out.print(b2 + " ");
		}
		
		/* Array copy */
		int[] C = new int[6];
		System.out.println("\nUse traditional method to copy a array");
		for(int i = 0;i < A.length;i++) {
			C[i] = A[i];
			System.out.print(C[i] + " ");
		}
		
		System.out.println("\nUse clone method to copy a array");
		int D[] = A.clone();
		for(int x:D) {
			System.out.print(x + " ");
		}
		
		System.out.println("\nUse arraycopy method to copy a array");
		int E[] = new int[6];
		System.arraycopy(A, 0, E, 0, 5);
		for(int n:E) {
			System.out.print(n + " ");
		}
		
		/* Array search */
		System.out.println("\nBefore use binarySearch method to find a element(12), use sort method first");
		Arrays.sort(D);
		for(int m:D) {
			System.out.print(m + " ");
		}
		System.out.print("result:" + Arrays.binarySearch(D, 12));
		
		System.out.println("\nUse eaqals method to find a element(12)");
		System.out.print(Arrays.equals(A, 0, 0, B, 0, 0));//(array1,start,end,array2,start,end)
		
	}

}
