
import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a disciplina: ");
        String disciplina = entrada.nextLine();

        System.out.print("Digite a nota 1: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite a nota 2: ");
        double n2 = entrada.nextDouble();

        System.out.print("Digite a nota 3: ");
        double n3 = entrada.nextDouble();

        double media = (n1 + n2 + n3) / 3.0;

        System.out.println("\n========================================");
        System.out.println("RELATORIO ACADEMICO");
        System.out.println("========================================");
        System.out.printf("Aluno(a):    %s\n", nome);
        System.out.printf("Disciplina:  %s\n", disciplina);
        System.out.printf("Nota 1:      %.2f\n", n1);
        System.out.printf("Nota 2:      %.2f\n", n2);
        System.out.printf("Nota 3:      %.2f\n", n3);
        System.out.println("----------------------------------------");
        System.out.printf("Media Final: %.2f\n", media);
        System.out.println("========================================");

        entrada.close();
    }
}

