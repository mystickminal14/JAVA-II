/*Write a program that prompts the user for a measurement in metres and

then converts it to miles, feet and inches.*/

import java.util.Scanner;
public class measure{
public static void main(String []args){

Scanner ss=new Scanner(System.in);
System.out.println("enter a number ");
double lio=ss.nextInt();

double miles = metres * 0.000621371;
    double feet = metres * 3.28084;
    double inches = feet * 12;

    System.out.println(metres + " metres is equivalent to " + miles + " miles, " + feet + " feet, or " + inches + " inches.");
  }
}