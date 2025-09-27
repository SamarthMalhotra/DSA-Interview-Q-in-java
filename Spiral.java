// This is Spiral martix Q it is most important which is ask by TOP IT Industries Like Google , Amazon and Adobe etc.
//Must Dry run this code to understand well.
//import java.util.*;
public class Spiral {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + "  ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + "  ");
            }
            // Print Bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + "  ");

            }
            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + "  ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String args[]) {
        int arr[][] = {
                { 1, 2, 3, 4, 25 },
                { 5, 6, 7, 8, 24 },
                { 9, 10, 11, 12, 13 },
                { 14, 15, 16, 17, 18 },
                { 20, 21, 22, 23, 27 }
        };
        printSpiral(arr);

    }

}