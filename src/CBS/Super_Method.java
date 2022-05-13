package CBS;

public class Super_Method extends SuperClass2{

	public static void main(String[] args) {
		Super_Method super_Method = new Super_Method();
		super_Method.showData();
		super_Method.doSuper();
	}

	public void showData() {
		System.out.println("這是由衍生類別重載的showData()方法");
	}
	
	public void doSuper() {
		super.ShowData();
	}
}

class SuperClass2 {
	public void ShowData() {
		System.out.println("這是基礎類別的showData()方法");
	}
}