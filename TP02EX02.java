import java.util.Scanner;

public class TP02EX02 {
       public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int[] numb = new int[10];

	for (int i = 0; i < numb.length; i++) 
        {
		System.out.println("Digite o valor" + (i + 1) + ":");
		numb[i] = scan.nextInt();
	
		while (numb[i] < 0) {
		System.out.println("Digite novamente: ");
		numb[i] = scan.nextInt();
		}
        }

	int soma = numb[0];
	int maior = numb[0];
	int menor = numb[0];

	for(int i = 0; i < numb.length; i++) {
		soma += numb[i];
		
		if(numb[i] > maior) {
		maior = numb[i];
		}

		if(numb[i] < menor) {
		menor = numb[i];
		}
	}

	double media = (double) soma / numb.length;


	System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
	
	
	scan.close();

	}
}
