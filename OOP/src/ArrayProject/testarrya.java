package ArrayProject;

public class testarrya {
public static void main(String []args) {
	obejectarray[] main= new obejectarray[4];
	main[0]= new obejectarray();
	main[1]= new obejectarray();
	main[2]= new obejectarray();
	main[3]= new obejectarray();
	 main[0].name= "minal";
	 main[0].age= 18;
	 
	 main[1].name= "kai";
	 main[1].age= 15;

	 main[2].name= "love";
	 main[2].age= 18;

	 main[3].name= "geep";
	 main[3].age= 18;

	 int x=0;
	 while (x<4) {
		 System.out.println(main[x].name+" "+main[x].age);
		 x=x+1;
	 }
	
	
	
}
}
