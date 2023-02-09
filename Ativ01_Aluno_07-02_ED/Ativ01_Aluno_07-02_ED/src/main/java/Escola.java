import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Aluno> alunos;

    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    public void adicionaAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibeTodos() {

    }

    public void exibeAlunosGraduacao() {

    }

    public void exibeAprovados() {

    }

    public void buscaAlunos() {

    }

    @Override
    public String toString() {
        return "nome = " + nome;
    }
}
