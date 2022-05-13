package CBS;

public class Static_Class_Methond {

	public static void main(String[] args) {
		new Static_Class_Methond();
		new InnerClass();
	}

	public Static_Class_Methond() {
		System.out.println("main");
	}
	
	static class InnerClass{
		public InnerClass() {
			System.out.println("static inner class");
		}
	}
}
