import java.util.Scanner;

public class TP02EX01 {
       public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Insira o primeiro valor: ");
	int v1 = scan.nextInt();

	System.out.println("Insira o segundo valor: ");
	int v2 = scan.nextInt();

	while (v2 >= v1) {
		v2 = 0;
		System.out.println("Insira o segundo valor novamente: ");
		v2 = scan.nextInt();
	}

	System.out.println("Seu número é: " + (v2));
	
	}
}
