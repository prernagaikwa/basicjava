import java.util.Scanner;

public  class switch  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimensions of the matrix (rows columns): ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the operation to perform (1: Addition, 2: Multiplication, 3: Transpose): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                matrixAddition(matrix, rows, columns);
                break;
            case 2:
                matrixMultiplication(matrix, rows, columns);
                break;
            case 3:
                matrixTranspose(matrix, rows, columns);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    private static void matrixAddition(int[][] matrix, int rows, int columns) {
        int[][] result = new int[rows][columns];

        System.out.println("Enter the second matrix:");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix[i][j] + scanner.nextInt();
            }
        }
        scanner.close();

        System.out.println("Addition Result:");
        printMatrix(result, rows, columns);
    }

    private static void matrixMultiplication(int[][] matrix, int rows, int columns) {
        int[][] result = new int[rows][columns];

        System.out.println("Enter the second matrix:");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix[i][j] * scanner.nextInt();
            }
        }
        scanner.close();

        System.out.println("Multiplication Result:");
        printMatrix(result, rows, columns);
    }

    private static void matrixTranspose(int[][] matrix, int rows, int columns) {
        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose Result:");
        printMatrix(result, columns, rows);
    }

    private static void printMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}