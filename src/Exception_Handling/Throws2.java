package Exception_Handling;
import java.io.IOException;
public class Throws2{
    void m() throws IOException {
        throw new IOException("Device error");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Exception handled");

        }
    }

public static void main(String[] args){
    Throws2 obj = new Throws2();
    obj.p();
}
}

