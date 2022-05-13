package CBS;

public class Abstract_Methond {

	public static void main(String[] args) {
		RemoteControl2 remoteControl;
		
		remoteControl = new TV2();
		remoteControl.powerOn();

		remoteControl = new AirConditioner2();
		remoteControl.powerOn();
		
		square square = new square(12.5);
		cube cube = new cube(12.5);
		System.out.println("利用抽象方法，計算正方形面積：" + square.getArea());
		System.out.println("利用抽象方法，計算正方體面積：" + cube.getArea());
		
		countArea countArea;
		
		countArea = new square(12.5);
		System.out.println("利用抽象方法，計算正方形面積：" + countArea.getArea());
		
		countArea = new cube(12.5);
	}

}

abstract class RemoteControl2{
	public RemoteControl2() {
		System.out.println("使用萬能遙控器：");
	}
	public void powerOn() {
		
	}
}

abstract class countArea {
	protected double lenght;
	public countArea(double x) {
		lenght = x;
	}
	abstract double getArea();
}

class TV2 extends RemoteControl2{
	public void powerOn() {
		System.out.println("Open the TV");
	}
}

class AirConditioner2 extends RemoteControl2{
	public void powerOn() {
		System.out.println("Open the air conditioner");
	}
}

class square extends countArea{
	square(double x) {
		super(x);
	}
	
	double getArea() {
		return lenght*lenght;
	}
}

class cube extends countArea{
	cube(double x) {
		super(x);
	}

	double getArea() {
		return lenght*lenght*6;
	}
}