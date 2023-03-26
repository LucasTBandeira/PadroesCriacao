enum Categoria {
    NORMAL, ADVANCED, PREMIUM
};

public class Conta {
    
    private int numero;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int salAplicacaoInicial;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoriaInicial;
 
 public static class Builder{

    private int numero;
    private String nomeCorrentista;
    private int saldoLivreInicial=0;
    private int salAplicacaoInicial=0;
    private double taxaRemuneracao=0;
    private double taxaSaldoNegativo=0;
    private Categoria categoriaInicial=Categoria.NORMAL;

    public static Builder newInstance(int numero, String nomeCorrentista){
        return new Builder(numero,nomeCorrentista);
    }

    private Builder(int numero, String nomeCorrentista ){
        this.numero=numero;
        this.nomeCorrentista=nomeCorrentista;
    }

    public Builder saldoLivreInicial(int saldoLivreInicial){
        this.saldoLivreInicial=saldoLivreInicial;
        return this;
    }

    
    public Builder salAplicacaoInicial(int salAplicacaoInicial){
        this.salAplicacaoInicial=salAplicacaoInicial;
        return this;
    }

    public Builder taxaRemuneracao(double taxaRemuneracao){
        this.taxaRemuneracao=taxaRemuneracao;
        return this;
    }

    public Builder taxaSaldoNegativo(double taxaSaldoNegativo){
        this.taxaSaldoNegativo=taxaSaldoNegativo;
        return this;
    }

    public Builder categoriaInicial(Categoria categoriaInicial){
        this.categoriaInicial=categoriaInicial;
        return this;
    }

    public Conta build(){
        return new Conta(this);
    }

}

    public Conta(Builder builder){ 
        this.numero=builder.numero;
        this.nomeCorrentista=builder.nomeCorrentista;
        this.saldoLivreInicial=builder.saldoLivreInicial;
        this.salAplicacaoInicial=builder.salAplicacaoInicial;
        this.taxaRemuneracao=builder.taxaRemuneracao;
        this.taxaSaldoNegativo=builder.taxaSaldoNegativo;
        this.categoriaInicial=builder.categoriaInicial;
     }

    @Override
    public String toString() {
        return "Conta numero=" + numero + ", nomeCorrentista=" + nomeCorrentista + ", saldoLivreInicial="
                + saldoLivreInicial + ", salAplicacaoInicial=" + salAplicacaoInicial + ", taxaRemuneracao="
                + taxaRemuneracao + ", taxaSaldoNegativo=" + taxaSaldoNegativo + ", categoriaInicial="
                + categoriaInicial;
    }

     
}