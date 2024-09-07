package Array;
public class GoodPair {
    public static void main(String args[]){
        int [] nums =  {1,2,3};
        System.out.println(goodPairs(nums));

    } 
    static int goodPairs(int[] nums){
        int temp = 0;
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    temp++;
                }
            }
        }
        return temp;
    }
}
