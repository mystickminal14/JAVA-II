// Write a Java program to check whether a character is a vowel or consonant.

import java.util.Scanner;

public class VowelConsonant{
public static void main(String[] args){

Scanner min= new Scanner(System.in);

System.out.println("enter a letter");
String Letter= min.nextLine();
min.close();
String lowercase, uppercase;

lowercase= (Letter =='a' || Letter =='e' || Letter =='i' || Letter =='o'|| Letter =='u');
uppercase=  (Letter=='A' || Letter =='E' || Letter =='I' || Letter =='O' || Letter =='U');

if( lowercase && uppercase){
System.out.println("the given letter is vowel");

}else{
System.out.println("the given letter is consonant");
}}}