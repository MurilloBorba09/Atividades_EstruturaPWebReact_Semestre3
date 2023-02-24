public class Professor extends FuncBonus{

    private Integer qtdAulasSem;

    public Professor(String nome, double valorHora, Integer qtdAulasSem) {
        super(nome, valorHora);
        this.qtdAulasSem = qtdAulasSem;
    }

    public Integer getQtdAulasSem() {
        return qtdAulasSem;
    }

    public void setQtdAulasSem(Integer qtdAulasSem) {
        this.qtdAulasSem = qtdAulasSem;
    }

    @Override
    public double getValorBonus() {
        return qtdAulasSem * getValorHora() * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "\n\n Nome do Funcionário = " + getNome() +
                "\n Quantidade de aulas por semana = " + qtdAulasSem +
                "\n Valor do Salário + Bônus = " + getValorBonus();
    }
}
