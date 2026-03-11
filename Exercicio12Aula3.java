// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;

public class Exercicio12Aula3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double desconto;

        System.out.println("Digite o salario:");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento de desconto");
        }
        else if (salario <= 1200) {
            desconto = salario * 0.20;
            System.out.println("Desconto do INSS: " + desconto);
        }
        else if (salario <= 2000) {
            desconto = salario * 0.25;
            System.out.println("Desconto do INSS: " + desconto);
        }
        else {
            desconto = salario * 0.30;
            System.out.println("Desconto do INSS: " + desconto);
        }

        entrada.close();
    }
}