import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private static List<Vendavel> cart;

    public Carrinho() {
        this.cart = new ArrayList<>();
    }

    public void adicionaVendavel(Vendavel vendavel) {
        cart.add(vendavel);
        System.out.println("Venda adicionada!");
    }

    public double calculaTotalVenda() {
        double totalVenda = 0.0;
        for(int i=0; i <= cart.size(); i++) {
            totalVenda += cart.get(i).getValorVenda();
        }

        return totalVenda;
    }

    public void exibeItensCarrinho() {
        System.out.println(cart);
    }
}
