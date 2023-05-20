 //Write a Java program to check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class Check{
public static void main(String [] args){

Scanner nn=new Scanner(System.in);
 System.out.println("enter a number=");
int Num= nn.nextInt();
nn.close();

if(Num>=0){
System.out.println(Num +" "+"is positive");
}else if(Num==0){
System.out.println(Num + " "+" is zero");
}else{
System.out.println("its negative");
}}}


