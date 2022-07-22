package SVMC;
import java.util.*;
import java.io.*;

public class First_duplicate {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream myFile=new FileInputStream("data/input.txt");
		System.setIn(myFile);
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [100001];
		int TestCase=sc.nextInt();
		for (int i = 1; i <=TestCase; i++) {
			int res=-1;
			int n=sc.nextInt();
			for (int j = 0; j < arr.length; j++) {
				arr[j]=0;
			}
			for (int j = 0; j < n; j++) {
				int key=sc.nextInt();
				if(arr[key]!=0) {
					if(res==-1) {						
						res=key;
					}
				}else {
					arr[key]=n;
				}
			}
			System.out.println("#"+i+" "+res);
		}
	}

}
