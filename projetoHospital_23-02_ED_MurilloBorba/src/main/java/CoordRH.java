public class CoordRH extends FuncRH{

    private double bonus;

    public CoordRH(String nome, double valorHora, Integer hrsTrabalhadas, Integer cpf, String cidade, double bonus) {
        super(nome, valorHora, hrsTrabalhadas, cpf, cidade);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcSalario() {
        return (getHrsTrabalhadas() * getValorHora()) + bonus;
    }

    @Override
    public String toString() {
        return "\n Valor de bonus = " + bonus +
                super.toString();
    }
}
