/*Write a program that prompts the user for a radius and then prints:
 The area and circumference of a circle with that radius
 The volume and surface area of a sphere with that radius*/


import java.util.Scanner;

public class AreaCircum{
public static void main (String args[]){
Scanner sc= new Scanner(System.in);

System.out.println("radius");
int radius = sc.nextInt();
final double PI=3.14;

//calculate area and circumference
double area= PI * Math.pow(radius,2);
double circumference=2* PI *radius;

//calculate volume
double volOfSphere=(4/3)* PI * Math.pow(radius,3);
double surfacearea= 4* PI* Math.pow(radius,2);

System.out.println("the area of circle  :"+area);
System.out.println("the area of circle  :"+circumference);
System.out.println("the area of circle  :"+volOfSphere);
System.out.println("the area of circle  :"+surfacearea);
}}



