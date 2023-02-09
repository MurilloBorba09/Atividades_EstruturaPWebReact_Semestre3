public class AlunoGraduacao extends Aluno {

    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(Integer ra, String nome, Double nota1, Double nota2) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Double calcMedia() {
        return (nota1 * 0.4) + (nota2 * 0.6);
    }

    @Override
    public String toString() {
        return "\n Nome: " + getNome() +
                "\n nota1 = " + nota1 +
                "\n nota2 = " + nota2 +
                "\n media = " + calcMedia();
    }
}
