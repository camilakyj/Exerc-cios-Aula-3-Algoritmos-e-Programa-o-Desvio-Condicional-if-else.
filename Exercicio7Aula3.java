// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Exercicio7Aula3 {
    public static void main(String[] args) {

         Scanner entrada =new Scanner(System.in);

         double salario;
         int anos;
        double bonus;

        System.out.println("Digite o salario:");
           salario = entrada.nextDouble();

        System.out.println("Digite a quantidade de anos na empresa:");
            anos = entrada.nextInt();

          if (anos >= 5) {
            bonus = salario * 0.20;


        } else {

            bonus = salario * 0.10;

        }

        System.out.println("O valor do bonus é: " + bonus);

        entrada.close();
    }
}