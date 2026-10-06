import java.util.Scanner;

public class aquecimento { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        
        System.out.print("Digite a temperatura em Celsius: ");
        double temp = entrada.nextDouble();

        if (temp < 18) {
            System.out.println("Status: Clima frio.");
        }else if (temp <= 26){
            System.out.println("Status: Temperatura Agradavel.");
        }else {
            System.out.println("Status: Clima Quente!");
        }
        entrada.close();
    }
}

