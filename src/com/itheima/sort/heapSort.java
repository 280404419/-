package com.itheima.sort;
/**
 * ¶ÑÅÅÐò
 * @author Administrator
 *
 */
public class heapSort {

	public static void main(String[] args) {
		//int[] a = {81 ,49,38,27,97,76,19,13};
		int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51}; 
		/*for(int i = 3; i>=0;i--){
			sift(a, i, 7);
		}*/
		heapSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
	private static void sift(int[] table,int begin,int end){
		int i = begin,j=2*i+1;
		int temp = table[i];
		while(j<=end){
			if(j < end && table[j]<table[j+1])
				j++;
			if(temp < table[j]){
				table[i] = table[j];
				i = j;
				j = 2 * i + 1;
			}
			else break;
		}
		table[i] = temp;
	}
	private static void heapSort(int[] table){
		int n = table.length;
		for (int i = n/2-1; i >= 0; i--) {
			sift(table,i,n-1);
		}
		for (int i = n-1; i > 0; i--) {
			{
				int temp = table[0];
				table[0] = table[i];
				table[i] = temp;
				sift(table,0,i-1);
			}
		}
	}
}
