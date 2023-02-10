public class Servico implements Tributavel{

    private String descricao;

    private double preco;

    public Servico(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public double getValorTributo() {
        double valorTributo = preco * 0.12;

        return valorTributo;
    }

    @Override
    public String toString() {
        return "\n Descricao = " + descricao +
                "\n Preco = " + preco +
                "\n Valor da Tributacao = " + getValorTributo() +
                "\n Valor FInal = " + (preco + getValorTributo());
    }
}
