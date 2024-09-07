package Array;

public class RatHouseCount {
    public static void main(String[] args){
        int[] arr = {2,8,3,5,4,1,2};
        int ans = ratCount(arr, 8, 7, 2);
        System.out.println(ans);
    }

    public static int ratCount(int[] arr, int n, int r, int unit){
        if(n==0){
            return -1;
        }
        int totalFood = r * unit;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if(sum>=totalFood){
                break;
            }
            
        }
        if(sum< totalFood){
            return 0;
        }
        int total = sum- totalFood;
        return total;
    }

}
