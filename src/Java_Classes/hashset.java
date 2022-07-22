package Java_Classes;

import java.util.*;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//một tập hợp các mục trong đó mọi mục là duy nhất
		//add/remove/clear/size
		//contains ==>Check
		HashSet<Integer> object=new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//String name;
		//double width,height;
		for(int i=0;i<n;i++) {
			int number=sc.nextInt();
			/*name=sc.next();
			width=sc.nextDouble();
			height=sc.nextDouble();
			animals keyword=new animals(name, width, height);*/
			object.add(number);
		}
		for(int i=0;i<50;i++) {
			if(object.contains(i)) {
				System.out.println("The number have in array: "+i);
			}else {
				System.out.println("The number have not in array: "+i);
			}
		}
	}

}
