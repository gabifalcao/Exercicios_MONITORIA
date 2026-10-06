import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("\nMENU DE OPERACOES:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha uma opcao: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("Resultado: %.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
                break;
            case 2:
                System.out.printf("Resultado: %.2f - %.2f = %.2f\n", num1, num2, (num1 - num2));
                break;
            case 3:
                System.out.printf("Resultado: %.2f * %.2f = %.2f\n", num1, num2, (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.printf("Resultado: %.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
                } else {
                    System.out.println("Erro: Divisao por zero nao permitida!");
                }
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }

        entrada.close();
    }
}

