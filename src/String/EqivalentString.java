package String;

public class EqivalentString {
    public static void main(String[] args){
        String[] word1 = {"ab","c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum1 = SumString1(word1);
        String sum2 = SumString2(word2);
        return sum1.equals(sum2);
    }

    public static String SumString1(String[] word1){
        StringBuilder result1 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            result1.append(word1[i]);
        }
        return result1.toString();
    }

    public static String SumString2(String[] word2){
        StringBuilder result2 = new StringBuilder();
        for(int i =0;i<word2.length;i++){
            result2.append(word2[i]);
        }
        return result2.toString();
    }

}
