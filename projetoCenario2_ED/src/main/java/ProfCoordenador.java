public class ProfCoordenador extends Professores{

    private Integer qtdHorSem;

    public ProfCoordenador(String nome, double valorHora, Integer qtdAulaSem, Integer qtdHorSem) {
        super(nome, valorHora, qtdAulaSem);
        this.qtdHorSem = qtdHorSem;
    }

    public Integer getQtdHorSem() {
        return qtdHorSem;
    }

    public void setQtdHorSem(Integer qtdHorSem) {
        this.qtdHorSem = qtdHorSem;
    }

    @Override
    public double getValorBonus() {
        return qtdHorSem * getValorHora() * 4.5 * 0.2;
    }

    @Override
    public String toString() {
        return "\n Quantidade de horas por semana=" + qtdHorSem +
                "\n Valor do Salário + Bônus = " + getValorBonus();
    }
}
