package Array;
import java.util.Arrays;
public class ThreeSum {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        int[] ans = threeSum(nums);
        System.out.println(Arrays.toString(ans));
        

    }

    static int[] threeSum(int []nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+ nums[j] + nums[k]==0){
                        return new int[]{nums[i], nums[j], nums[k]};
                    }
                }
            }
        }
        return null;

    }
}
