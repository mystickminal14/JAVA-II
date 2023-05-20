/*Write a Java program to check whether a number is positive, negative, or zero.*/
import java.util.Scanner;
public class Posnegzero{
public static void main(String [] args){

Scanner a= new Scanner(System.in);

System.out.println("enter a number:");

int num= a.nextInt();
if(num>=1) {
System.out.println("it is positive");
}else if(num<=1){
System.out.println("it is negative");
}else if(num==0){
System.out.println("zero");
}else{
System.out.println("not defined");
}
System.out.println("THANKK YOU");
}}