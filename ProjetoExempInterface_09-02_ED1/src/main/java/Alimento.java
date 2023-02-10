public class Alimento extends Produto{

    private Integer quantVitamin;

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamin) {
        super(codigo, descricao, preco);
        this.quantVitamin = quantVitamin;
    }

    @Override
    public double getValorTributo() {
        double valorTributo = getPreco() * 0.15;

        return valorTributo;
    }

    @Override
    public String toString() {
        return "\n Valor Inicial = " + getPreco() +
                "\n Quantidade de Vitamina = " + quantVitamin +
                "\n Valor da Tributacao = " + getValorTributo() +
                "\n Valor Final = " + (getPreco() + getValorTributo());
    }
}
