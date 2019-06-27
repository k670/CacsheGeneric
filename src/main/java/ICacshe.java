import java.util.Map;

public interface ICacshe<U> {
    public void init(long count,Object repository);
    public U get(long id);
    public U update(long id, String fn, String ln);
    public void showAll();
}
