package SVMC;

import java.io.*;
import java.util.*;

public class Quan_ma_di_chuyen {
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream myFife = new FileInputStream("data/input.txt");
		System.setIn(myFife);
		Scanner sc = new Scanner(System.in);
		int TestCase=sc.nextInt();
		for (int i=1;i<=TestCase;i++) {
			int n,x1,y1,x2,y2;
			int res=0;
			n=sc.nextInt();
			for (int j=0;j<n;j++) {
				x1=sc.nextInt();
				y1=sc.nextInt();
				x2=sc.nextInt();
				y2=sc.nextInt();
				int dx=x1-x2;
				int dy=y1-y2;
				if(dx*dy==2 || dx*dy==-2) {
					res++;
				}
			}
			System.out.println("#"+i+" "+res);
		}
		
	

	}

}
