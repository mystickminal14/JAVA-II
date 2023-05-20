//This program find greatest number among 3 numbers.
import java.util.Scanner;
public class GreatestNo{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter your first number");
int Num1=sc.nextInt();

System.out.println("enetr your second number");
int Num2=sc.nextInt();

System.out.println("enter your third number");
int Num3=sc.nextInt();

if( Num1>Num2 && Num1>Num3){
System.out.println("Num1 is greater than num2 and num3");

}else if(Num2>Num1 && Num2>Num3){
System.out.println("Num2 is greater than num 1 and num 3");
}else{
System.out.println("Num3 is gretest");
}}}