public class AnalistRH extends FuncRH{

    public AnalistRH(String nome, double valorHora, Integer hrsTrabalhadas, Integer cpf, String cidade) {
        super(nome, valorHora, hrsTrabalhadas, cpf, cidade);
    }

    @Override
    public double calcSalario() {
        return getHrsTrabalhadas() * getValorHora();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
