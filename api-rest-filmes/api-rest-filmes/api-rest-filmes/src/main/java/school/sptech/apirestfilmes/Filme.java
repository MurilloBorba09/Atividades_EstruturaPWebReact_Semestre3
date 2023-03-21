package school.sptech.apirestfilmes;

public class Filme {

    private String nome;
    private Integer anoLancamento;
    private int qtdOscar;

    public Filme(String nome, Integer anoLancamento, int qtdOscar) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.qtdOscar = qtdOscar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getQtdOscar() {
        return qtdOscar;
    }

    public void setQtdOscar(int qtdOscar) {
        this.qtdOscar = qtdOscar;
    }

    @Override
    public String toString() {
        return "\n Nome = " + nome +
                "\n Ano de Lancamento = " + anoLancamento +
                "\n Qtd de Oscars = " + qtdOscar;
    }
}
