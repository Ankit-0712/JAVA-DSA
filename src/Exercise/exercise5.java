package Exercise;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        int letterCount = 0;
        int numberCount = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                letterCount++;
            }
            else if(Character.isDigit(ch)){
                numberCount++;
            }
        }

        System.out.println("Letters " + letterCount);
        System.out.println("Digits " + numberCount);
    }
    
}
