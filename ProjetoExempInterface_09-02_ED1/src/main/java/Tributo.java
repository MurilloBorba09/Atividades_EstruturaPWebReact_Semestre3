import java.util.ArrayList;
import java.util.List;

public class Tributo {

    public List<Tributavel> listaTributos;

    public Tributo() {
        this.listaTributos = new ArrayList<>();
    }

    public void adicionaTributavel(Tributavel trib) {
        listaTributos.add(trib);
    }

    public double calculaTotalTributo() {
        double totalProduto = 0.0;
        for(Tributavel trib : listaTributos) {
            totalProduto = totalProduto = trib.getValorTributo();
        }
        return totalProduto;
    }

    public void exibeTodos() {
        for(Tributavel i : listaTributos) {
            System.out.println(i);
        }
    }
}
