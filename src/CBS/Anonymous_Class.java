package CBS;

public class Anonymous_Class {

	public static void main(String[] args) {
		Anonymous_Class anonymous_Class = new Anonymous_Class();
		MyInnerClass myInnerClass = anonymous_Class.MyInnerClass();
		myInnerClass.show();
	}

	public Anonymous_Class() {
		System.out.println("實作外部類別建構子敘述");
	}
	
	class MyInnerClass {
		public MyInnerClass() {
			System.out.println("實作內部類別建構子敘述");
		}
		
		public void show() {
			System.out.println("呼叫內部類別show()");
		}
	}
	
	public MyInnerClass MyInnerClass() {
		return new MyInnerClass() {
			public void show() {
				System.out.println("呼叫內部匿名類別show()");
			}
		};
	}
}
