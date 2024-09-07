package Binary_Search;

public class BInarySearch {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int target = 7;
        int ans = binarySearch(arr, 45);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int  target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
