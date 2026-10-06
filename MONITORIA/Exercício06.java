
import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = entrada.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int c = entrada.nextInt();

        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        double media = (a + b + c) / 3.0;

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.printf("Media aritmetica: %.2f\n", media);

        entrada.close();
    }
}
