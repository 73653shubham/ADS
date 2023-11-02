package selection_sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter the size of array");
			int[] array=new int[sc.nextInt()];
			insertInArray(array,sc);
			printArray(array);
			SelectionSort(array);
			printArray(array);
			
			}catch (Exception e) {
				e.printStackTrace();
			}

	}
	private static void SelectionSort(int[] a) {
		System.out.println("After Selection Sort");
		for(int i=0;i<a.length;i++) {
			int smallestEle=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[smallestEle]>a[j])
					smallestEle=j;
			}
			int temp=a[i];
			a[i]=a[smallestEle];
			a[smallestEle]=temp;
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
