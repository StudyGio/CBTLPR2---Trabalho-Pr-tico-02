import java.util.Scanner;

public class TP02EX07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] m = new int[3][4];

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite valor [" + i + "][" + j + "]: ");
                m[i][j] = scan.nextInt();
            }
        }

        
        System.out.print("Digite a constante: ");
        int k = scan.nextInt();

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = m[i][j] * k;
            }
        }

       
        System.out.println("\nMatriz multiplicada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
