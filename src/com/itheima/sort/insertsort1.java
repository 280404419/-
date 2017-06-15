package com.itheima.sort;

public class insertsort1 {

	public void insert(int R[],int n){
		int i,j;
		int temp;
		for(i = 2;i<=n;i++){
			temp = R[i];
			j = i -1;
			while(j>=1&&temp<R[j]){
				R[j+1] = R[j];
				--j;
			}
			R[j+1] = temp;
		}
	}
}
