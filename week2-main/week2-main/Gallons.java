/*Write a program that asks the user to input:
 The number of gallons of gas in the tank
 The fuel efficiency in miles per gallon
 The price of gas per gallon
Then print the cost per 100 miles and how far the car can go with the
gas in the tank.*/

import java.util.Scanner;
public class Gallons{
public static void main(String [] args){

Scanner mm=new Scanner(System.in);

System.out.println("no. of gallons of gas in tank :");
double gal= mm.nextDouble();

System.out.println("fuel effieciency :");
double fue= mm.nextDouble();

System.out.println("price of gas :");
double gas= mm.nextDouble();
double costPer100Miles = (gas * 100) / fue;
System.out.println("The cost per 100 miles is: $" + costPer100Miles);

double distance = gal * fue;
System.out.println("The car can go: " + distance + " miles with the gas in the tank.");
}}




