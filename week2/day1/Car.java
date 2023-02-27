package week2.day1;

public class Car {

	public  void driveCar() {
		System.out.println(" driveCar ");
		
	}
	public  void switchOnAc() {
		System.out.println("switchOnAc");
	}
	
	public  void applyBreak() {
		System.out.println("applyBreak");
	}
	public  void pressSoundHorn() {
		System.out.println("pressSoundHorn");
	}
	public static void main(String[] args) {
		//ClassName objectName =new ClassName();
		
		Car myCar=new Car();
		myCar.driveCar();
		myCar.pressSoundHorn();
		myCar.applyBreak();
		myCar.switchOnAc();
		
		
		
		
	}
}
