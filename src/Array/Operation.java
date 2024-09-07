package Array;

public class Operation {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(valueAfterPerformingOps(operations));
    }

    static int valueAfterPerformingOps(String[] ops) {
        int x = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("X++") || ops[i].equals("++X")) {
                x++;
            } else if (ops[i].equals("--X") || ops[i].equals("X--")) {
                x--;
            }
        }
        return x;
    }
}
