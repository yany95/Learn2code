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
public class Bubble_Sort {
    public static void bubble_sort(int[] yany){
        boolean Swapped;
        for(int i=0;i<yany.length-1;i++){
            Swapped = false;
            for(int j=0;j<yany.length-1-i;j++){
                if(yany[j]>yany[j+1]){   
                    int temp =yany[j];
                    yany[j]=yany[j+1];
                    yany[j+1]=temp; 
                    Swapped = true;
                    }
                }
            if(!Swapped){
                break;
                }
            }
    }
    public static void main(String[] args){
        int a[]={1,3,8,8,-2,4,3,2,7,8};
        for(int x:a){
            System.out.println(x);
        }
    }
}

