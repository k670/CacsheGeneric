import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class RepositoryGen <T extends  Map>{

    T res;
    public RepositoryGen(T tNew){
        this.res = tNew;;
    }
    public  T getAll(long count){
        Stream.iterate(new UserModel(0,"fn0","ln0"), x-> new UserModel(++x.id,"fn"+x.id,"ln"+x.id))
                .limit(count)
                .forEach((n)->{if(!res.containsKey(n.id)){res.put(n.id,n);}});
        //stream.forEach(System.out::println);
        return res;
    }
}
