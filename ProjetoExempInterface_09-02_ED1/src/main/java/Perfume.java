public class Perfume extends Produto{

    private String fragrancia;

    public Perfume(Integer codigo, String descricao, Double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    @Override
    public double getValorTributo() {
        double valorTributo = getPreco() * 0.27;

        return valorTributo;
    }

    @Override
    public String toString() {
        return "\n Valor Inicial = " + getPreco() +
                "\n Fragrancia = " + fragrancia +
                "\n Valor da Tributacao = " + getValorTributo() +
                "\n Valor Final = " + (getPreco() + getValorTributo());
    }
}

