package Array;

import java.util.Arrays;

public class smallerNumberThenCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(solution(nums)));
    }

    static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}
