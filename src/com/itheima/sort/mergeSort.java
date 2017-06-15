package com.itheima.sort;
/**
 * 打印的结果有点问题，归并排序
 * @author Administrator
 *
 */
public class mergeSort {

	public static void main(String[] args) {
		int[] a = {52,26,97,19,66,8,49};
		mergeSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void mergeSort(int[] x){
		int[] y= new int[x.length];
		int n = 1;
		while(n<x.length){
			mergepass(x,y,n);
			n*=2;
			if(n<x.length){
				mergepass(y, x, n);
				n*=2;
			}
		}
		
		
	}
	private static void mergepass(int[]x,int[] y ,int n){
		int i = 0;
		while(i<x.length-2*n+1){
			merge(x,y,i,i+n,n);
			i+=2*n;
		}
		if(i+n<x.length)
			merge(x,y,i,i+n,n);
		else
			for (int j = i; j < x.length; j++) {
				y[j]=x[j];
			}
	}
	private static void merge(int[] x, int[] y, int m, int r ,int n){
		int i = m,j =r ,k = m;
		while(i<r&&j<r+n&&j<x.length)
			if(x[i]<x[j])
				y[k++]=x[i++];
			else
				y[k++] = x[j++];
		while(i<r)
			y[k++]=x[i++];
		while(j<r+n&&j<x.length)
			y[k++]=x[j++];
		
	}
}
