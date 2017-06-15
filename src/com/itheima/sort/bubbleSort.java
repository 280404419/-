package com.itheima.sort;
/**
 * ц╟ещеепР
 * @author Administrator
 *
 */
public class bubbleSort {

	public static void main(String[] args) {
		int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
		for(int i=1;i<a.length;i++){
			for(int j=0; j<a.length-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		 for(int i=0;i<a.length;i++){  
		       System.out.println(a[i]);  
		    }  
	}
}
