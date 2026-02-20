package Greedy;

import java.util.Arrays;

public class maxSumWithKNegation {
    public  static int largestSumAfterKNegations(int[] arr, int k) {
        Arrays.sort(arr);
//        -4,-3,-1,2,5
        int i = 0;

        while(i < arr.length && arr[i] < 0 && k > 0){
            arr[i] *= -1;
            i++; k--;
        }
        if(k % 2 == 1){
            Arrays.sort(arr);
            arr[i] *=-1;
        }
        int sum = 0;
        for(int ele:arr){
            sum += ele;
        }

        return sum;
    }
    public static void main(String[]args){
       int arr[] = {2,-3,-1,-4,5};
        int result = largestSumAfterKNegations(arr,5);
        System.out.println(result);
    }
}
