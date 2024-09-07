package Array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,2,9,18};
        System.out.println(maxRange(arr,1,3));
    }
    //imagine array is not empty
    static int max(int[] arr){
        if(arr.length == 0){ //Edge cases
            return -1;
        }
        int maxVal = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end){
        //Edge cases
        if(end>start){
            return -1;
        }
        if(arr == null){
            return -1;
        }

        int maxVal = arr[start];
        for(int i = start;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
