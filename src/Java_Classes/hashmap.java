package Java_Classes;


import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//put/get/remove/clear/size
		//keySet/values
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, animals> object=new HashMap<Integer,animals>();
		int n=sc.nextInt();
		int count=1;
		String name;
		double width;
		double height;
		for (int i = 0; i < n; i++) {
			name=sc.next();
			width=sc.nextDouble();
			height=sc.nextDouble();
			animals keyword=new animals(name, width, height);
			object.put(count++,keyword );
		}
		
		for (Integer i : object.keySet()) {
			System.out.println(i+" "+object.get(i).getName());
		}
	}

}
