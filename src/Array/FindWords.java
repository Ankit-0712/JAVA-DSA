package Array;
import java.util.ArrayList;
import java.util.List; // Import List interface

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }
        
        return list;
    }
}

public class FindWords {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        String[] inputWords = {"leet", "code"};
        List<Integer> result = s1.findWordsContaining(inputWords, 'e');

        System.out.println(result);
    }
}
