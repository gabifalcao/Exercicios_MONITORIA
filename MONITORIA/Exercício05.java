
import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int num2 = entrada.nextInt();

        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num1 + " e multiplo de " + num2);
        } else {
            System.out.println(num1 + " NAO e multiplo de " + num2);
        }

        entrada.close();
    }
}
