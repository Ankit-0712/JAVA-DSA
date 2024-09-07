package Lab;
import java.io.*;

public class TestBuffered {
    public static void main(String[] args) {
        try {
            String str = "Welcome";
            FileOutputStream fout = new FileOutputStream("D:\\Bt.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            byte[] b1 = str.getBytes();
            bout.write(b1);
            bout.close();
            fout.close();

            FileInputStream fin = new FileInputStream("D:\\Bt.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);

            int v1;
            while ((v1 = bin.read()) != -1) {
                System.out.print((char)v1); 
            }
            bin.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
