public class Medico extends FuncMedicina{

    private Integer consultasFeitas;

    public Medico(String nome, double valorHora, Integer hrsTrabalhadas, Integer crm, String estado, Integer consultasFeitas) {
        super(nome, valorHora, hrsTrabalhadas, crm, estado);
        this.consultasFeitas = consultasFeitas;
    }

    public Integer getConsultasFeitas() {
        return consultasFeitas;
    }

    public void setConsultasFeitas(Integer consultasFeitas) {
        this.consultasFeitas = consultasFeitas;
    }

    @Override
    public void fazerHoraExtra(int horasAMais) {

        setHrsTrabalhadas(getHrsTrabalhadas() + horasAMais);
    }

    @Override
    public double calcSalario() {

        return (getHrsTrabalhadas() + (consultasFeitas * 0.5)) * getValorHora();
    }

    @Override
    public String toString() {
        return "\n Consultas Feitas = " + consultasFeitas +
                super.toString();
    }
}
