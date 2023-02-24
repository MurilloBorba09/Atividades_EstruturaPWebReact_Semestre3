import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String nome;
    private String endereco;
    private Integer cnpj;

    private List<Funcionario> funcionarios;

    public Hospital(String nome, String endereco, Integer cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public void exibeFunc() {

    }

    public void adicionaFunc(Funcionario func) {

    }

    public void exibeFuncGeral() {

    }

    public double calculaSalarioGeral() {
        return 0.0;
    }

    public void exibeFuncMedic() {

    }

    public void exibeFuncRh() {

    }

    @Override
    public String toString() {
        return "\n Nome do Hospital = " + nome +
                "\n Endereço do Hospital = " + endereco +
                "\n CNPJ = " + cnpj +
                "\n Funcionarios do Hospital = " + funcionarios;
    }
}
