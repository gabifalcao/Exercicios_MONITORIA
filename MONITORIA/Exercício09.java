
import java.util.Scanner;

public class Exercício09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preco unitario do produto: ");
        double precoUnitario = entrada.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = entrada.nextInt();

        double totalBruto = precoUnitario * quantidade;
        double porcentagemDesconto = 0.0;

        if (quantidade > 10) {
            porcentagemDesconto = 0.20;
        } else if (quantidade >= 6) {
            porcentagemDesconto = 0.10;
        } else {
            porcentagemDesconto = 0.0;
        }

        double valorDesconto = totalBruto * porcentagemDesconto;
        double totalFinal = totalBruto - valorDesconto;

        System.out.printf("Valor Total Bruto: R$ %.2f\n", totalBruto);
        System.out.printf("Desconto (%.0f%%): R$ %.2f\n", (porcentagemDesconto * 100), valorDesconto);
        System.out.printf("Valor Final a Pagar: R$ %.2f\n", totalFinal);

        entrada.close();
    }
}

