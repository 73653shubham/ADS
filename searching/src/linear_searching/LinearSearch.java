package linear_searching;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch {
	

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
		System.out.println("Enter the size of array");
		int[] array=new int[sc.nextInt()];
		insertInArray(array,sc);
		printArray(array);
		System.out.println("Enter the element for search");
		int element=sc.nextInt();
		int index = linearSearch(array,element);
		if(index==-1)
			System.out.println("Element not found in the list");
		else
		System.out.println("The element : "+element+" is present at index : "+index);
		
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int linearSearch(int[] a, int element) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==element)
				return i;
		}
		
		return -1;
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
