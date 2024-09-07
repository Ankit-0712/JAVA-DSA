package String;

public class Performance {
    public static void main(String [] args){
        String series = "";
        for(int i =0;i<26;i++){
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);
        //that program will create new object with every iteration so here is the complexity of O(n2)
    }
}
