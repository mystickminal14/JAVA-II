package ArrayProject;

public class Trirangle {
double area;
int height;
int length;
public static void main(String [] args) {
	Trirangle[] ta = new Trirangle[4];
	int x=0;
	while(x<4) {
		ta[x]= new Trirangle();
		ta[x].height =(x+1)*2;
		ta[x].length=x+4;
		ta[x].Area();
		System.out.print("triangle"+x+
				", area");
		System.out.println("="+ta[x].area);
		x=x+1;
	}
	int y=x;
	x=27;
	Trirangle t5=ta[2];
	ta[2].area=343;
	System.out.print("y="+y);
	System.out.println(",t5 area="+t5.area);
}
void Area() {
	area=(height*length)/2;
	
	}
}

