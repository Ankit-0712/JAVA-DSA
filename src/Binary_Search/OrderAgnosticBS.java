package Binary_Search;

public class OrderAgnosticBS {
   public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0, 2,3,415,16,17,22,45};
        int target = 45;
        int ans = orderAgnosticBs(arr, target);
        System.out.println(ans);
   } 

   static int orderAgnosticBs(int[] arr,int target){
    int start = 0;
    int end = arr.length - 1;

    boolean isAsc = arr[start]<arr[end];


    while(start <= end){
        //find the middle element
        int mid = start + (end - start)/2;
        if(arr[mid]== target){
            return mid;
        }
        if(isAsc){

          if(target < arr[mid]){
            end = mid-1;
            }
            else if(target > arr[mid]){
            start = mid +1;
        }
        else{
            if(target > arr[mid]){
                end = mid-1;
                }
            else if(target > arr[mid]){
                start = mid +1; 
            }
        }
    }
}
return -1;
   }
}
