import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionFactory {
    static CollectionFactory instance;

    private CollectionFactory(){
    }

    static public CollectionFactory getInstance(){
        if(instance == null){
            instance = new CollectionFactory();
        }
        return (instance);
    }

    public <T> Collection<T> getCollection(boolean tamConhecido, boolean ordenado, boolean repetido, int tamanho){
        if(tamConhecido){
            return new ArrayList<>(tamanho);
        }
        else{
            if(ordenado){
                return new LinkedList<>();
            }
            if(repetido){
                return new HashSet<>();
            }
            if(!repetido){
                return new TreeSet<>();
            }
        }
        return null;
      
    }
}
