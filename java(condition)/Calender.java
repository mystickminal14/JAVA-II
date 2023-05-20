//This program prints the month name according to the number.
import java.util.Scanner;
public class Calender{
public static void main(String[] args){

Scanner c= new Scanner(System.in);

System.out.println("enter number from 1 to 12");
int Num= c.nextInt();

if(Num==1) {
System.out.println("Its the first month-JANARARY");
}else if(Num==2) {
System.out.println("Its FEBURARY");
}else if(Num==3) {
System.out.println("Its MARCH");
}else if(Num==4) {
System.out.println("Its APRIL");
}else if(Num==5) {
System.out.println("Its MAY");
}else if(Num==6) {
System.out.println("its june");
}else if(Num==7) {
System.out.println("its july");
}else if(Num==8) {
System.out.println("its AUGUST");
}else if(Num==9) {
System.out.println("its SEPTEMBER");
}else if(Num==10) {
System.out.println("its OCTOBER");
}else if(Num==11) {
System.out.println("its november");
}else{
System.out.println("its december");
}
}}