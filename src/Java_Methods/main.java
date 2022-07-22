package Java_Methods;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		helloWorld();
		System.out.println(Sum(500.55,500));
		System.out.println(Recursion(5));
	}
	
	static void helloWorld() {
		System.out.println("hello world");
	}
	static int Sum(int a,int b) {
		return a+b;
	}
	static double Sum(double a, double b) {
		return a+b;
	}
	static int Recursion(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return Recursion(n-1)+Recursion(n-2);
	}
	 
}


