public class App2 {
    public static void main(String[] args) throws Exception {

        Conta conta1 = Conta.Builder.newInstance(9999,"maria")
                       .build();

        System.out.println(conta1);


        Conta conta2 =  Conta.Builder.newInstance(777,"anderson")
                        .saldoLivreInicial(7000)
                        .salAplicacaoInicial(1120)
                        .taxaRemuneracao(0.12)
                        .taxaSaldoNegativo(0.1)
                        .categoriaInicial(Categoria.ADVANCED)
                        .build();
        
        System.out.println("\n"+conta2);
            
    }
}