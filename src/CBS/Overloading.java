package CBS;

public class Overloading extends SuperClass{

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.totalAverage(64, 48);
		overloading.totalAverage(32, 24, 58);
	}

	public void totalAverage(int x,int y,int z) {
		int total = (x + y + z)/3;
		System.out.println("這是由衍生類別多載的totalAverage()方法");
		System.out.println(x + "+" + y + "+" + z + "/3 = " + total);
	}
}

class SuperClass{
	public void totalAverage(int x,int y) {
		int total = (x + y)/2;
		System.out.println("這是繼盛於基礎類別的totalAverage()方法");
		System.out.println(x + "+" + y + "/3 = " + total);
	}
}
