import java.util.Scanner;

public class TestaCarrinho {

    Scanner leitor = new Scanner(System.in);
    public String menu(Carrinho car1) {

        String frase = String.format(
                "\n 1. Adicionar Livro" +
                "\n 2. Adicionar DVD" +
                "\n 3. Adicionar Serviço" +
                "\n 4. Exibir itens do Carrinho" +
                "\n 5. Exibir total de Venda" +
                "\n 6. Fim");

        int numeroDigitado = leitor.nextInt();

        /*
        if(numeroDigitado == 1) {
            return car1.adicionaVendavel();
        } else if(numeroDigitado == 2) {
            return car1.adicionaVendavel();
        } else if(numeroDigitado == 3) {
            return car1.adicionaVendavel();
        } else if(numeroDigitado == 4) {
            car1.exibeItensCarrinho();
        } else if(numeroDigitado == 5) {
            car1.calculaTotalVenda();
        } else {
            return frase;
        }
        */



        return frase;
    }
    public static void main(String[] args) {

    }
}
