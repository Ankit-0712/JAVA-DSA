package Array;

public class NoWhomettheTarget {
    public static void main(String[] args){
        int[] hours = {0,1,2,3,4};
        int target;
        System.out.println(solution(hours, 2));

    }

    static int solution(int[] hours, int target){
        int count = 0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                count++;

            }

        }
        return count;
    }
}
