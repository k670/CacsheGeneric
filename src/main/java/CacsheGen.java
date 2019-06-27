import java.util.Map;

public class CacsheGen<T extends Map, U> implements ICacshe{

    private T AllUsers;


    @Override
    public void init(long count, Object repository) {
        AllUsers = ((RepositoryGen<T>)repository).getAll(count);
        AllUsers.forEach((i,x)-> System.out.println(x));
    }

    public U get(long id){
        return (U)AllUsers.get(id);
    }

    public U update(long id, String fn, String ln){
        return (U)AllUsers.put(id,new UserModel(id,fn,ln));
    }

    public void showAll(){
        AllUsers.forEach((i,x)-> System.out.println(x));
    }
}
