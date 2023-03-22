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
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categorialInicial = builder.categoriaInicial;
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
        private double taxaRemuneracao = 0.0;
        private double taxaSaldoNegativo = 0.0;
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

        public ContaBuilder taxaRemuneracao(double taxaRemuneracao) {
            this.taxaRemuneracao = taxaRemuneracao;
            return this;
        }

        public ContaBuilder taxaSaldoNegativo(double taxaSaldoNegativo){
            this.taxaSaldoNegativo = taxaSaldoNegativo;
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
