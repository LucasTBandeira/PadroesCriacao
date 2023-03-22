public class Conta {
    public enum Categoria {
        NORMAL, ADVANCED, PREMIUM
    };

    private Long numero;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int saldoAplicacaoInicial;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categorialInicial;

    private Conta(ContaBuilder builder) {
        this.numero = builder.numero;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.saldoLivreInicial = builder.saldoLivreInicial;
        this.saldoAplicacaoInicial = builder.saldoAplicacaoInicial;
        this.categorialInicial = builder.categoriaInicial;

        if(categorialInicial == Conta.Categoria.NORMAL) {
            this.taxaRemuneracao = 0.1;
            this.taxaSaldoNegativo = 0.3;
        }

        if(categorialInicial == Conta.Categoria.ADVANCED) {
            this.taxaRemuneracao = 0.2;
            this.taxaSaldoNegativo = 0.2;
        }

        if(categorialInicial == Conta.Categoria.PREMIUM) {
            this.taxaRemuneracao = 0.3;
            this.taxaSaldoNegativo = 0.1;
        }
    }

    public Long getNumero() {
        return numero;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public int getSaldoLivreInicial() {
        return saldoLivreInicial;
    }

    public int getSaldoAplicacaoInicial() {
        return saldoAplicacaoInicial;
    }

    public double getTaxaRemuneracao() {
        return taxaRemuneracao;
    }

    public double getTaxaSaldoNegativo() {
        return taxaSaldoNegativo;
    }

    public Categoria getCategorialInicial() {
        return categorialInicial;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", nomeCorrentista=" + nomeCorrentista + ", saldoLivreInicial="
                + saldoLivreInicial + ", saldoAplicacaoInicial=" + saldoAplicacaoInicial + ", taxaRemuneracao="
                + taxaRemuneracao + ", taxaSaldoNegativo=" + taxaSaldoNegativo + ", categorialInicial="
                + categorialInicial + "]";
    }

    public static class ContaBuilder {

        // Required parameters
        private Long numero;
        private String nomeCorrentista;

        // Optional parameters
        private int saldoLivreInicial = 0;
        private int saldoAplicacaoInicial = 0;
        private Categoria categoriaInicial = Categoria.NORMAL;

        public ContaBuilder(Long numero, String nomeCorrentista) {
            this.numero = numero;
            this.nomeCorrentista = nomeCorrentista;
        }

        public ContaBuilder saldoLivreInicial(int saldoLivreInicial) {
            this.saldoLivreInicial = saldoLivreInicial;
            return this;
        }

        public ContaBuilder saldoAplicacaoInicial(int saldoAplicacaoInicial) {
            this.saldoAplicacaoInicial = saldoAplicacaoInicial;
            return this;
        }

        public ContaBuilder categoriaInicial(Conta.Categoria categoria) {
            this.categoriaInicial = categoria;
            return this;
        }

        public Conta build(){ // Return the finally constructed Conta object
            Conta conta = new Conta(this);
            return conta;
        }
    }

}
