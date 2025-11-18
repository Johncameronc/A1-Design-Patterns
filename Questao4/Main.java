public class Main {

    public static void main(String[] args) {

        Chain chain = Chain.getInstance();

        System.out.println("\nCENARIO 1");
        double valor = 900.0;
        String localizacao = "Brasil";
        String historico = "Limpo";
        chain.solicitarVerificacao(valor, localizacao, historico);

        System.out.println("\nCENARIO 2");
        valor = 6000.0;
        localizacao = "Argentina";
        historico = "Sujo";
        chain.solicitarVerificacao(valor, localizacao, historico);

        System.out.println("\nCENARIO 3");
        valor = 900.0;
        localizacao = "Argentina";
        historico = "Limpo";
        chain.solicitarVerificacao(valor, localizacao, historico);

        System.out.println("\nCENARIO 4");
        valor = 900.0;
        localizacao = "Brasil";
        historico = "Sujo";
        chain.solicitarVerificacao(valor, localizacao, historico);

    }

}
