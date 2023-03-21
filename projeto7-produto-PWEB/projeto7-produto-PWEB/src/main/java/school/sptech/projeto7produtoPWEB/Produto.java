package school.sptech.projeto7produtoPWEB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double precoUnitario;
    private int qtdEstoque;

    public Produto() {
    }

    public Produto(Long id, String nome, double precoUnitario, int qtdEstoque) {
        this.id = id;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.qtdEstoque = qtdEstoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "\n Id = " + id +
                "\n Nome = " + nome +
                "\n Preço Unitário = " + precoUnitario +
                "\n Qtd no estoque = " + qtdEstoque;
    }
}
