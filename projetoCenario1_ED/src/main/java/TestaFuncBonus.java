public class TestaFuncBonus {

    public static void main(String[] args) {

        ControleBonus contBonus = new ControleBonus();

        Professor prof1 = new Professor("Marcelo", 90.00, 60);
        Coordenador coord1 = new Coordenador("Dan", 105.00, 50);

        contBonus.adicionaFuncBonus(prof1);
        contBonus.adicionaFuncBonus(coord1);
        contBonus.exibeFuncBonus();
        System.out.println(" Valor total de Salário + Bônus = " + contBonus.calculaTotalBonus());
    }
}
