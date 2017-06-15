package com.itheima.sort;
/**
 * ¿ìËÙÅÅĞò
 * @author Administrator
 *
 */
public class quickSort {

	public static void quickSort(int[] table){
		quickSort(table,0,table.length-1);
	}
	private static void quickSort(int[] table,int begin,int end){
		if(begin<end){
			int i=begin,j=end;
			int vot = table[i];
			while(i!=j){
				while(i<j&&vot<=table[j]){
					j--;
				}
				if(i<j)
					table[i++]=table[j];
				while(i<j&&table[i]<=vot)
					i++;
				if(i<j)
					table[j--]=table[i];
			}
			table[i]=vot;
			quickSort(table, begin, j-1);
			quickSort(table, i+1, end);
		}
	}
	public static void main(String[] args) {
		int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
		quickSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
