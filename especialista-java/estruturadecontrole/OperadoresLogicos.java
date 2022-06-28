import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cortisol: ");

        double cortisol = entrada.nextDouble();

        //cortisol ideal é de 6 a 18.4
        boolean cortisolNormal = cortisol >= 6 && cortisol <= 18.4;
        System.out.printf("Cortisol normal: %b%n", cortisolNormal);

        boolean cortisolAnormal = cortisol < 6 || cortisol > 18.4;
        System.out.printf("Cortisol anormal: %b%n", cortisolAnormal);
    }
}