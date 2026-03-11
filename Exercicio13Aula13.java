// Camila Aki yagima Jeronimo
package dobackofront;
import java.util.Scanner;

public class Exercicio13Aula13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1;
        double num2;
        double resultado;
        char operacao;

        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextDouble();

        System.out.println("Digite a operacao (+, -, *, /):");
        operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        }
        else if (operacao == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        }
        else if (operacao == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        }
        else if (operacao == '/') {
            if (num2 <= 0) {
                System.out.println("Impossivel dividir!");
            } else {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            }
        }
        else {
            System.out.println("Sinal invalido");
        }

        entrada.close();
    }
}