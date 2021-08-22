package objectOrientedProgramming;
interface GPS1{
	void getLocation(String location);
}

interface Camera1{
	void takePicture();
}

interface MusicPlayer1{
	void playMusic(String song);
}

class Phone1{
	public void callNumber(String number) {
		System.out.println("Calling " + number);
	}
	
	public void receiveCall(String number) {
		System.out.println("Receiving call from " + number);
	}
}

class SmartPhone1 extends Phone1 implements Camera1,GPS1,MusicPlayer1{
	@Override
	public void getLocation(String location) {
		System.out.println("Fetching location " + location);
	}
	
	@Override
	public void takePicture() {
		System.out.println("Taking a picture");
	}
	
	@Override
	public void playMusic(String song) {
		System.out.println("Playing " + song);
	}
}


public class OOPS_18_Polymorphism_in_Interfaces {
	public static void main(String[] args) {
		SmartPhone1 sm = new SmartPhone1();
		
		sm.callNumber("1234567890");
		sm.receiveCall("1234567890");
		sm.takePicture();
		sm.getLocation("Dumdum");
		sm.playMusic("Blue Eyes");
		
		GPS1 sm1 = new SmartPhone1();
		sm1.getLocation("Nagerbazar");
		// sm1.takePicture(); --> Error
		// sm1.playMusic("ABC");  --> Error
		// sm1.callNumber("1234567890")  --> Error
		
		
	}
}
