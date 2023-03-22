import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionFactory{
    private static CollectionFactory instance;

    private CollectionFactory(){
    }

    static public CollectionFactory getInstance(){
        if(instance==null){
            instance= new CollectionFactory();
        }
        return (instance);
    }

    public <T> Collection<T> getCollection(boolean tamanhoConhecido,int tamanho, boolean ordenado, boolean podeRepetido ){

        if(tamanhoConhecido && !ordenado && podeRepetido){
            return new ArrayList<T>(tamanho);
        }else if(!tamanhoConhecido && !ordenado && podeRepetido){
            return new ArrayList<T>();
        }else if(!tamanhoConhecido && !ordenado && !podeRepetido ){
            return new HashSet<T>();
        }else if(!tamanhoConhecido && ordenado && !podeRepetido){
            return new TreeSet<T>();
        }else {
            return null;
        }
    }
    
}