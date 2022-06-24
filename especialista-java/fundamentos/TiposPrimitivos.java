public class TiposPrimitivos {

    public static void main(String[] args) {

        //boolean armazena true ou false: Tamanho : 1 bit, Menor valor: false, Maior valor: true
        boolean ativo = true;
        boolean presente = false;

        //char armazena um caractere: Tamanho 16 bits (2 bytes), Menor valor: 0, Maior valor: 2^16 - 1
        //Não funciona com aspas duplas pois representa uma string
        char inicialDoNome = 'M';
        char sexo = 'M';

        //byte armazena valores de 0 a 127: Tamanho 8 bits (1 byte), Menor valor: -2^7, Maior valor: 2^7 - 1
        byte idade = 127; //valor máximo
//      byte idade2 = 128; // não compila

        //short armazena valores de 0 a 32767: Tamanho 8 bits (1 byte), Menor valor: -2^15, Maior valor: 2^15 - 1
        short quantidadeEstoque = 32767; //valor máximo
//      short quantidadeEstoque2 = 32768; //não compila

    }
}