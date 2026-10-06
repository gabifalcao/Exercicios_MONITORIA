import java.util.Scanner;

public class Exercício08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salario bruto: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite a idade do cliente: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o valor da parcela desejada: ");
        double parcela = entrada.nextDouble();

        double limiteParcela = salario * 0.30;

        if (idade >= 18 && parcela <= limiteParcela) {
            System.out.println("Emprestimo APROVADO!");
        } else {
            System.out.println("Emprestimo NEGADO.");
            if (idade < 18) {
                System.out.println("Motivo: Cliente menor de idade.");
            }
            if (parcela > limiteParcela) {
                System.out.printf("Motivo: Parcela excede 30%% do salario (Limite: R$ %.2f).\n", limiteParcela);
            }
        }

        entrada.close();
    }
}
