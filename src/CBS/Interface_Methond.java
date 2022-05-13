package CBS;

public class Interface_Methond {

	public static void main(String[] args) {
		UserDB userDB = new UserDB();
		userDB.set("root", "123456");
		userDB.connect();
		userDB.show();
		
		countArea2 countArea;
		
		countArea = new square2();
		System.out.println("利用實作介面，計算正方形面積：" + countArea.getArea());
		
		countArea = new cube2();
		System.out.println("利用實作介面，計算正方體面積：" + countArea.getArea());
	}

}

interface SetLoginData{
	abstract void set(String acc,String pass);
}

interface ConnectDatabase{
	String ACCOUNT = "root";
	String PASSWORD = "123456";
	abstract void connect();
}

interface ShowResult{
	abstract void show();
}

class UserDB implements SetLoginData, ConnectDatabase, ShowResult{
	String userAccount, userPassword, resultMessage;

	public void show() {
		System.out.println(resultMessage);
	}

	public void connect() {
		if(userAccount == ACCOUNT && userPassword == PASSWORD) {
			resultMessage = "succees";
		}else {
			resultMessage = "failed";
		}
	}

	public void set(String acc, String pass) {
		userAccount = acc;
		userPassword = pass;
	}
	
}

interface countArea2{
	final double lenght = 12.5;
	public abstract double getArea();
}

class square2 implements countArea2{
	
	public double getArea() {
		System.out.println("square's getArea()");
		return lenght*lenght;
	}
	
}

class cube2 implements countArea2{

	public double getArea() {
		System.out.println("cube's getArea()");
		return lenght*lenght*6;
	}
	
}