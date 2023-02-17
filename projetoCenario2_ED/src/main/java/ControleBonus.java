import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    List<Professores> educadores;

    public ControleBonus() {
        this.educadores = new ArrayList<>();
    }

    public void adicionaEducador(Professores prof) {
        educadores.add(prof);
    }

    public void exibeEducadores() {
        System.out.println(educadores);
    }

    public double calculaTotalBonus() {
        double totalVenda = 0.0;
        for(int i = 0; i < educadores.size(); i++) {
            totalVenda += educadores.get(i).getValorBonus();
        }
        return totalVenda;
    }
}
