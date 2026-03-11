// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;

public class Exercicio3Aula3 {
public    static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num1;
    int num2;

    System.out.println("Digite o primeiro numero:");
    num1 = entrada.nextInt();

    System.out.println("Digite o segundo numero:");
    num2 = entrada.nextInt();

    if(num1==num2) {
        System.out.println("Numero iguais");
    }
    else if(num1>num2) {
        System.out.println("A diferença é:" + (num1 - num2));
    }
    else {
        System.out.println("A diferença é:" + (num2-num1));
    }
    }
}
