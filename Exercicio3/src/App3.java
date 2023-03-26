public class App3 {
    public static void main(String args[]){

        Personagem normal = Personagem.normal();
        System.out.println("normal " +normal);

        Personagem poderoso = Personagem.poderoso(1000);
        System.out.println("poderoso " +poderoso);

        Personagem soturno = Personagem.soturno(5);
        System.out.println("soturno " +soturno);

        Personagem diferente = Personagem.completa(1, 10, 5);
        System.out.println("diferente " +diferente);
    }
}
