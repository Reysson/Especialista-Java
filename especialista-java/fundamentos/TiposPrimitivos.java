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
        //byte idade2 = 128; // não compila

        //short armazena valores de 0 a 32767: Tamanho 16 bits (2 bytes), Menor valor: -2^15, Maior valor: 2^15 - 1
        short quantidadeEstoque = 32767; //valor máximo
        //short quantidadeEstoque2 = 32768; //não compila

        //int armazena valores inteiros de 0 2147483648: Tamanho 32 bits (4 bytes), Menor valor: -2^31, Maior valor: 2^31 - 1
        int populacaoUberlandia = 699_097;
        //int populacaoUberlandia2 = 2_147_483_648; não compila

        //long armazena valores inteiros de 0 9,223372037×10¹⁸: Tamanho 64 bits (8 bytes), Menor valor: -2^63, Maior valor: 2^63 - 1
        long meuDinheiro = 515151484231212L;

        /*Para números decimais, automaticamente o java reconhece o double como número decimal, por isso
         no float é necessário colocar a letra 'f'
         */
        double peso = 84.9;
        float peso2 = 72.15F;

    }
}