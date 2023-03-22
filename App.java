import java.util.Collection;

public class App{
    public static void main(String[] args) {
        //exercicio 1 - classe CollectionFactory.java
        Collection<String> b = CollectionFactory.getInstance().getCollection(true, false, false, 10);
        Collection<Integer> a = CollectionFactory.getInstance().getCollection(false, true, false, 10);
    
        a.add(20);
        a.add(30);
        System.out.println(a.getClass());
        for (Integer o : a) {
            System.out.println(o);   
        }

        b.add("teste1");
        b.add("teste2");
        System.out.println(b.getClass());
        for (String o : b) {
            System.out.println(o);   
        }

        //exercicio 2 - classe Cliente.java
        Cliente c1 = new Cliente.Builder("Vermon", 0).build();
        Cliente c2 = new Cliente
                        .Builder("Pedro",1)
                        .categoriaInicial(Cliente.Categoria.PREMIUM)
                        .saldoAplicacaoInicial(10)
                        .saldoLivreInicial(1000)
                        .taxaRemuneracao(10)
                        .taxaSaldoNegativo(5)
                        .build();

        c1.printa();
        c2.printa();


        //exercicio 3 - classe Personagem.java

        Personagem p1 = Personagem.normal();
        Personagem p2 = Personagem.poderoso(100);
        Personagem p3 = Personagem.soturno(5);
        Personagem p4 = Personagem.configuravel(1, 100, 10);

        p1.printa();
        p2.printa();
        p3.printa();
        p4.printa();




    }
}