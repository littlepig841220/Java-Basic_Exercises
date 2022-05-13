package CBS;

public class Extends_Method extends Accounting{

	public static void main(String[] args) {
		Extends_Method myobject = new Extends_Method();
		plus(100,30);
		myobject.times(100, 30);
		myobject.divided(100, 30);
		minus(100,30);
	}
	
	public static void minus(int x,int y) {
		int total = x - y;
		System.out.println("x-y=" + total);
	}
	
	public void divided(int x,int y) {
		int total = x / y;
		System.out.println("x/y" + total);
	}
}

class Accounting{
	public static void plus(int x,int y) {
		int total = x + y;
		System.out.println("x+y=" + total);
	}
	
	public void times(int x,int y) {
		int total = x * y;
		System.out.println("x*y=" + total);
	}
}
