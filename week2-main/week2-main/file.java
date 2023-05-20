/*Write a program that prompts the user for the drive letter (C), the path
(\Windows\System), the file name (Readme), and the extension (txt).
Then print the complete file name C:\Windows\System\Readme.txt.*/

import java.util.Scanner;
public class file{
public static void main(String [] args){

Scanner nn=new Scanner(System.in);

System.out.println("enter drive letter ");
String dei= nn.nextLine();


System.out.println("enter path :");
String m= nn.nextLine();


System.out.println("enter file name  : ");
String j= nn.nextLine();


System.out.println("enter extension  :");
String k= nn.nextLine();

System.out.println(dei + ":" + m + "\\" + j + "." + k);
}}

