public class App2 {
    public static void main(String[] args) throws Exception {


        Conta conta1  = Conta.Builder.newInstance(30, "Fernando").build();

        Conta conta2 = Conta.Builder.newInstance(25, "Julio")
        .saldoLivreInicial(3500)
        .salAplicacaoInicial(2755)
        .taxaRemuneracao(0.12)
        .taxaSaldoNegativo(0.1)
        .categoriaInicial(Categoria.ADVANCED)
        .build();

        Conta conta3 = Conta.Builder.newInstance(31, "Jorge")
        .saldoLivreInicial(500000)
        .salAplicacaoInicial(10000)
        .categoriaInicial(Categoria.PREMIUM)
        .build();
        
        System.out.println("\n"+conta2+"\n"+conta3);
            
    }
}