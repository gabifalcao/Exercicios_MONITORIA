import java.util.Scanner;


public class Exercício12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero do mes (1-12): ");
        int mes = entrada.nextInt();

        System.out.print("Digite o ano (ex: 2026): ");
        int ano = entrada.nextInt();

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("O mes " + mes + " de " + ano + " possui 31 dias.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("O mes " + mes + " de " + ano + " possui 30 dias.");
                break;
            case 2:
                System.out.println("O mes 2 (Fevereiro) de " + ano + " possui 28 dias.");
                break;
            default:
                System.out.println("Erro: Mes invalido! Digite um valor entre 1 e 12.");
                break;

        }

        entrada.close();
    }
}
