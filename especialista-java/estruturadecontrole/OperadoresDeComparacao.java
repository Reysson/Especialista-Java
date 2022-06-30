public class OperadoresDeComparacao {

    public static void main(String[] args) {
        int pesoProdutos = 900;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
        System.out.printf("Carga excedida: %b%n", cargaExcedida);

        boolean cargaLiberada = pesoProdutos < limitePesoCaminhao;
        boolean cargaLiberada2 = pesoProdutos <= limitePesoCaminhao;
        boolean cargaLiberada3 = limitePesoCaminhao >= pesoProdutos;
        System.out.printf("Carga liberada: %b%n", cargaLiberada3);
    }
}