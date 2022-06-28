import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = entrada.nextLine();

        System.out.printf("Oi, %s%n", nome);

        //calculo muito simples imc
        System.out.println("Seu peso: ");
        int peso = entrada.nextInt();

        System.out.println("Sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Olá %s, seu imc eh: %f%n", nome, altura);
    }
}