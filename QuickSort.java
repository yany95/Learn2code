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
public class QuickSort {
        public static int partition(int arr[], int left, int right){
            int i = left,j = right;
            int temp = 0;
            int pivot = arr[(left+right)/2];
            while(i <= j){
                while(arr[i]<pivot){
                    i++;
                }
                while(pivot<arr[j]){
                    j--;
                }
                if(i<=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            };
            return i;
    }

public static void quickSort(int arr[], int left, int right){
            int index = partition(arr,left,right);
            if(left<index-1){
                quickSort(arr,left,index - 1);}
            if(index<right){
                quickSort(arr,index,right);}
    }
public static void main(String[] args){
            int a[]={12,8,99,2,4,5,77,4};
            quickSort(a,0,7);
            for(int x:a){
                System.out.println(x);
        }
    }
}
