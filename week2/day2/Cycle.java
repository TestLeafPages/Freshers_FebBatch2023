package week2.day2;

public class Cycle {
	
	String cycleBrandName="Hercules";
	int numOfWheels=2;
	boolean cycleIsPunctured=false;
	char cycleFirstLetter='H';
	short noOfBell=1;
	double cyclePrice=365.2652;
	
	public void soundHorn(){
	System.out.println("Sound Horn");
	}
	public void applyBreak() {
		System.out.println("Apply Break");
		
	}
	public void changeGear() {
		System.out.println("changeGear");
		
	}
	public void changeSpeed() {
		System.out.println("changeGear");
		
	}
	public static void main(String[] args) {
		Cycle myCycle=new Cycle();
			myCycle.soundHorn();
			myCycle.applyBreak();
			myCycle.changeGear();
			myCycle.changeSpeed();
			String name="Test";
			System.out.println(name);
		
		
	}
	

}
