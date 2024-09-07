package String; 

public class SB {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        for(int i =0;i<26;i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
      // in that program stringbuilder class is used which doesn't create new object for every iteration . It only changes in the original object that is created
      System.out.println(builder.toString());
       builder.deleteCharAt(0);
       System.out.println(builder);
       builder.reverse();
       System.out.println(builder); 
    }
}
