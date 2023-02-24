public abstract class FuncRH extends Funcionario{

    private Integer cpf;
    private String cidade;

    public FuncRH(String nome, double valorHora, Integer hrsTrabalhadas, Integer cpf, String cidade) {
        super(nome, valorHora, hrsTrabalhadas);
        this.cpf = cpf;
        this.cidade = cidade;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\n cpf = " + cpf +
                "\n cidade = " + cidade +
                super.toString();
    }
}
