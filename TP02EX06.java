import java.util.Scanner;

public class TP02EX06 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

String[][] nomes = new String[2][3];

	for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 3; j++) {
        	System.out.print("Digite nome: ");
        	nomes[i][j] = scan.next();
    }
}

	for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 3; j++) {
        	System.out.print(nomes[i][j] + " ");
    }
    	System.out.println();
}
	}
}