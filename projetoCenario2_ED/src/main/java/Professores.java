public abstract class Professores{

    private String nome;
    private double valorHora;
    private Integer qtdAulaSem;

    public Professores(String nome, double valorHora, Integer qtdAulaSem) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.qtdAulaSem = qtdAulaSem;
    }

    public abstract double getValorBonus();

    public String getNome() {
        return nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public Integer getQtdAulaSem() {
        return qtdAulaSem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setQtdAulaSem(Integer qtdAulaSem) {
        this.qtdAulaSem = qtdAulaSem;
    }

    @Override
    public String toString() {
        return "\n Nome = " + nome +
                "\n Valor hora = " + valorHora +
                "\n Quantidade de aulas por semana=" + qtdAulaSem;
    }
}
