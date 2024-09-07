package Lab;
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        
        String inputFilePath = "src\\Lab\\source.txt";
        
        String outputFilePath = "src\\Lab\\destination.txt";

        try {
            
            FileInputStream fis = new FileInputStream(inputFilePath);
            
            FileOutputStream fos = new FileOutputStream(outputFilePath);

            
            int v1;
            while ((v1 = fis.read()) != -1) {
                fos.write(v1);
            }

            
            fis.close();
            fos.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
