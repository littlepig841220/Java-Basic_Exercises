package CBS;

public class polymorphism {

	public static void main(String[] args) {
		RemoteControl remoteControl;
		
		remoteControl = new TV();
		remoteControl.powerOn();

		remoteControl = new AirConditioner();
		remoteControl.powerOn();
	}

}

class RemoteControl{
	public RemoteControl() {
		System.out.println("使用萬能遙控器：");
	}
	public void powerOn() {
		
	}
}

class TV extends RemoteControl{
	public void powerOn() {
		System.out.println("Open the TV");
	}
}

class AirConditioner extends RemoteControl{
	public void powerOn() {
		System.out.println("Open the air conditioner");
	}
}