package SVMC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

public class covid {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream myFile=new FileInputStream("data/input.txt");
		System.setIn(myFile);
		Scanner sc=new Scanner(System.in);
		int TestCase=sc.nextInt();
		for (int TC = 1; TC <= TestCase; TC++) {
			int n,F0;
			n=sc.nextInt();
			F0=sc.nextInt();
			int Check[]=new int [101];
			int CheckTX[][]=new int[101][101];
			//Read input
			for (int i=1;i<=n;i++) {
				for (int j=1;j<=n;j++) {
					CheckTX[i][j]=sc.nextInt();
				}	
				Check[i]=0;
			}
			int arrF0[]=new int[101];
			int arrF1[]=new int[101];
			int numberF1=0,numberF2=0;
			//Get F0 
			for (int i = 0; i < F0; i++) {
				arrF0[i]=sc.nextInt();
				Check[arrF0[i]]=1;
			}
			//Duyet F0 tim F1
			for (int i=0; i<F0;i++) {
				int temp=arrF0[i];
				for(int j=1;j<=n;j++) {
					if(CheckTX[temp][j]==1) {
						if(Check[j]==0) {
							arrF1[numberF1]=j;
							numberF1++;
							Check[j]=2;
						}
					}
				}
			}
			//Duyet F1 tim F2
			for (int i=0; i<numberF1;i++) {
				int temp=arrF1[i];
				for(int j=0;j<=n;j++) {
					if(CheckTX[temp][j]==1) {
						if(Check[j]==0) {
							arrF1[numberF2]=j;
							numberF2++;
							Check[j]=3;
						}
					}
				}
			}
			System.out.println("#"+TC+" "+numberF1+" "+numberF2);
		}
		

	}
	
}
