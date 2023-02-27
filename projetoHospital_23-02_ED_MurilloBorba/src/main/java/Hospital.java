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

    public void adicionaFunc(Funcionario func) {
        funcionarios.add(func);
    }

    public void exibeFuncGeral() {
        System.out.println(funcionarios);
    }

    public double calculaSalarioGeral() {
        double salarioGeral = 0.0;

        for(int i = 0; i < funcionarios.size(); i++) {
            salarioGeral += funcionarios.get(i).calcSalario();
        }
        return salarioGeral;
    }

    public void exibeFuncMedic() {
        for(int i = 0; i < funcionarios.size(); i++) {
            if() {

            }
        }
    }

    public void exibeFuncRh() {
        for(int i = 0; i < funcionarios.size(); i++) {
            if() {

            }
        }
    }

    @Override
    public String toString() {
        return "\n Nome do Hospital = " + nome +
                "\n Endereço do Hospital = " + endereco +
                "\n CNPJ = " + cnpj +
                "\n Funcionarios do Hospital = " + funcionarios;
    }
}
