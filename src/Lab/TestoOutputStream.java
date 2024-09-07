package Lab;
import java.io.*;

public class TestoOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\Bt.txt");
            String s1 = "Welcome";
            byte[] b1 = s1.getBytes();
            fout.write(b1);
            fout.close();

            int v1;
            FileInputStream fin = new FileInputStream("D:\\Bt.txt");
            while ((v1 = fin.read()) != -1) {
                System.out.print((char)v1); 
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
