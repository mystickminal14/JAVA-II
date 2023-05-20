package Encap;
import java.util.Scanner;
public class id {

	private String Name;
	private int Age;
	private int Phone;
	
	public  void setName(String givenName) {
		this.Name=givenName;
	}
	public String getName() {
		return Name;
	
}
	public void setAge(int agge) {
		this.Age=agge;
	}
	public int getAge() {
		return Age;
	}
	public void setPhone(int pn) {
		this.Phone=pn;
		
	}
	public int getPhone() {
		return Phone;
	}
	public static void main(String[]args) {
		id obj= new id();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a NAME");
		String bb= sc.next();
		obj.setName(bb);
		System.out.println("enter a age");
		int jbb= sc.nextInt();
		obj.setAge(jbb);
		System.out.println("enter a number");
		int jjbb= sc.nextInt();
		obj.setPhone(jjbb);
		System.out.println("NAME="+obj.getName());
		System.out.println("NAME="+obj.getAge());
		System.out.println("NAME="+obj.getPhone());
	}
}
