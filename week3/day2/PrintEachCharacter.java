package week3.day2;

public class PrintEachCharacter{

	public static void main(String[] args){
		//Declare a String
		String text ="testleaf";
		//[t,e,s,t,l,e,a,f]
		//Convert String into character Array
		char[] characters= text.toCharArray();
		//Iterate the values from 0 to Array length
		for(int i=0;i<characters.length;i++){
			//Print each character
			System.out.println(characters[i]);

		}
	}
}