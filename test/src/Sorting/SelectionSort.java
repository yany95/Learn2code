/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author yany
 */
public class SelectionSort {
    public static void selection_sort(int[] arr){
        int n = arr.length;
        int min=0;
        for(int i = 0;i<n-1;i++){
            min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }                
            }
            int SmallerNumber = arr[min];
            arr[min] = arr[i];
            arr[i] = SmallerNumber;
        }
    }
 
    public static void main(String[] args){
        int a[] = {1,-2,3,4,9,5,7,4};
        selection_sort(a);
        for(int x:a){
            System.out.println(x);
        }
    }
}
