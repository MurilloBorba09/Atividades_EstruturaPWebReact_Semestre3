public class TesteAluno {

    public static void main(String[] args) {
        Escola e1 = new Escola("PM");

        AlunoFundamental aluno1 = new AlunoFundamental
                (123, "Murillo", 8.0, 9.0, 2.0, 7.0);
        e1.adicionaAlunos(aluno1);

        AlunoGraduacao aluno2 = new AlunoGraduacao(456, "Ciano", 10.0, 5.5);
        e1.adicionaAlunos(aluno2);

        AlunoPos aluno3 = new AlunoPos(789, "SasukNarut", 9.0, 1.5, 8.5);

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
    }
}
