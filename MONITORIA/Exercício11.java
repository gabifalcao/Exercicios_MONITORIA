import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC calculado: %.2f\n", imc);
        System.out.print("Classificacao: ");

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        entrada.close();
    }
}

