// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;

public class Exercicio6Aula3 {
public    static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double altura;
    char sexo;
    double pesoIdeal;

    System.out.println("Digite a altura em cm:");
    altura = entrada.nextDouble();

    System.out.println("Digite o sexo (M/F):");
    sexo = entrada.next().charAt(0);

    if (sexo == 'M') {
        pesoIdeal = 52 + 0.75 * (altura - 152.4);
        System.out.println("Peso ideal" + pesoIdeal + "kg");

        entrada.close();
    }


} }




