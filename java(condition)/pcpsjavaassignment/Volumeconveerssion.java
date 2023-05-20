/*
  Student name: Minal Pariyar
  Date: 01/28/2023
  Program description: Converts gallons to liters
 */
import java.util.Scanner;
public class Volumeconveerssion{
public static void main(String [] args){

Scanner col=new Scanner(System.in);
System.out.println("enter gallons=");
double gallons=col.nextDouble();
  final double CONVERSIONFACTOR = 3.7854;
double liters = gallons * CONVERSIONFACTOR;

     
        System.out.println("the conversion of gallons to litre is "+litres);
}}