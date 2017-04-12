package com.dk.sort;

/**
 * 选择排序
 * @author carol
 *
 */
public class SelectSort {
	public static void main(String[] args) {
		int a[]={1,54,6,3,78,34,12,45};
		for(int i=0;i<a.length;i++){
			for(int j =i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
