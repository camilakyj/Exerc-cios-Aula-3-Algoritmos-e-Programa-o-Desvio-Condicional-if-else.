// Camila Aki Yagima Jeronimo
import java.util.Scanner;

public class Exercicio1Aula3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero inteiro:");
        num = leia.nextInt();

        if (num > 20) {
            System.out.println("A metade do numero é: " + (num / 2));
        }

        System.out.println("Fim do programa");
    }
}

