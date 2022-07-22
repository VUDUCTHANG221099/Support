package Java_Classes;

import java.util.*;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//là một đối tượng có thể được sử dụng để lặp qua các bộ sưu tập, như ArrayList và HashSet .
		//hasNext/next
		ArrayList<Integer> object=new ArrayList<Integer>();
		object.add(10);
		object.add(10*20);
		object.add(10*20*30);
		object.add(10*20*30*40);
		object.add(10*20*30*40*50);
		object.add(10*20*30*40*50*60);
		Iterator<Integer> it=object.iterator();
		while (it.hasNext()) {
			Integer i=it.next();
			if(i<1000000) {
				it.remove();
			}
			//System.out.println(it.next());
		}
		System.out.println(object);
		
		
		
	}

}
