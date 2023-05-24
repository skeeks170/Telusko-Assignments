package Day1;

public class PascalTriangleUsingRecursion {
    public static int pascalNumber(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return pascalNumber(row - 1, col - 1) + pascalNumber(row - 1, col);
        }
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
        int numRows = 6;
        printPascalTriangle(numRows);
    }
}
