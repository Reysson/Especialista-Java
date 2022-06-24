public class OperadorIncremento {

    public static void main(String[] args) {
        int totalDownloads = 10;

//        totalDownloads = totalDownloads + 1;
//        totalDownloads += 1;
//        totalDownloads++;

        //vai atribuir a variavel antes de realiazar a operação
        int novoTotalDownloads = totalDownloads++;

        //realiza a operação depois atribui a variavel
        int novoTotalDownloads2 = ++novoTotalDownloads;

        System.out.println("Novo total Downloads: " + novoTotalDownloads + " Novo total Downloads 2: " +  novoTotalDownloads2);

    }
}