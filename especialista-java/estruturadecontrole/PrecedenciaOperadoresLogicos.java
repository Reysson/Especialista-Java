public class PrecedenciaOperadoresLogicos {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean resultado = (x == 13 && x == 15) || y == 20;
        System.out.println(resultado);

        boolean resultado2 = x == 13 && (x == 15 || y == 20);
        System.out.println(resultado2);
    }
}