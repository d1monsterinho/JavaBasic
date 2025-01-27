package com.my;

import java.util.Random;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
    private static final int MAX_SIZE = 20;
    private static final int MIN_RANDOM = -100;
    private static final int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довжину матриці (максимум 20): ");
        int width = getValidSize(scanner);
        System.out.print("Введіть висоту матриці (максимум 20): ");
        int height = getValidSize(scanner);

        System.out.print("Виберіть метод створення (1 - вручну, 2 - рандомно): ");
        int choice = scanner.nextInt();
        int[][] matrix;

        if (choice == 1) {
            matrix = createMatrixManually(scanner, width, height);
        } else {
            matrix = createMatrixRandomly(width, height);
        }

        displayMatrix(matrix);
        System.out.println("Мінімальне значення: " + findMin(matrix));
        System.out.println("Максимальне значення: " + findMax(matrix));
        System.out.println("Середнє значення: " + calculateAverage(matrix));
    }

    private static int getValidSize(Scanner scanner) {
        int size;
        do {
            size = scanner.nextInt();
            if (size < 1 || size > MAX_SIZE) {
                System.out.print("Розмір матриці не може перевищувати 20");
            }
        } while (size < 1 || size > MAX_SIZE);
        return size;
    }

    private static int[][] createMatrixManually(Scanner scanner, int width, int height) {
        int[][] matrix = new int[height][width];
        System.out.println("Введить елементи матриці:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] createMatrixRandomly(int width, int height) {
        int[][] matrix = new int[height][width];
        Random random = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = MIN_RANDOM + random.nextInt(MAX_RANDOM - MIN_RANDOM + 1);
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0, count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }
}
