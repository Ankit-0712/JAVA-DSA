package Array;

import java.util.Arrays;
import java.util.ArrayList;

public class createTargetArray {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        
        System.out.println(Arrays.toString(createtargetArray(nums,index)));

    }

    static int[] createtargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i=0;i<index.length;i++){
            target.add(index[i], nums[i]);
        }

        for(int i=0;i<index.length;i++){
            arr[i] = target.get(i);
        }

        return arr;
        
    
    }
}
