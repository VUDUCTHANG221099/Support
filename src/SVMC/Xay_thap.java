package SVMC;

import java.util.*;
import java.io.*;

public class Xay_thap {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream myFile=new FileInputStream("data/input.txt");
		System.setIn(myFile);
		Scanner sc=new Scanner(System.in);
		int TestCase=sc.nextInt();
		for (int i = 1; i <= TestCase; i++) {
			int n=sc.nextInt();
			int Gach[]=new int [n];
			int m1=sc.nextInt();
			int m2=sc.nextInt();
			for (int j = 0; j < n; j++) {
				Gach[j]=sc.nextInt();
			}
			//Sort
			for (int j1=0;j1<n;j1++) {
				int minIndex=j1;
				for (int j2=j1+1;j2<n;j2++) {
					if(Gach[minIndex]<Gach[j2]) {
						minIndex=j2;
					}
				}if(minIndex!=j1) {
					int temp=Gach[minIndex];
					Gach[minIndex]=Gach[j1];
					Gach[j1]=temp;
				}
			}
			//Sort
			int l=1;
			int count=0;
			int cost=0;
			while (n>count) {
				if(l<=m1) {
					cost+=Gach[count++]*l;
				}
				if(l<=m2) {
					cost+=Gach[count++]*l;
				}
				l++;
			}
			
			
			System.out.println("#"+i+" "+cost);
		}
		
	}

}
