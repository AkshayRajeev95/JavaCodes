package bubblesort;

import java.util.Scanner;


public class bubblesort {
	public static void sort(int[] a) {
		int len = a.length; // length of input array
		int i,j,temp = 0;
		
		for(i=0;i<len;i++) {
			for(j=1;j<len-i;j++) {
				if(a[j-1]>a[j]) { // check for which element is greater
					temp = a[j-1];  //swap procedure
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double start = 0.0;
		double end = 0.0;
		int len = 0;
		System.out.println("Enter the number of digits you want to sort");
		len = input.nextInt();
		int[] array = new int[len];
		System.out.println("Enter the elements you need to sort");
		for(int i = 0;i<len;i++) { 
			array[i] = input.nextInt(); //number inputs
		}
		System.out.print("The elements before sorting are ::");
		for(int i = 0;i<len;i++) {
			System.out.print(array[i] + " ");
		}
		start = System.nanoTime(); //time stamp before starting
		sort(array);
		end = System.nanoTime() - start; // time elapsed
		System.out.print("\nThe elements after sorting are ::");
		for(int i = 0;i<len;i++) {
			System.out.print(array[i] + " "); //display sorted array
		}
		System.out.println("\nTime elapsed = "+end+" nano seconds");		
	}

}
