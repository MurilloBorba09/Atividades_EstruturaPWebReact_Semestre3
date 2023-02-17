public class ProfessorPadrao extends Professores{

    public ProfessorPadrao(String nome, double valorHora, Integer qtdAulaSem) {
        super(nome, valorHora, qtdAulaSem);
    }

    public double getValorBonus() {
        return getQtdAulaSem() * getValorHora() * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "\n Quantidade de aulas por semana=" + getQtdAulaSem() +
                "\n Valor do Salário + Bônus = " + getValorBonus();
    }
}
