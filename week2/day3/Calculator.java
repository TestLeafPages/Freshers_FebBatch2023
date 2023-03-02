package week2.day3;

public class Calculator {
	public int addTwoNumber(int a,int b) {
		//int a=10;
		//int b=20;//Code reusability code optimization 
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public int subTwoNumber(int a,int b) {
		//int a=10;
		//int b=20;//Code reusability code optimization 
		int c=a+b;
		//System.out.println(c);
		return c;
	}
public static void main(String[] args) {
	Calculator calc=new Calculator();
	int totol = calc.addTwoNumber(100,200);
	System.out.println(totol);
}
}
