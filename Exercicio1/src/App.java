import java.util.Collection;

public class App {
    public static void main(String[] args) throws Exception {

        CollectionFactory factory1=CollectionFactory.getInstance();
        Collection<String> col1 = factory1.getCollection(false, 0, false, true);
        col1.add("a");
        col1.add("c");
        col1.add("b");

        System.out.println(col1.getClass());
        for(String i: col1){
            System.out.println(i);
        }

        Collection<Integer> col2 = factory1.getCollection(false, 0, true, false);
        col2.add(1);
        col2.add(3);
        col2.add(2);
        col2.add(7);

        int acum=0;
        for(int i: col2){
            acum+=i;
        }

        System.out.println(acum);

        System.out.println(col2.getClass());
        for(Integer i: col2){
            System.out.println(i);
        }

    }
}
