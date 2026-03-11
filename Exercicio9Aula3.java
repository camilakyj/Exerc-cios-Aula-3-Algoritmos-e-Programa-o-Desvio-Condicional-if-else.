// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;

public class Exercicio9Aula3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double prestacao;
        double limite;

        System.out.println("Digite o salario bruto:");
        salario = entrada.nextDouble();

        System.out.println("Digite o valor da prestacao:");
        prestacao = entrada.nextDouble();

        limite = salario * 0.30;

        if (prestacao <= limite) {
            System.out.println("Emprestimo pode ser concedido!");
        } else {
            System.out.println("Emprestimo nao pode ser concedido!");
        }

        entrada.close();
    }
}
