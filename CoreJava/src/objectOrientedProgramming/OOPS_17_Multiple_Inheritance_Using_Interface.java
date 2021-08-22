package objectOrientedProgramming;
interface GPS{
	void getLocation(String location);
}

interface Camera{
	void takePicture();
}

interface MusicPlayer{
	void playMusic(String song);
}

class Phone{
	
	public void callNumber(String number) {
		System.out.println("Calling " + number);
	}
	
	public void receiveCall(String number) {
		System.out.println("Receiving call from " + number);
	}
}

class SmartPhone extends Phone implements Camera,GPS,MusicPlayer{
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

public class OOPS_17_Multiple_Inheritance_Using_Interface {
	public static void main(String[] args) {
		SmartPhone samsung = new SmartPhone();
		samsung.getLocation("SadaChand");
		samsung.playMusic("Boro loker beti");
		samsung.takePicture();
		samsung.callNumber("8714642539");
		samsung.receiveCall("1234567890");
	}
}
