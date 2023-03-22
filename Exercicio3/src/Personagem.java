public class Personagem {

    private int visibilidade,poder,vidas;

    public Personagem(int visibilidade, int poder, int vidas){
        this.visibilidade=visibilidade;
        this.vidas=vidas;
        this.poder=poder;
    }

    public static Personagem normal(){
        return new Personagem(10, 50, 3);
    }

    public static Personagem poderoso(int poder){
        if(poder>100){
            poder=100;
        }else if(poder<0){
            poder=0;
        }
        return new Personagem(10, poder, 3);
    }

    public static Personagem soturno(int visibilidade){
        if(visibilidade>10){
            visibilidade=10;
        }else if(visibilidade<0){
            visibilidade=0;
        }
        return new Personagem(visibilidade, 50, 3);
    }

    public static Personagem completa(int visibilidade, int poder, int vidas){
        if(visibilidade>10){
            visibilidade=10;
        }else if(visibilidade<0){
            visibilidade=0;
        }
        if(poder>100){
            poder=100;
        }else if(poder<0){
            poder=0;
        }
        if(vidas>5){
            vidas=5;
        }else if(vidas<0){
            vidas=0;
        }
       
        return new Personagem(visibilidade, poder, vidas);
    }


    @Override
    public String toString() {
        return "Personagem [visibilidade=" + visibilidade + ", poder=" + poder + ", vidas=" + vidas + "]";
    }

    
    
}
