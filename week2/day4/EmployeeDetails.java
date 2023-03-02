package week2.day4;

public class EmployeeDetails {
	public void getEmployeeName (String empName, int empId) {
		System.out.println(empName+" "+empId);
		
	}
	public void getEmployeeAddress (String empAddress)	{
		System.out.println(empAddress);
	}
	public void printEmployeeSalary(double empSalary)	{
		System.out.println(empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum)	{
		System.out.println(mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.getEmployeeName("TestLeaf", 101);
		emp.getEmployeeAddress("Chennai");
		emp.printEmployeeSalary(25.09322);
		emp.printEmployeeMobileNumber(8978347598732432L);
	}
	

}
