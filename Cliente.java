public class Cliente {
    public static enum Categoria {
        NORMAL, ADVANCED, PREMIUM
    };

    long numero;
    String nomeCorrentista;
    int saldoLivreInicial;
    int salAplicacaoInicial;
    double taxaRemuneracao;
    double taxaSaldoNegativo;
    Categoria categoriaInicial;

    public Cliente() {
    }

    public static class Builder {
        long numero;
        String nomeCorrentista;
        int saldoLivreInicial = 0;
        int salAplicacaoInicial = 0;
        double taxaRemuneracao = 0;
        double taxaSaldoNegativo = 0;
        Categoria categoriaInicial = Categoria.NORMAL;

        public Builder(String nome, long num) {
            this.nomeCorrentista = nome;
            this.numero = num;
        }

        public Builder saldoLivreInicial(int x) {
            this.saldoLivreInicial = x;
            return this;
        }

        public Builder saldoAplicacaoInicial(int x) {
            this.salAplicacaoInicial = x;
            return this;
        }

        public Builder taxaRemuneracao(double x) {
            this.taxaRemuneracao = x;
            return this;
        }

        public Builder taxaSaldoNegativo(double x) {
            this.taxaSaldoNegativo = x;
            return this;
        }

        public Builder categoriaInicial(Categoria c) {
            this.categoriaInicial = c;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }

    private Cliente(Builder builder) {
        this.numero = builder.numero;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.saldoLivreInicial = builder.saldoLivreInicial;
        this.salAplicacaoInicial = builder.salAplicacaoInicial;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categoriaInicial = builder.categoriaInicial;
    }

    public void printa() {
        System.out.println("Cliente [numero=" + numero + ", nomeCorrentista=" + nomeCorrentista + ", saldoLivreInicial="
                + saldoLivreInicial + ", salAplicacaoInicial=" + salAplicacaoInicial + ", taxaRemuneracao="
                + taxaRemuneracao + ", taxaSaldoNegativo=" + taxaSaldoNegativo + ", categoriaInicial="
                + categoriaInicial + "]");
    }

}
