public class ConversaoTiposPrimitivos {

    public static void main(String[] args) {
        //conversão implicita sem perder precisão
        int a = 37;
        long b = a;

        //conversão explicita com risco de perda de precisão
        long x = 3785;
//        int y = x; não compila
        int y = (int) x;
    }
}