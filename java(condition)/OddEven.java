//Write a Java program to check if the number is odd or even.

import java.util.Scanner;

public class OddEven{
public static void main(String args[]){

Scanner m=new Scanner(System.in);

System.out.println("enter a number");
int Num1= m.nextInt();

if(Num1 % 2== 0){
System.out.println("it is even");
}else{
System.out.println("it is odd");
}}}