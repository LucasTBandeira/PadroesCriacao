public class App {
    public static void main(String[] args) throws Exception {

        Conta conta1 = new Conta.ContaBuilder(1l, "ContaMínima")
        .build();

        Conta conta2 = new Conta.ContaBuilder(2l,"ContaCompleta")
        .saldoLivreInicial(1000)
        .saldoAplicacaoInicial(5000)
        .taxaRemuneracao(0.2)
        .taxaSaldoNegativo(0.2)
        .categoriaInicial(Conta.Categoria.ADVANCED)
        .build();

        System.out.println(conta1.toString());
        System.out.println("=======================");
        System.out.println(conta2.toString());
    }
}
