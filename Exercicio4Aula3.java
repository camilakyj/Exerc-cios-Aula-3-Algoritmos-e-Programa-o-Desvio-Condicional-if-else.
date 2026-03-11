// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Exercicio4Aula3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + "," + num2);
        } else {
            System.out.println(num2 + ","+ num1);
        }
        entrada.close();


        }
    }