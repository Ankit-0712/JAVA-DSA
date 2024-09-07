import java.util.*;
public class PenultimateWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");
        if(words.length>=2){
            String penultimateWord = words[words.length - 2];
            System.out.println("Penultimate word : " + penultimateWord);

        }
        else{
            System.out.println("the sentece does not have a penultimate word");
    }
    }
}
