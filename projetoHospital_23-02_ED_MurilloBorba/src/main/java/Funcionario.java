public abstract class Funcionario {

    private String nome;
    private double valorHora;
    private Integer hrsTrabalhadas;

    public Funcionario(String nome, double valorHora, Integer hrsTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.hrsTrabalhadas = hrsTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHrsTrabalhadas() {
        return hrsTrabalhadas;
    }

    public void setHrsTrabalhadas(Integer hrsTrabalhadas) {
        this.hrsTrabalhadas = hrsTrabalhadas;
    }

    public abstract double calcSalario();

    @Override
    public String toString() {
        return "\n Nome do Funcionário = " + nome +
                "\n Valor da hora trabalhada = " + valorHora +
                "\n Horas trabalhadas = " + hrsTrabalhadas +
                "\n Salário = " + calcSalario() + "\n";
    }
}
