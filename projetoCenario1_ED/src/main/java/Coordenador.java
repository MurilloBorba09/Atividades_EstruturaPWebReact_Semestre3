public class Coordenador extends FuncBonus{

    private Integer qtdHorSem;

    public Coordenador(String nome, double valorHora, Integer qtdHorSem) {
        super(nome, valorHora);
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
        return "\n\n Nome do Funcionário = " + getNome() +
                "\n Quantidade de horas por semana = " + qtdHorSem +
                "\n Valor do Salário + Bônus = " + getValorBonus();
    }
}
