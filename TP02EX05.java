import java.util.Scanner;

public class TP02EX05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] m = new int[3][2];

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite valor [" + i + "][" + j + "]: ");
                m[i][j] = scan.nextInt();
            }
        }

        
        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
