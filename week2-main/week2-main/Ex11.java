package assigment;
/*11 Write a program that reads a number between 1,000 and 999,999 from
the user and prints it with a comma separating the thousands. Here is a
sample dialog:*/
import java.util.Scanner;
public class Ex11 {
	public static void main(String []args) {
		

	Scanner ww= new Scanner(System.in);
	System.out.println("enter a number");
	String num= ww.nextLine();
	String inde= num.substring(0);
	  String firstThree = num.substring(0, 3);
      String middleThree = num.substring(3, 6);
     
      System.out.println(firstThree + "," + middleThree );
  }

}
