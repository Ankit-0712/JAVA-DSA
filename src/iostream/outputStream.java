package iostream;
import java.io.FileOutputStream;
import java.io.IOException;
public class outputStream {
    public static void main(String[] args){
        FileOutputStream ofile = null;
        byte b1[] = {'A', 'B'};
        try{
            ofile = new FileOutputStream("C:\\java\\MyFirstProject\\src\\iostream\\output.txt");
            ofile.write(b1);
            ofile.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
