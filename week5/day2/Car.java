package week5.day2;

public class Car extends Vehicle {
public void switchOnAC() {
	System.out.println("Switch on AC");
}
public static void main(String[] args) {
	Car car=new Car();
	car.switchOnAC();
	car.applyBreak();
}
}
