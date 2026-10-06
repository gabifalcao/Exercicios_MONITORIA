import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC e: %.2f\n", imc);

        entrada.close();
    }
}
