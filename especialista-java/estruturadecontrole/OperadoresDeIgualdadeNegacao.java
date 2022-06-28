public class OperadoresDeIgualdadeNegacao {

    public static void main(String[] args) {
        boolean numerosIguais1 = 10 == 10;
        boolean numerosIguais2 = (4 + 6) == (5 * 2);

        int numero1 = 10;
        int numero2 = 11;
        boolean numerosIguais3 = numero1 == numero2;

        boolean numerosDiferentes1 = !numerosIguais3;
        boolean numerosDiferentes2 = !(numero1 == numero2);
        boolean numerosDiferentes3 = numero1 != numero2;

        String nome1 = "Thiago";
        String nome2 = "Thiago";
        boolean nomesIguais = nome1 == nome2;

        System.out.printf("Números iguais (1): %b%n", numerosIguais1);
        System.out.printf("Números iguais (2): %b%n", numerosIguais2);
        System.out.printf("Números iguais (3): %b%n", numerosIguais3);
        System.out.printf("Números diferentes (1): %b%n", numerosIguais1);
        System.out.printf("Números diferentes (2): %b%n", numerosIguais2);
        System.out.printf("Números diferentes (3): %b%n", numerosIguais3);
        System.out.printf("Nomes iguais : %b%n", nomesIguais);
    }
}