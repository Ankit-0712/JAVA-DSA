package Linear_Search;

public class MaxWealth {
    public static void main(String[] args) {
        
    }

    public int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<accounts.length;i++){
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++){
                sum += accounts[i][j];

            }
            // now we have sum of accounts of i
            //check with overall ans

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    } 
}
