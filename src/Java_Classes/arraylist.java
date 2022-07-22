package Java_Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Có thể thay đổi kích thước
		/*remove/add/clear/size*/
		//set/get
		Scanner cs=new Scanner(System.in);
		ArrayList<animals> word=new ArrayList<animals>();
		int quanlity=cs.nextInt();
		for(int i=0;i<quanlity; i++) {
			String name=cs.next();
			double width=cs.nextDouble();
			double height=cs.nextDouble();
			animals keyword=new animals(name,width , height);
			word.add(keyword);
		
		}
		
		for (animals animals : word) {
			System.out.println(animals.getName());
		}
		/*ArrayList<Integer> Number=new ArrayList<Integer>();
		
		int n=cs.nextInt();
		for(int i=0;i<n;i++) {
			int a=cs.nextInt();
			Number.add(a);
		}
		Collections.sort(Number);
		System.out.println(Number);*/
		
		
		
	}

}
