import java.util.Scanner;

public class Classwork{
public static void iff(){

Scanner n=new Scanner(System.in);
// inputing name
System.out.println("what is your name  :");
String name= n.nextLine();

String yass="yes";
String nah="No";

//condition
System.out.println("ARE YOU A BOY OR GIRL,PLZ Specify by saying yes for buy  or no for girl:");
String bo= n.nextLine();
//giving condition
if(bo.equals(yass)){
System.out.println("are u interested in playing games :");
String intre= n.nextLine();

if(intre.equals(yass)){
System.out.println("which game=");
String gam=n.nextLine();
}else{
System.out.println("Thanks for approaching us!");
}
}else if(bo.equals(nah)){
System.out.println("how often do u sing  :");
String sing=n.nextLine();
}else{
System.out.println("thanks for approaching us");
}
System.out.println("Do you wanna use calculator  :");
String calc=n.nextLine();
if(calc.equals(yass)){
System.out.println("how many numbers do you need 2 or 3  :");
int Num=n.nextInt();
if(Num==2){
System.out.println("Enter 1st Numebr :");
int num1= n.nextInt();
System.out.println("Enter 2nd Number :");
int num2=n.nextInt();

int sum=num1+num2;
int diff= num1-num2;
int mul= num1*num2;
int div= num1/num2;
int remainder= num1 % num2;
double square= num1*num2;
double cube= Math.pow(sum,3);
double fourth= Math.pow(sum,4);
double sq= Math.sqrt(mul);
System.out.println("The total sum :"+sum);
System.out.println("The total difference :"+diff);
System.out.println("The total product :"+mul);
System.out.println("The total division :"+div);
System.out.println("The total remainder :"+remainder);
System.out.println("The square of sum :"+square);
System.out.println("The  cube  of sum:"+cube);
System.out.println("The 4th power of sum :"+fourth);
System.out.println("square root of product  :"+sq);
}else if(Num==3){
System.out.println("Enter 1st Number :");
int num3= n.nextInt();
System.out.println("Enter 2nd Number :");
int num4=n.nextInt();
 System.out.println("Enter 3rd Number :");
int num5=n.nextInt();

int summ=num3+num4+num5;
int difff= summ-num5;
int mull= num4*num3*num5;
int divv= mull/num3;
int remainderr= mull% num3;
double squaree= summ*summ;
double cuube= Math.pow(summ,3);
double fourrth= Math.pow(summ,4);
double seq= Math.sqrt(mull);
System.out.println("The total sum :"+summ);
System.out.println("The total difference :"+difff);
System.out.println("The total product :"+mull);
System.out.println("The total division :"+divv);
System.out.println("The total remainder :"+remainderr);
System.out.println("The square of sum :"+squaree);
System.out.println("The  cube  of sum:"+cuube);
System.out.println("The 4th power of sum :"+fourrth);
System.out.println("square root of product  :"+seq);
System.out.println("THANK! YOU"+ " " +name+" "+ "please conttact us again");
}else{
return;
}
}else{
System.out.println("THANK! YOU"+ " " +name+" " +"please conttact us again");
}}


public static void main(String [] args){
iff();
}}











