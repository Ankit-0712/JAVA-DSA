package iostream;
import java.io.FileInputStream;
import java.io.IOException;
public class inputstream {
    public static void main(String[] args){
        FileInputStream infile = null;
        try{
            infile = new FileInputStream("C:\\java\\MyFirstProject\\src\\iostream\\input.txt");
            int b;
            while((b = infile.read())!=-1){
                System.out.println((char)b);
            }
            infile.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
