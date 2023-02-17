public abstract class FuncBonus {

    private String nome;
    private double valorHora;

    public FuncBonus(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public abstract double getValorBonus();

    @Override
    public String toString() {
        return "\n Nome = " + nome +
                "\n Valor hora = " + valorHora;
    }
}
