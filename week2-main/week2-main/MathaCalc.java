/*Write a program that prompts the user for two integers and then prints:

 The sum
 The difference
 The product
 The average
 The distance (absolute value of the difference)
 The maximum (the larger of the two)
 The minimum (the smaller of the two)
Hint: The max and min functions are declared in the Math class.*/

//yo program ma malai main method lai call garnu thyo tei vara maile yo upayog gare, normal way  ma ni garna sakinxa
import java.util.Scanner;
public class MathaCalc{
public static void cal(){

Scanner sc= new Scanner(System.in);

System.out.println("enter a nnumber=");
int num1= sc.nextInt();

System.out.println("enter 2nd nnumber=");
int num2= sc.nextInt();

int sum= num1+ num2;
int difference= num1-num2;
int product= num1*num2;
int average= sum/2;

//Math.abs returs the absoulyte value.
int absoulute= Math.abs(difference);

int maximum= Math.max(num1,num2);
int minimum= Math.min(num1,num2);

System.out.println("sum  :"+ sum);

System.out.println("difference  :"+ difference);

System.out.println("the product  :"+ product);

System.out.println("average  :"+ average);

System.out.println("absoulute value  :"+ absoulute);

System.out.println("maximum value  :"+ maximum);

System.out.println("minimum  :"+ minimum);
}
public static void main(String [] args){
cal();
}}
