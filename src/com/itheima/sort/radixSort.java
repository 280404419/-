package com.itheima.sort;

import java.util.ArrayList;
import java.util.List;

public class radixSort {

	 
	 public static void main(String[] args) {
		 int a[]={49,38,2,101,97};  
		 sort(a);  
	       for(int i=0;i<a.length;i++){  
	              System.out.println(a[i]);  
	       }  
	}
	       
	    public static  void sort(int[] array){    
	       //����ȷ�����������;    
	       int max=array[0];    
	       for(int i=1;i<array.length;i++){    
	            if(array[i]>max){    
	              max=array[i];    
	            }    
	       }    
	       int time=0;    
	       //�ж�λ��;    
	       while(max>0){    
	          max/=10;    
	           time++;    
	       }    
	  
	        //����10������;    
	       List<ArrayList> queue=new ArrayList<ArrayList>();    
	       for(int i=0;i<10;i++){    
	              ArrayList<Integer>queue1=new ArrayList<Integer>();  
	           queue.add(queue1);    
	       }    
	  
	       //����time�η�����ռ�;    
	       for(int i=0;i<time;i++){    
	           //��������Ԫ��;    
	          for(int j=0;j<array.length;j++){    
	               //�õ����ֵĵ�time+1λ��;  
	                 int x=array[j]%(int)Math.pow(10,i+1)/(int)Math.pow(10, i);  
	                 ArrayList<Integer>queue2=queue.get(x);  
	                 queue2.add(array[j]);  
	                 queue.set(x, queue2);  
	          }   
	          int count=0;//Ԫ�ؼ�����;    
	          //�ռ�����Ԫ��;    
	          for(int k=0;k<10;k++){  
	               while(queue.get(k).size()>0){  
	                   ArrayList<Integer>queue3=queue.get(k);  
	                   array[count]=queue3.get(0);    
	                   queue3.remove(0);  
	                   count++;  
	               }   
	          }    
	       }               
	    }  
}
