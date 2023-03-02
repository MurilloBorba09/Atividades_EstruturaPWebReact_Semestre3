public class TestaFuncHosp {

    public static void main(String[] args) {

        Hospital hosp1 = new Hospital("Cruz Azul", "Cambuci", 123456);

        Medico med1 = new Medico("Marcelo", 100.00, 200, 14525, "SP", 100);
        Enfermeiro enf1 = new Enfermeiro("Mauricio", 75.00, 210, 75651, "RS");
        Recepcionista rec1 = new Recepcionista("Allan", 55.00, 160, 1452354);
        AnalistRH rhAna1 = new AnalistRH("Gustavo", 70.00, 160, 7496289, "Rio de Janeiro");
        CoordRH rhCoord1 = new CoordRH("Arthur", 90.00, 160, 7565945, "Salvador", 300.00);

        hosp1.adicionaFunc(med1);
        hosp1.adicionaFunc(enf1);
        hosp1.adicionaFunc(rec1);
        hosp1.adicionaFunc(rhAna1);
        hosp1.adicionaFunc(rhCoord1);

        hosp1.exibeFuncGeral();
        System.out.println( "\n Salário Geral = " + hosp1.calculaSalarioGeral());
        //hosp1.exibeFuncMedic();
        //hosp1.exibeFuncRh();
    }
}
