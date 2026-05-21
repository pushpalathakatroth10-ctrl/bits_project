package src;

import java.util.Arrays;

public class BinarySearch {

    //Method for Binary Search
    public static boolean solution(int[] arr,int key){

        //sort the array
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start +(end - start) / 2;

            if(key < arr[mid]){
                end = mid;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else {
                return true;// Element found
            }
        }

        return false;// Element not found
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,2,4,8,10};

        int key = 8;

        if (solution(arr,key:11);
    )) {
            System.out.println(x:"Element is present");
        }else{
            System.out.println(x:"Element not found");
        }
        
    }
}
