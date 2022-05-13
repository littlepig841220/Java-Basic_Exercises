package CBS;

public class Override extends SuperClass4{

	public static void main(String[] args) {
		Override override = new Override();
		override.Accounting(12, 36, 60);
		override.Accounting(7, 5);
	}
	
	public void Accounting(int x,int y, int z) {
		int total = x + y + z;
		System.out.println("這是由衍生類別多載的Accounting()方法");
		System.out.println(x + "+" + y + "+" + z + "/3 = " + total);
	}
	
	public void Accounting(int x,int y) {
		int total = x * y;
		System.out.println("這是由衍生類別重載的Accounting()方法");
		System.out.println(x + "*" + y + " = " + total);
	}
}

class SuperClass4{
	public void Accounting(int x,int y) {
		int total = x * y;
	}
}
