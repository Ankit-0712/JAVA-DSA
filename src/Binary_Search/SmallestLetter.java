package Binary_Search;

public class SmallestLetter {
    public static void main(String[] args){
       char[] letters = {'c','d','f','j'};
       char target = 'f';
       System.out.println((char)solution(letters, 'f'));

    }
    static int solution(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target< letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
