public abstract class FuncMedicina extends Funcionario{

    private Integer crm;
    private String estado;

    public FuncMedicina(String nome, double valorHora, Integer hrsTrabalhadas, Integer crm, String estado) {
        super(nome, valorHora, hrsTrabalhadas);
        this.crm = crm;
        this.estado = estado;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract void fazerHoraExtra(int horasAMais);

    @Override
    public String toString() {
        return "\n CRM = " + crm +
                "\n Estado de atuação = " + estado +
                super.toString() + "\n";
    }
}
