import java.util.Scanner;
public class Pcps{
public static void main( String[] args){

Scanner n= new Scanner(System.in);

System.out.println("what is your name");
String Name=n.nextLine();

System.out.println("welcome to pcps Mr."+Name);

System.out.println("Are you studying in PCPS? Enter Yes or No");
Boolean study = n.nextBoolean();

if (study == True){

System.out.println("Which level are you studying?");
int level = n.nextInt();
if (level == 4){
System.out.println("congratulation you are a honourbale student of level 4 !");
}else if (level == 5){
System.out.println("congratulation you are a honourbale student  of level 5!");
} else if (level == 6){
System.out.println("congratulation you are a honourbale student of level 6 !");
}
else{
System.out.println("In valid input");
}
}else if(study == False){
System.out.println("Yo don't study in pcps");
}else{
System.out.println("In valid input");
}
}}