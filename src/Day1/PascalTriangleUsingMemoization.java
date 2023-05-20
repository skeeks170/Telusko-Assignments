package Day1;

import java.util.HashMap;
import java.util.Map;

public class PascalTriangleUsingMemoization {
    private static Map<String, Integer> memoization = new HashMap<>();

    public static long pascalNumber(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        }

        String key = row + "," + col;
        if (memoization.containsKey(key)) {
            return memoization.get(key);
        }

        int value = (int) (pascalNumber(row - 1, col - 1) + pascalNumber(row - 1, col));
        memoization.put(key, value);
        return value;
    }

    public static void printPascalTriangle(int numRows) {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(pascalNumber(row, col) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5             ;
        printPascalTriangle(numRows);
    }
}
