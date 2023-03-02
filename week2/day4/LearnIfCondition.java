package week2.day4;

public class LearnIfCondition {
public static void main(String[] args) {
	int a=10;
	if (0>a) {
		System.out.println("A is biggest value than 0");
	}
	int b=20;
	//if the condition is match ,if block execute
	if(a>b) {
		System.out.println("b");
		//if not matched else block execute
	}else {
		System.out.println("Condition is wrong");
	}
}
}
