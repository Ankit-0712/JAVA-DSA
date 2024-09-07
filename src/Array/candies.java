package Array;

import java.util.ArrayList;
import java.util.List;

public class candies {
    public static void main(String[] args){
        int[] candies = {2,3,5,1,3};
        int extracandies = 3;
        ArrayList<Boolean> list = new ArrayList<>(5);
        System.out.println(kidsWithCandies(candies, 3));
    }

    static int max(int[] candies){
        if(candies.length == 0){ //Edge cases
            return -1;
        }
        int maxVal = candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>maxVal){
                maxVal = candies[i];
            }
        }
        return maxVal;
    }
     static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> list = new ArrayList<>(6);
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max(candies)){
                 list.add(true);
            }
            else{
                 list.add(false);
            }
        }
        return list;
     }
}
