public class Servico implements Vendavel {

    private String descricao;
    private int codigo;
    private int qtdHoras;
    private double valorHora;

    public Servico(String descricao, int codigo, int qtdHoras, double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double getValorVenda() {
        return qtdHoras * valorHora;
    }

    @Override
    public String toString() {
        return "\n Descricao = " + descricao +
                "\n Codigo = " + codigo +
                "\n Quantidade de Horas = " + qtdHoras +
                "\n Valor por Hora = " + valorHora +
                "\n Valor da venda = " + getValorVenda();
    }
}
