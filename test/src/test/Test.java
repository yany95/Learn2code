/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author yany
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,55,4,8,3,0};
        Sorting.Bubble_Sort.bubble_sort(a);
        for(int t:a){
                System.out.println(t);
        }

    }
    
}
