import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    List<FuncBonus> listaFuncBonus;

    public ControleBonus() {
        this.listaFuncBonus = new ArrayList<>();
    }

    public void adicionaFuncBonus(FuncBonus func) {
        listaFuncBonus.add(func);
    }

    public void exibeFuncBonus() {
        System.out.println(listaFuncBonus);
    }

    public double calculaTotalBonus() {
        double totalVenda = 0.0;
        for(int i = 0; i < listaFuncBonus.size(); i++) {
            totalVenda += listaFuncBonus.get(i).getValorBonus();
        }
        return totalVenda;
    }
}
