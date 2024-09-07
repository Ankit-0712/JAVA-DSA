package Exception_Handling;
public class DemoException {
    public static void main(String[] args) {
        int i = 8;
        int j = 2;
        int k = 0;
        int[] a = null;

        try {
            k = i / j;
            if (a != null) {
                for (int c = 0; c < 5; c++) {
                    a[c] = c + 1;
                }
                for (int value : a) {
                    System.out.println(value);
                }
            } else {
                System.out.println("Array 'a' is null");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximum number of values is 4");
        } catch (NullPointerException e) {
            System.out.println("Array 'a' is null: " + e);
        } catch (Exception e) {
            System.out.println("Unknown exception");
        }
        System.out.println(k);
    }
}
