import java.util.Scanner;

public class Exercício07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int a = entrada.nextInt();

        System.out.print("Digite o lado B: ");
        int b = entrada.nextInt();

        System.out.print("Digite o lado C: ");
        int c = entrada.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Os lados formam um triangulo VALIDO.");
        } else {
            System.out.println("Os lados NAO formam um triangulo valido.");
        }

        entrada.close();
    }
}
