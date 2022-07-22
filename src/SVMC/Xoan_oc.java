package SVMC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class Xoan_oc {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream myFile=new FileInputStream("data/input.txt");
		System.setIn(myFile);
		Scanner sc=new Scanner(System.in);
		int TestCase=sc.nextInt();
		int m, n;
		for (int i = 1; i < TestCase+1; i++) {
			m=sc.nextInt();
			n=sc.nextInt();
			System.out.println("#"+i);
			xoanOc(m, n);
		}
	}
	static void inMaTran(int [][]arr,int m,int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	static void xoanOc(int m, int n) {
		int count = 1;
		int[][] Arr = new int[m][n];
		int up = 0, down = m - 1, left = 0, right = n - 1;
		if(m>1) {
			while (count <= m * n) {
				for (int i = left; i <= right; i++) {
					Arr[up][i] = count++;
				}
				up++;
				
				for (int i = up; i <= down; i++) {
					Arr[i][right] = count++;
				}
				right--;

				
				for (int i = right; i >= left; i--) {
					Arr[down][i] = count++;
				}
				down--;
				for (int i = down; i >= up; i--) {
					Arr[i][left] = count++;
				}
				left++;
			}
		}else {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					Arr[i][j]=count++;
				}
			}
		}
		inMaTran(Arr, m, n);
	}

}
