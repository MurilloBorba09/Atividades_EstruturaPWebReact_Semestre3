public class AlunoPos extends Aluno{

    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    public Double calcMedia() {
        for()
    }

    @Override
    public String toString() {
        return "\n Nome: " + getNome() +
                "\n nota1 = " + nota1 +
                "\n nota2 = " + nota2 +
                "\n nota3 = " + notaMonografia +
                "\n media = " + calcMedia();
    }
}
