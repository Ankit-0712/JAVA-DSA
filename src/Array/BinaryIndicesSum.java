package Array;

import java.util.ArrayList;
import java.util.List;

public class BinaryIndicesSum {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(5);
        
        
        
    }

     public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count = 0;
        //ArrayList<Integer> nums = new ArrayList<>(5);
        for(int i=0;i<nums.size();i++){
            
            if(Integer.bitCount(i)==k){
                count = count + nums.get(i);
            }
        }

        return count;


        
    }


}
