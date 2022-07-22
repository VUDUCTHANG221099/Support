package Java_Classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class spoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//DIVSUM - Divisor Summation
		int n=sc.nextInt();
		ArrayList<Integer> word=new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int number=sc.nextInt();
			int sum=0;
			for (int j = 1; j < Math.sqrt(number); j++) {
				if(number%j==0) {
					sum=sum+j;
				}
			}
			word.add(sum);
		}
		for (Integer integer : word) {
			System.out.println(integer);
		}
		
		
		
		//Prime Generator
		/*int quantily=sc.nextInt();
		ArrayList<Integer> word=new ArrayList<Integer>();
		for (int i = 0; i < quantily; i++) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			for (int j = m; j <= n; j++) {
				if(isPrimeNumber(j))
		        word.add(j);
		        
			}
			
		}
		for (Integer integer : word) {
			System.out.println(integer);
		}*/
		
		//Life, the Universe, and Everything
		/*int n;
		ArrayList<Integer> number=new ArrayList<Integer>();
		while (true) {
			n=sc.nextInt();
			if(n==42) {
				break;
			}else {
				number.add(n);
			}
		}
		for (Integer integer : number) {
			System.out.println(integer);
		}*/
		
		
		
	
	}
	//TEST - Life, the Universe, and Everything
	
	//Prime Generator
	/*public static boolean isPrimeNumber(int n) {
		if(n<2) {
			return false;
		}
		 int squareRoot = (int) Math.sqrt(n);
	        for (int i = 2; i <= squareRoot; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	}*/
	
	

}
