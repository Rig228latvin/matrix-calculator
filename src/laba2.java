import java.util.Scanner;
public class laba2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean I = true;
        int size = 0;
        int[][] matrix1 = new int[size][size];
        int[][] matrix = new int[size][size];
        while (I) {
            System.out.println("1 – ввод размерности");
            System.out.println("2 - заполнение С");
            System.out.println("3 - заполнение Т");
            System.out.println("4 - вывод С и вывод Т");
            System.out.println("5 - вывод результата");
            System.out.println("6 - завершить процесс");
            int choice = scanner.nextInt();
            int sumC = 0;
            int sumT = 0;
            switch (choice) {
                case 1:
                    System.out.println("введите размер матриц");
                    size = scanner.nextInt();
                    matrix1 = new int[size][size];
                    matrix = new int[size][size];
                    break;
                case 2:
                    System.out.println("введите значения для матрицы C");
                    for (int a = 0; a < size; a++) {
                        for (int b = 0; b < size; b++) {
                            System.out.println("введите значение члена матрицы [" + (a + 1) + "][" + (b + 1) + "]");
                            matrix1[a][b] = scanner.nextInt();
                        }
                    }
                    break;
                case 3:
                    System.out.println("введите значения для матрицы T");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.println("введите значение члена матрицы [" + (i + 1) + "]" + "[" + (j + 1) + "]");
                            matrix[i][j] = scanner.nextInt();
                        }
                    }

                    break;
                case 4:
                    for (int a = 0; a < size; a++) {
                        System.out.print("[");
                        for (int b = 0; b < size; b++) {
                            System.out.print(matrix1[a][b] + " ");
                        }
                        System.out.print("]\n");
                    }
                    System.out.println();
                    for (int i = 0; i < size; i++) {
                        System.out.print("[");
                        for (int j = 0; j < size; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.print("]\n");
                    }
                    break;
                case 5:
                    for(int a = 0; a < size; a++){
                        if(matrix1[a][size - 1- a] % 2 == 0){
                            sumC += matrix1[a][size - 1- a];
                        }
                    }
                    for(int a = 0; a < size; a++){
                        if(matrix[a][size - 1- a] % 2 == 0){
                            sumT += matrix[a][size - 1- a];
                        }
                    }
                    if(sumC > sumT){
                        int[][] matrixH = new int[size][size];
                        for(int i = 0; i < size; i++){
                            for(int j = 0; j < size; j++){
                                matrixH[i][j] = matrix1[i][j] + matrix[i][j] * 2;
                            }
                        }
                        for (int i = 0; i < size; i++) {
                            for (int j = 0; j < size; j++) {
                                System.out.print(matrixH[i][j] + " ");
                            }
                            System.out.print("]\n");
                        }
                    }
                    else{
                        int[][] matrixF = new int[size][size];
                        for(int i = 0; i < size; i++){
                            for(int j = 0; j < size; j++){
                                matrixF[i][j] = matrix1[i][j] - matrix[i][j] * 5;
                            }
                        }
                        for (int i = 0; i < size; i++) {
                            for (int j = 0; j < size; j++) {
                                System.out.print(matrixF[i][j] + " ");
                            }
                            System.out.print("]\n");
                        }
                    }
                    break;
                case 6:
                    I = false;
                    break;
                default:
                    System.out.println("некорректный ввод");
                    break;
            }
        }
    }
}
