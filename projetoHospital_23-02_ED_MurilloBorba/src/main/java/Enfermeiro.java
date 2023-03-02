public class Enfermeiro extends FuncMedicina{

    public Enfermeiro(String nome, double valorHora, Integer hrsTrabalhadas, Integer crm, String estado) {
        super(nome, valorHora, hrsTrabalhadas, crm, estado);
    }

    @Override
    public void fazerHoraExtra(int horasAMais) {

        setHrsTrabalhadas(getHrsTrabalhadas() + horasAMais);
    }

    @Override
    public double calcSalario() {

        return getHrsTrabalhadas() * getValorHora();
    }

    @Override
    public String toString() {
        return "\n Enfermeiro: " + super.toString() + "\n";
    }
}
