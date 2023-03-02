package week2.day3;

public class Calculator2 {
	public int addTwoNumber(int a,int b) {
		int c=a+b;
		
		return c;
	}
	public void subTwoNumber(int sum,int b) {
		int c=sum-b;
		System.out.println(c);
	}
public static void main(String[] args) {
	Calculator2 calc=new Calculator2();
	int sum = calc.addTwoNumber(100, 100);
	System.out.println(sum);
	calc.subTwoNumber(sum,20);
}
}
