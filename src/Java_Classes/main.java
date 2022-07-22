package Java_Classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main implements business{
	
	@Override
	public String Namebusiness() {
		// TODO Auto-generated method stub
		return "Inter";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		animals dog=new animals("A", 0, 0);
		dog.setNameFood("Sandwich");
		System.out.println(dog.getNameFood());
		dog.Prind();
		main m=new main();
		System.out.println(m.Namebusiness());
		System.out.println(Level.HIGH);
		
		//Inner Classes
		class OuterClass {
			  int x = 10;

			  class InnerClass {
			    int y = 5;
			  }
			}
		OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);

		//Date
	    LocalDateTime today=LocalDateTime.now();
	    System.out.println(today.getYear());
	    
		
	}
	
	

}
