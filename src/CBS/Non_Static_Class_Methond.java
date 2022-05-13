package CBS;

public class Non_Static_Class_Methond {

	public static void main(String[] args) {
		Non_Static_Class_Methond static_Class_Methond = new Non_Static_Class_Methond();
		static_Class_Methond.implementInnerClass();
	}

	public Non_Static_Class_Methond(){
		System.out.println("Main class");
	}
	
	class InnerClass{
		public InnerClass() {
			System.out.println("non-static Inner class");
		}
	}
	
	public InnerClass implementInnerClass() {
		return new InnerClass();
	}
}
