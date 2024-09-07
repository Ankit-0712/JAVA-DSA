package Binary_Search;

public class MountainArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,1};
        System.out.println(peakIndexInMountainArray(arr));

    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in decreasing part of the array
                //this may be the ans but look at left

                end = mid;

            }else{
                //you are in ascending part of the array
                start = mid +1; //beczuse we know that mid+1 element > mid element


            }
        }
        //in the end start == end and pointing to the largest number because of the 2 checks above

        return start;
    }

}
