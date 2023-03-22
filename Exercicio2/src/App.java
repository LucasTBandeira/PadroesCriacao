public class App {
    public static void main(String[] args) throws Exception {

        Conta conta1 = new Conta.ContaBuilder(1l, "ContaNormal")
        .build();

        Conta conta2 = new Conta.ContaBuilder(2l,"ContaAdvanced")
        .saldoLivreInicial(1000)
        .saldoAplicacaoInicial(5000)
        .categoriaInicial(Conta.Categoria.ADVANCED)
        .build();

        Conta conta3 = new Conta.ContaBuilder(3l,"ContaPremium")
        .saldoLivreInicial(5000)
        .saldoAplicacaoInicial(10000)
        .categoriaInicial(Conta.Categoria.PREMIUM)
        .build();

        System.out.println(conta1.toString());
        System.out.println("=======================");
        System.out.println(conta2.toString());
        System.out.println("=======================");
        System.out.println(conta3.toString());
    }
}
