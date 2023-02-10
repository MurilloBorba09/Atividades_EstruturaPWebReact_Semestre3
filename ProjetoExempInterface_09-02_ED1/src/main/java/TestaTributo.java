public class TestaTributo {

    public static void main(String[] args) {

        Alimento al1 = new Alimento(22, "Patinho", 43.00, 1000);

        Perfume perf1 = new Perfume(54, "Kayak", 80.00, "Amadeirado");

        Servico serv1 = new Servico("Construcao Piscina", 20000.00);

        Tributo trib1 = new Tributo();

        trib1.adicionaTributavel(al1);
        trib1.adicionaTributavel(perf1);
        trib1.adicionaTributavel(serv1);

        trib1.exibeTodos();
        trib1.calculaTotalTributo();
    }
}
