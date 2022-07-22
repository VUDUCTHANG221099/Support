package Java_Classes;

import java.util.ArrayList;

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(1);
		number.add(1*2);
		number.add(1*2*3);
		number.add(1*2*3*4);
		number.add(1*2*3*4*5);
		number.forEach((n)->{System.out.println(n);});

	}

}
