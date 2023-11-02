package bubble_sort;


import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter the size of array");
			int[] array=new int[sc.nextInt()];
			insertInArray(array,sc);
			printArray(array);
			bubbleSort(array);
			printArray(array);
			
			}catch (Exception e) {
				e.printStackTrace();
			}

	}
	private static void bubbleSort(int[] a) {
		System.out.println("After bubble Sort");
		for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a.length-i-1;j++) {
				 if(a[j]>a[j+1]) {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
			 }
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
