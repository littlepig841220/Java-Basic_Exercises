package CBS;

public class Sub_interface_Methond {

	public static void main(String[] args) {
		cube4 cube = new cube4();
		
		System.out.println("利用子介面方法，計算正方形面積：" + cube.getArea());
		System.out.println("利用子介面方法，計算正方形體積：" + cube.getVolume());
	}

}

interface countArea3{
	final double lenght = 12.5;
	public abstract double getArea();
}

interface countVolume extends countArea3{
	public abstract double getVolume();
}

class cube4 implements countVolume{

	public double getArea() {
		System.out.println("cube's getArea()");
		return lenght*lenght*6;
	}

	public double getVolume() {
		System.out.println("cube's getVolume");
		return lenght*lenght*lenght;
	}
	
}