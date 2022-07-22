package SVMC;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class overview {
	static boolean Check(int x) {
		for (int i = 1; i * i <= x; i++) {
			if (i * i == x)
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws FileNotFoundException {
		InputStream myFile = new FileInputStream("data/input.txt");
		System.setIn(myFile);
		

	}

	static boolean isPrime(int N) {
		if (N < 2) {
			return false;
		} else {
			for (int i = 2; i <= (int) Math.sqrt(N); i++) {
				if (N % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	static int reverse(int N) {
		int tmp = 0, res = 0;
		while (N > 0) {
			tmp = N % 10;
			res = res * 10 + tmp;
			N /= 10;
		}
		return res;
	}

	// (1) TEST - Life, the Universe, and Everything
	/*
	 * int N; while (true) { N=sc.nextInt(); if(N==42) { break; }
	 * System.out.println(N); }
	 */
	// (2) CALEXP - Phép tính lũy thừa
	/*
	 * int TestCase=sc.nextInt(),n,m; int res=1; for (int i = 0; i < TestCase; i++)
	 * { n=sc.nextInt(); m=sc.nextInt(); for (int j = 0; j < m; j++) { res*=n; }
	 * System.out.println("#"+(i+1)+" "+res); res=1; }
	 */
	// (3) CALSQRT - Tính căn bậc hai
	/*
	 * int TestCase=sc.nextInt(),N; for (int i = 0; i < TestCase; i++) {
	 * N=sc.nextInt(); int x=1; while (x*x<=N) { x++; }
	 * System.out.println("#"+(i+1)+" "+(x-1)); }
	 */
	// (4) ADDREV - Adding Reversed Numbers
	/*
	 * int TestCase=sc.nextInt(),m,n,res; for (int i = 0; i < TestCase; i++) {
	 * m=sc.nextInt(); n=sc.nextInt(); int mReverse=reverse(m); int
	 * nReverse=reverse(n); res=reverse(mReverse+nReverse); System.out.println(res);
	 * }
	 */
	// (5) SMPDIV - Divisibility
	/*
	 * int TestCase=sc.nextInt(),n,x,y; for (int i = 0; i < TestCase; i++) {
	 * n=sc.nextInt(); x=sc.nextInt(); y=sc.nextInt(); for (int j = x; j < n &&
	 * j<100000; j+=x) { if(j%y!=0) { System.out.print(j+" "); } }
	 * System.out.println(); }
	 */
	// (6) SUMPROE - SUM OF PRODUCT (Easy)
	/*
	 * int TestCase=sc.nextInt(),N; for (int i = 0; i < TestCase; i++) { int x,
	 * mol=1000007; N=sc.nextInt(); int res=0; for(int j=1;j<=N;j++) { x=N/j;
	 * res+=(x*j); res%=mol; } System.out.println(res); }
	 */
	// (7) PROB01 - Số nén 1
	/*
	 * int TestCase=sc.nextInt(),N; for (int i = 0; i < TestCase; i++) {
	 * N=sc.nextInt(); while (N>9) { int res=0; while (N>0) { res+=N%10; N/=10; }
	 * N=res; } System.out.println("#"+(i+1)+" "+N); }
	 */
	// (8) PRIME1E - Prime Generator (Easy)
	/*
	 * int TestCast=sc.nextInt(),m,n; for (int i = 0; i < TestCast; i++) {
	 * m=sc.nextInt(); n=sc.nextInt(); for (int j = m; j <=n; j++) {
	 * if(isPrime(j)==true) { System.out.println(j); } } }
	 */
	// (9) NUMPER - Số chính phương
	/*
	 * int TestCase=sc.nextInt(),m,n; for (int i = 0; i < TestCase; i++) {
	 * System.out.print("#"+(i+1)+" "); m=sc.nextInt(); n=sc.nextInt(); boolean
	 * count = false; for (int j = m; j <=n; j++) { if(Check(j)) { count=true;
	 * System.out.print(j+" "); } } if(!count) { System.out.println("NO NUMBER"); }
	 * System.out.println();
	 * 
	 * }
	 */

}
