/*Write a program that computes and displays the perimeter of a letter-
size (8.5 × 11 inches) sheet of paper and the length of its diagonal.*/

public class Ex2Perimeter{
public static void main(String args[]){

double length=8.5;
int breadth= 11;


int perimeter= 2 * ((int)length +breadth);
double diagonal= Math.sqrt(Math.pow(length,2)+ Math.pow(breadth,2));

System.out.println("the perimeter is:"+perimeter);
System.out.println("the length of the diagonal is:"+diagonal);
}}