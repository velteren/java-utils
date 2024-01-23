import java.util.Arrays;

public class Rotate2DArray {
    public static void main(String[] args) {
        int[][] matrix = {

                {1, 2, 3, 4},

                {5, 6, 7, 8},

                {9, 0, 1, 2},

        };
        System.out.println("Original array:");
        for (var item : matrix) {
            System.out.println(Arrays.toString(item));
        }
        System.out.println("\nRotated right:");
        var result = rotateRight(matrix);
        for (var item : result) {
            System.out.println(Arrays.toString(item));
        }
        System.out.println("\nRotated left:");
        result = rotateLeft(matrix);
        for (var item : result) {
            System.out.println(Arrays.toString(item));
        }
    }
    public static int[][] rotateLeft(int[][] array) {
        int rowCount = array.length;
        int colCount = array[0].length;
        int[][] result = new int[colCount][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                result[colCount - j - 1][i] = array[i][j];
            }
        }

        return result;
    }

    public static int[][] rotateRight(int[][] array) {
        int rowCount = array.length;
        int colCount = array[0].length;
        int[][] result = new int[colCount][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                result[j][rowCount - i - 1] = array[i][j];
            }
        }

        return result;
    }
}
