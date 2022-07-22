package SVMC;

import java.util.*;
import java.io.*;
public class Vung_Bao_Lon_Nhat {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream myFile=new FileInputStream("data/input.txt");
		System.setIn(myFile);
		Scanner sc=new Scanner(System.in);
		int TestCase=sc.nextInt();
		for (int i = 0; i < TestCase; i++) {
			int Arr[][]=new int [101][101],height,width,x,y;
			height=sc.nextInt();
			width=sc.nextInt();
			x=sc.nextInt();
			y=sc.nextInt();
			for (int j = 0; j < x; j++) {
				for (int j2 = 0; j2 < y; j2++) {
					Arr[j][j2]=sc.nextInt();
				}
			}
			int max=0;
			for (int j=0; j<=x-height;j++) {
				for (int j2=0;j2<=y-width;j2++) {
					int sum=0;
					for (int h=0;h<height;h++) {
						for (int w = 0; w < width; w++) {
							if((h==0 || h==height-1 || w==0 || w==width-1) && Arr[h+j][w+j2]%2==0) {
								sum+=Arr[h+j][w+j2];
							}
						}
					}
					if(sum>max) {
						max=sum;
					}
				}
			}
			System.out.println("#"+(i+1)+" "+max);
			
		}
	}

}
