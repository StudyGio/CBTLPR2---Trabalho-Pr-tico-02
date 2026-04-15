import java.util.Scanner;

public class TP02EX04 {
    public static void main(String[] args) {

	int[][] m = new int[2][3];
	Scanner scan = new Scanner(System.in);


for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print("Digite valor [" + i + "][" + j + "]: ");
        m[i][j] = scan.nextInt();
    }
}


for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print(m[i][j] + " ");
    }
    System.out.println();
 } 
	}
}
