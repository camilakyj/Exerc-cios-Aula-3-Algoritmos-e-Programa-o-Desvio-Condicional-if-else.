// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;

public class Exercicio2Aula3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade:");
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");

        }
        entrada.close();
    }
}


