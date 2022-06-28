public class OperadoresAritimeticos {
    public static void main(String[] args) {
        int minhaIdade = 20;
        int suaIdade = 10;

        //Adição
        int totalIdades = minhaIdade + suaIdade;
        System.out.println("Soma das idades: " + totalIdades);

        //Subtração
        int diferencaIdades = minhaIdade - suaIdade;
        System.out.println("Diferença das idades: " + diferencaIdades);

        //Multiplicação
        int dobroIdade = suaIdade * 2;
        System.out.println("Dobro da sua idade: " + dobroIdade);

        //Divisão
        int metadeIdade = suaIdade / 2;
        System.out.println("Metade da sua idade: " + metadeIdade);

        //Módulo
        int restoDivisao = 7 % 2;
        System.out.println("Resto da divisão (módulo): " + restoDivisao);
    }
}