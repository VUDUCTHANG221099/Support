package Java_Classes;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Có thể thay đổi kích thước
		/*remove/add/clear/size*/
		//addFirst/addLast/removeFirst/removeLast/getFirst/getLast
		
		LinkedList<animals> word=new LinkedList<animals>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String name=sc.next();
			double width=sc.nextDouble();
			double height=sc.nextDouble();
			animals keyAnimals=new animals(name,width,height);
			word.add(keyAnimals);
		}
		System.out.println(word.getFirst().getName());

	}

}
