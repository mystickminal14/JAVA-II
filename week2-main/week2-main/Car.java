/*Write a program that helps a person decide whether to buy a car. Your

program’s inputs should be:
 The cost of a new car
 The estimated miles driven per year
 The estimated petrol price
 The efficiency in miles per gallon
 The estimated resale value after 5 years
Compute the total cost of owning the car for five years. (For simplicity,
we will not take the cost of financing into account.) Obtain realistic
prices for a new and used car from the Internet. Run your program
using today’s petrol price and 15,000 miles per year.*/


//main method lai call call garera program lekhxu
import java.util.Scanner;
public class Car{
public static void lets(){

Scanner mm=new Scanner(System.in);

System.out.println("enter cost of a new car :");
double carPrice= mm.nextDouble();

final int MILES_PERYEAR=15000;
final int PETROL_PRICE=178;
 System.out.println("MPG :");
double efficiency= mm.nextDouble();


System.out.println("estimated resale :");
double resale= mm.nextDouble();

double petrolCost=(MILES_PERYEAR/ efficiency)*5;
double totalcost= carPrice+ petrolCost- resale;

if(totalcost<0){
System.out.println("buy this car");
}else{
System.out.println("dont by this car baka");
}
}
public static void main(String [] args){
lets();
}}






