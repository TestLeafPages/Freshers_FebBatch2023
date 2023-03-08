package week3.day3;

public class ChangeOddIndexToUpperCase{

public static void main(String[] args){

//Pseudocode
//Declare the String as changeme
//output  cHaNgEmE

String value="changeme";
//Convert the String into Character
char[] charArray=value.toCharArray();
//Iterate the character from o to Array length
for(int i=0;i<charArray.length;i++){
//to check if it is odd Index
if(i%2==1){
//to change the odd index to uppercase
char oddIndex=Character.toUpperCase(charArray[i]);
System.out.print(oddIndex);
}else{
//print the character
System.out.print(charArray[i]);
}
}
}
}
