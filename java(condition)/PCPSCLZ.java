import java.util.Scanner;
public class PCPSCLZ{
public static void main( String [] args){

Scanner sc= new Scanner(System.in);
System.out.println("PLEASE ENTER YOUR NAME");
String name=sc.nextLine();
System.out.println("Aree you a PCPS student, state true or false");
Boolean std=sc.nextBoolean();

if(std= true){
System.out.println("which level of pcps do you study");
int level=sc.nextInt();
if(level==4){
System.out.println("you are a beginner programmer");
}else if(level==5){
System.out.println("you are intermediater programmer");
}else if(level==6){
System.out.println("you are a senior programmer");
}else{
System.out.println("not verified");
}
}else if(std= false){
System.out.println("i AM SORRY, ITS IILEGAL TO CONTACT WITH YOU");
}else{
System.out.println("not valid");
}
System.out.println("Thank you");
}}
