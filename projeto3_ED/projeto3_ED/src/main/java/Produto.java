public abstract class Produto implements Vendavel {

    private int codigo;
    private double precoCusto;

    public Produto(int codigo, double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "\n Codigo = " + codigo +
                "\n Preco de Custo = " + precoCusto;
    }
}
