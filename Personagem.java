public class Personagem {
    int visibilidade;
    int poder;
    int vidas;


    private Personagem(int vis, int p, int vidas){
        this.visibilidade = vis;
        this.poder = p;
        this.vidas = vidas;
    }

    public static Personagem normal(){
        return new Personagem(10, 50, 3);
    }

    public static Personagem poderoso(int p){
        return new Personagem(10, p, 3);
    }

    public static Personagem soturno(int v){
        return new Personagem(v, 50, 3);
    }

    public static Personagem configuravel(int v, int p, int vi){
        return new Personagem(v, p, vi);
    }

    public void printa() {
        System.out.println( "Personagem [visibilidade=" + visibilidade + ", poder=" + poder + ", vidas=" + vidas + "]");
    }


    
}
