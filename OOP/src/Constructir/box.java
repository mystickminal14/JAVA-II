package Constructir;

public class box {
	
private double height;

private double length;

public  void setHeight(double h) {
	this.height=h;
}
public double getHeight() {
	return height;
}

public void setlength(double l) {
	this.length=l;
}
public double getlength() {
	return length;
}
public static void main(String []args) {
	box obj=new box();
	obj.setHeight(2);
	obj.setlength(2.2);
	System.out.println("length :"+obj.getHeight()+obj.getlength());
}
}
