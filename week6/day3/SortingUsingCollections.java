package week6.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {
public static void main(String[] args) {

	// Declare a String array 
	String[] company= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
	
	//Declare a empty List
	List<String> companyList=new ArrayList<String>();
	
	//iterate the values from String array
	for (int i = 0; i < company.length; i++) {
		companyList.add(company[i]);
	}
	System.out.println(companyList);
	
	Collections.sort(companyList);
	
	System.out.println(companyList);
	
	Collections.reverse(companyList);
	
	System.out.println(companyList);
		
	// Required Output: Wipro, HCL , CTS, Aspire Systems

}
}
