package dobackofront;

import java.util.Scanner;

public class Exercicio5Aula3 {
    public static void main() {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero:");
        num = entrada.nextInt();

        if (num >= 50 && num <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {

        }
        System.out.println("Não pertence ao intervalo");

        entrada.close();
    }
}


