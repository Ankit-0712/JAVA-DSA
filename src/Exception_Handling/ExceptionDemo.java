package Exception_Handling;
public class ExceptionDemo {
    public ExceptionDemo(String msg) {
        
    }

    public static void main(String[] args) {
        int i = 8;
        int j = 2;
        int k = 0;
        int[] a = new int[4];
        String str = null; 

        try {
            k = i / j;
            if (a != null) {
                for (int c = 0; c < 5; c++) {
                    a[c] = c + 1;
                }
                for (int value : a) {
                    System.out.println(value);
                }
            } 
          System.out.println(str.length());  
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximum number of values is 4");
        } catch (Exception e) {
            System.out.println("Array 'a' is null: " + e);
        }
        System.out.println(k);
    }
}
