package Algorithm;

import java.util.Iterator;

public class SortingAlgorithm {
	public static void printArray(int no,int []a) {
		System.out.printf("%d: ",no);
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
		System.out.println();
	}
	
	public static void bubbleSort(int []a) {
		for (int i = 0; i < a.length; i++) {
			boolean isSorted=true;
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]) { //a[j]>a[j+1]==A-Z ?A-Z:Z-A 
					isSorted=false;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(isSorted) {
				break;
			}
			printArray(i, a);
		}
	}
	
	public static void insertionSort(int []a) {
		for (int i = 1; i < a.length; i++) { // i=0 ?A-Z:no sort
			//Chèn a[i] vào 0->i-1
			int ai=a[i];
			int j=i-1;
			while (j>=0 && a[j]>ai) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=ai;
			printArray(i, a);
		}
	}
	
	public static void  selectionSort(int []a) {
		for (int i = 0; i < a.length; i++) {
			int minIndex=i;
			boolean isSorted=true;
			for (int j = i+1; j < a.length; j++) {
				//Search min [i,n]
				if(a[minIndex]>a[j]) {
					minIndex=j;
					isSorted=false;
				}
			}
			if(minIndex!=i) {
				int temp=a[minIndex];
				a[minIndex]=a[i];
				a[i]=temp;
			}
			if(isSorted) {
				break;
			}
			printArray(i, a);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int BubbleSort[]= {1,2,3,4,5,6};
		int InsertionSort[]={5,3,2,7,8,1,2};
		//selectionSort(InsertionSort);
		
		
		
	}

}
