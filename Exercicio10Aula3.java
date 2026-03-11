// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;

public class Exercicio10Aula3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero:");
        num3 = entrada.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os numeros sao iguais");
        }
        else if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior numero é: " + num1);
        }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O maior numero é: " + num2);
        }
        else {
            System.out.println("O maior numero é: " + num3);
        }

        entrada.close();
    }
}