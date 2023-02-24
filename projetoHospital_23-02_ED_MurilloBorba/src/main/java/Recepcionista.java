public class Recepcionista extends Funcionario{

    private Integer cpf;

    public Recepcionista(String nome, double valorHora, Integer hrsTrabalhadas, Integer cpf) {
        super(nome, valorHora, hrsTrabalhadas);
        this.cpf = cpf;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcSalario() {

        return getHrsTrabalhadas() * getValorHora();
    }

    @Override
    public String toString() {
        return "\n cpf = " + cpf +
                super.toString();
    }
}
