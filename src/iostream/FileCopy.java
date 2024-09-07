package iostream;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        
        try (
            PrintWriter writer = new PrintWriter(new FileWriter("C:\\java\\MyFirstProject\\src\\iostream\\C.txt"));
            BufferedReader readerA = new BufferedReader(new FileReader("C:\\java\\MyFirstProject\\src\\iostream\\A.txt"));
            BufferedReader readerB = new BufferedReader(new FileReader("C:\\java\\MyFirstProject\\src\\iostream\\B.txt "))
        ) {
            String line;

            
            while ((line = readerA.readLine()) != null) {
                writer.println(line);
            }

            
            while ((line = readerB.readLine()) != null) {
                writer.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
