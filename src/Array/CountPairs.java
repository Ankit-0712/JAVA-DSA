package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairs {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(-1,1,2,3,1));
        int target=2;

        CountPairs countPairs = new CountPairs();
        System.out.println(countPairs(nums, 2));
    }
     static int countPairs(List<Integer> nums, int target){
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
            
        }
        return count;
     }
}
