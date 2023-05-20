package Day1;

public class PascalTriangleUsinItration {
    public static void printPascalTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    triangle[row][col] = 1;
                } else {
                    triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
                }
                System.out.print(triangle[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 6;
        printPascalTriangle(numRows);
    }
}
