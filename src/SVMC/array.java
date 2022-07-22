package SVMC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class array {
	
	public static void main(String[] args) throws FileNotFoundException {
		//InputStream myFile=new FileInputStream("data/input.txt");
		//System.setIn(myFile);
		int Arr[][]=new int [5][5],count=1;
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length; j++) {
				Arr[i][j]=count++;
			}
		}
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length; j++) {
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 3-1; i < Arr.length-Arr.length+3; i++) {
			for (int j = 2-1; j < Arr.length-Arr.length+2; j++) {
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
				
		
		
	}
	static void inMaTran(int [][]Arr,int n) {
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length; j++) {
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static void ngang(int n) {
		int Arr[][]=new int[n][n],count=1;
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length; j++) {
				Arr[i][j]=count++;
			}
		}
		inMaTran(Arr, n);
	}
	static void doc(int n) {
		int Arr[][] = new int[n][n],count = 1;
		for(int i = 0; i < Arr.length; i++) {
			for(int j = 0; j < Arr.length; j++) {
				Arr[j][i] = count++;
			}
		}
		inMaTran(Arr, n);
	}
	static void ngangXenKe(int n) {
		int Arr[][] = new int[n][n],count = 1;
		for(int i = 0; i < Arr.length; i++) {
			if(i%2==0) {				
				for(int j = 0; j < Arr.length; j++) {
					Arr[i][j] = count++;
				}
			}else {
				for(int j = Arr.length-1; j >= 0; j--) {
					Arr[i][j] = count++;
				}
			}
		}
		inMaTran(Arr, n);
	}
	static void docXenKe(int n) {
		int Arr[][] = new int[n][n],count = 1;
		for(int i = 0; i < Arr.length; i++) {
			if(i%2==0) {				
				for(int j = 0; j < Arr.length; j++) {
					Arr[j][i] = count++;
				}
			}else {
				for(int j = Arr.length-1; j >= 0; j--) {
					Arr[j][i] = count++;
				}
			}
		}
		inMaTran(Arr, n);
	}
	static void cheoXuong(int n) {
		int Arr[][]=new int [n][n],count=1;
		for (int i = Arr.length-1; i >=0; i--) {
			for (int j = i,k=0; j < Arr.length && k<Arr.length; j++,k++) {
				Arr[j][k]=count++;
			}
		}
		for (int i = 1; i <Arr.length; i++) {
			for (int j = 0,k=i; j < Arr.length && k<Arr.length; j++,k++) {
				Arr[j][k]=count++;
			}
		}
		inMaTran(Arr, n);
	}
	static void cheoLen(int n) {
		int Arr[][]=new int [n][n],count=1;
		for (int i = Arr.length-1; i >=0; i--) {
			for (int j = i,k=0; j < Arr.length && k<Arr.length; j++,k++) {
				Arr[k][j]=count++;
			}
		}
		for (int i = 1; i <Arr.length; i++) {
			for (int j = 0,k=i; j < Arr.length && k<Arr.length; j++,k++) {
				Arr[k][j]=count++;
			}
		}
		inMaTran(Arr, n);
	}
	static void cheoXenKe(int n) {
		int Arr[][]=new int [n][n],count=1;
		for (int i = Arr.length-1; i >=0; i--) {
			if(i%2==0) {				
				for (int j = i,k=0; j < Arr.length && k<Arr.length; j++,k++) {
					Arr[k][j]=count++;
				}
			}else {
				int col=Arr.length-i-1;
				for (int j = Arr.length-1,k=col; j >=0 && k>=0; j--,k--) {
					Arr[k][j]=count++;
				}
			}
		}
		for (int i = Arr.length-2; i >=0; i--) {
			if(i%2==0) {
				int col=Arr.length-i-1;
				for (int j = 0,k=col; j < Arr.length && k<Arr.length; j++,k++) {
					Arr[k][j]=count++;
				}
			}else {
				for (int j = i,k=Arr.length-1; j >=0 && k>=0; j--,k--) {
					Arr[k][j]=count++;
				}
			}
		}
		inMaTran(Arr, n);
	}
	static void xoanOc(int n) {
		int count=1;
		int[][]Arr=new int [n][n];
		int up=0,down=Arr.length-1,left=0,right=Arr.length-1;
		while(count<=Arr.length*Arr.length) {
			for(int i=left;i<=right;i++) {
				Arr[up][i]=count++;
			}
			up++;
			for (int i=up;i<=down;i++) {
				Arr[i][right]=count++;
			}
			right--;
			for (int i=right;i>=left;i--) {
				Arr[down][i]=count++;
			}
			down--;
			for (int i=down;i>=up;i--) {
				Arr[i][left]=count++;
			}
			left++;
		}
		inMaTran(Arr, n);
	}
}
