package CBS;

public class Anonymous_Class {

	public static void main(String[] args) {
		Anonymous_Class anonymous_Class = new Anonymous_Class();
		MyInnerClass myInnerClass = anonymous_Class.MyInnerClass();
		myInnerClass.show();
	}

	public Anonymous_Class() {
		System.out.println("��@�~�����O�غc�l�ԭz");
	}
	
	class MyInnerClass {
		public MyInnerClass() {
			System.out.println("��@�������O�غc�l�ԭz");
		}
		
		public void show() {
			System.out.println("�I�s�������Oshow()");
		}
	}
	
	public MyInnerClass MyInnerClass() {
		return new MyInnerClass() {
			public void show() {
				System.out.println("�I�s�����ΦW���Oshow()");
			}
		};
	}
}
