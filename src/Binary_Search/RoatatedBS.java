package Binary_Search;

public class RoatatedBS {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
 
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        if(pivot==0){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        else if(nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }

    }
    static int binarySearch(int[] nums, int target, int start, int end){
        start = 0;
        end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            
            }
            else if(target>nums[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;

            }
            if(arr[mid]<=arr[mid-1]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }


        }
        return -1;
    }
    
}
