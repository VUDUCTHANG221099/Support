package SVMC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Count_the_Pairs {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream myFile=new FileInputStream("data/input.txt");
		System.setIn(myFile);
		Scanner sc=new Scanner(System.in);
		int TestCase=sc.nextInt();
		for (int i =1 ; i <=TestCase; i++) {
			int count=0;
			int n=sc.nextInt();
			int k=sc.nextInt();
			int dataOfN[]=new int[n];
			for (int j = 0; j < dataOfN.length; j++) {
				dataOfN[j]=sc.nextInt();
			}
			for (int j = 0; j < dataOfN.length; j++) {
				for (int j2 = j+1; j2 < dataOfN.length; j2++) {
					if(dataOfN[j]-dataOfN[j2]==k || dataOfN[j2]-dataOfN[j]==k) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		/*for (int j = 0; j < dataOfN.length; j++) {
				for (int j2 = 0; j2 < dataOfN.length-j-1; j2++) {
					if(dataOfN[j2]>dataOfN[j2+1]) {
						int temp=dataOfN[j2];
						dataOfN[j2]=dataOfN[j2+1];
						dataOfN[j2+1]=temp;
					}
					
				}
			}*/
		/*for (int j = 0; j < dataOfN.length; j++) {
				for (int j2 = 0; j2 < dataOfN.length-j-1; j2++) {
					if(dataOfN[j]>dataOfN[j2+1]) {
						if(dataOfN[j2+1]-dataOfN[j]==k) {
							count++;
						}
					}else {
						if(dataOfN[j]-dataOfN[j2+1]==k) {
							count++;
						}
					}
				}
			}
			System.out.println(count);*/
	}

}
