package SVMC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Knights {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream myFile=new FileInputStream("data/input.txt");
		System.setIn(myFile);
		Scanner sc=new Scanner(System.in);
		int TestCase=sc.nextInt();
		for (int i = 1; i <= TestCase; i++) {
			int n,x1,y1,x2,y2;
			int res=0,m;
			n=sc.nextInt();
			for (int j=0;j<n;j++) {
				x1=sc.nextInt();
				y1=sc.nextInt();
				x2=sc.nextInt();
				y2=sc.nextInt();
				int dx=x2-x1;
				int dy=y2-y1;
				m=dx*dy;
				if(m==2 || m==-2) {
					res++;
				}
			}
			
			System.out.println("#"+i+" "+res);
		}
	}

}
