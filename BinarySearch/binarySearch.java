package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int arr [] = {-17, -5, -5, 1, 3, 7, 10, 17, 92, 99};
        int target = 10;

        int idx = search(arr, target);
        System.out.println("Element found at index: "+ idx);
    }

    public static int search(int arr[] , int t){
            int lo = 0;
            int hi = arr.length -1;
            while(lo <= hi){
                int mid = lo + (hi-lo)/2;
                if(arr[mid] == t){
                    return mid;
                }else if(arr[mid]>t){
                    hi = mid -1;
                }else{
                    lo = mid+1;
                }
            }

            return -1;
    }
}
