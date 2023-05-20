/*Write a program that reads a number and displays the square, cube,
and fourth power. Use the Math.pow method only for the fourth power.*/
import java.util.Scanner;

public class mathematics{
    public static void main(String [] args){
        Scanner ma=new Scanner(System.in);
        System.out.println("Enter a number=");
        int num= ma.nextInt();
        double square= num* num;
        double cube= Math.pow(num,3);
        double fourthPower= Math.pow(num,4);
        System.out.println("The square ="+square);
        System.out.println("The cube ="+cube);
        System.out.println("The fourthpower ="+fourthPower);
    }
}


