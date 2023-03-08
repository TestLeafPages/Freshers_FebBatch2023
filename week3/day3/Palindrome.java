package week3.day3;

public  class Palindrome{
public static void main(String[] args){
//Declare the String as madam
String text="madam";

//declare the empty String 
String rev="";

//Convert the String into character Array
char[] charArray=text.toCharArray();

//Iterate the loop using reverse for loop
for(int i=charArray.length-1;i>=0;i--){


//store the iterating values in rev String
rev=rev+charArray[i];
}
System.out.println(rev);

//Compare both String are equal
if(text.equals(rev)){
//if it is match the given String is plindrome
System.out.println("The Given String is Palindrome");
}else{
//If not the given String is not palindrome
System.out.println("The Given String is not Palindrome");
}
}
}
