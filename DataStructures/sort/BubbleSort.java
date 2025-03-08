package DataStructures.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 25,12, 22, 11, 90};
        int[] result = bubbleSort(arr);
        System.out.println("Sorted array:" +  Arrays.toString(result));
    }
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        boolean swap = false;

        //the outer loop keeps track of the number of times we go through the array
        for(int i = 0; i < n; i++){
            //the inner loop helps us to compare and swap the elements for each i 
            for(int j = 0; j < n - i - 1; j++){ 
                //the inner loop runs for n - i -1 times and this is because
                //for each i we are going to get i number of elements sorted and there is no need in going to them again. therefore we will get the n - i
                //since we are comparing the element and the one after, when we get to the last element we are going to go out of bounds so we will run to n - 1, and this is the reason for the -1 therefore we'll get
                //n - i -1 
                if(arr[j]>arr[j+1]){
                //do the swap 
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap = true;
            }
            }
        }
        return arr;
    }
}
