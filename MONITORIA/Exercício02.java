


import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = entrada.nextDouble();

        // y = 3x^3 - 5x^2 + 2x - 7
        double y = 3 * Math.pow(x, 3) - 5 * Math.pow(x, 2) + 2 * x - 7;

        System.out.printf("Para x = %.2f, o resultado do polinomio y e: %.2f\n", x, y);

        entrada.close();
    }
}

