package evennumber;

import java.util.Arrays;
import java.util.Scanner;

public class even {
	public static int[] Evennumber(int arr[],int ar[][]){
			
		int p[]=new int[arr.length+1];
		for(int i=1;i<=arr.length;i++) {
			if (arr[i-1]%2==0) {
				p[i]=p[i-1]+1;
			}
			else {
				p[i]=p[i-1];
			}
		}
		int result[]=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			int l=ar[i][0];
			int r=ar[i][1];
			result[i]=p[r+1]-p[l];
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int ar[][]=new int[x][2];
	
		for(int i=0;i<x;i++) {
			for(int j=0;j<2;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		int value[]=Evennumber(arr,ar);
		System.out.println(Arrays.toString(value));
		
	}

}
