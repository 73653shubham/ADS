package insertion_sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter the size of array");
			int[] array=new int[sc.nextInt()];
			insertInArray(array,sc);
			printArray(array);
			InsertionSort(array);
			printArray(array);
			
			}catch (Exception e) {
				e.printStackTrace();
			}

	}
	private static void InsertionSort(int[] a) {
		System.out.println("After insertion Sort");
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j;
			for(j=i-1;j>=0;j--) {
				if(key<a[j]) {
					a[j+1]=a[j];
				}
				else
					break;
			}
			a[j+1]=key;
		}
	}
	private static void printArray(int[] a) {
		for (int i:a) 
			System.out.println(i);
	}

	private static void insertInArray(int[] a,Scanner sc) {
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element of "+(i+1));
			a[i]=sc.nextInt();
		}	
	}

}
