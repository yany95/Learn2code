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
public class InserSort {
    public static void insertsort(int[] yany){
        int j,temp;
        for(int i=1;i<yany.length;i++){
            j=i;
        while(j>0 && yany[j]<yany[j-1]){
            temp = yany[j];
            yany[j] = yany[j-1];
            yany[j-1] = temp;
            j--;
        };
        }
    }
    public static void main(String[] args){
        int a[]={22,55,1,4,77,88,4,5};
        insertsort(a);
        for(int x:a){
        System.out.println(x);
        }
    }
}
