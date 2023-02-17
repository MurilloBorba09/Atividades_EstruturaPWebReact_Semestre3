public class TestaEducador {

    public static void main(String[] args) {

        ControleBonus contBonus = new ControleBonus();

        ProfessorPadrao prof1 = new ProfessorPadrao("Marcelo", 90.00, 60);
        ProfCoordenador coord1 = new ProfCoordenador("Dan", 105.00, 50, 30);

        contBonus.adicionaEducador(prof1);
        contBonus.adicionaEducador(coord1);
        contBonus.exibeEducadores();
        System.out.println(" Valor total de Salário + Bônus = " + contBonus.calculaTotalBonus());
    }
}
