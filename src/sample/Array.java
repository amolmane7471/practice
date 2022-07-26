package sample;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of elements ");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("enter elements of an array");
	for(int i=0;i<arr.length;i++)
	{
			arr[i]=sc.nextInt();	
		}
	
		System.out.println("elements of an array:");
	for(int i=0;i<arr.length;i++)
	{
	{
		System.out.print(arr[i]+" ");
		}
	}
	System.out.println();
		
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if (arr[i] + arr[j] + arr[k] == 0) {
					System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " is distinct triplets");
				}			
				
			}
		}
	}

}
	
}
