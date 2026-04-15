import java.util.Scanner;

public class TP02EX03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char resp;

        do {

            int n;

            System.out.println("Insira a quantidade de valores: ");
            n = scan.nextInt();

            while (n <= 0 || n >= 20) {
                System.out.println("Quantidade inválida! Escolha entre 1-19: ");
                n = scan.nextInt();
            }

            int[] v = new int[n];


            for (int i = 0; i < n; i++) {
                System.out.println("Insira o valor " + (i + 1) + ":");
                v[i] = scan.nextInt();
            }

           
            int maior = v[0];
            int menor = v[0];
            int soma = 0;
            int positivos = 0;
            int negativos = 0;

            for (int i = 0; i < n; i++) {

                soma += v[i];

                if (v[i] > maior) {
                    maior = v[i];
                }

                if (v[i] < menor) {
                    menor = v[i];
                }

                if (v[i] >= 0) {
                    positivos++;
                } else {
                    negativos++;
                }
            }

            double media = (double) soma / n;
            double porcentP = (double) positivos / n * 100;
            double porcentN = (double) negativos / n * 100;

            // saída
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Porcentagem de positivos: " + porcentP);
            System.out.println("Porcentagem de negativos: " + porcentN);

            do {
                System.out.println("Deseja executar novamente? (S/N): ");
                resp = scan.next().toUpperCase().charAt(0);

                if (resp != 'S' && resp != 'N') {
                    System.out.println("Resposta inválida! Digite apenas S ou N.");
                }

            } while (resp != 'S' && resp != 'N');

        } while (resp == 'S');

        System.out.println("Programa encerrado.");

    }
}
