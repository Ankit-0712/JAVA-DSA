package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int getmaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start;i<end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swapArray(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }

    static void selection(int[] arr){
        for(int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr, 0, last);
            swapArray(arr, maxIndex, last);
        }
    }
}

