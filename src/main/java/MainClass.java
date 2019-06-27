
import java.util.*;

public class MainClass {
    static long COUNT = 10000;
    static long NANO = 1000000;
    public static  void main(String[] args) {

        //HashMap init
        CacsheGen<HashMap<Long,UserModel>,UserModel> hashMap = new CacsheGen<HashMap<Long,UserModel>,UserModel>();
        hashMap.init(COUNT,new RepositoryGen<HashMap<Long, UserModel>>(new HashMap<Long, UserModel>()));


        //TreeMap init
        CacsheGen<TreeMap<Long,UserModel>,UserModel> tree = new CacsheGen<TreeMap<Long,UserModel>,UserModel>();
        tree.init(COUNT,new RepositoryGen<TreeMap<Long, UserModel>>(new TreeMap<Long, UserModel>()));

        //measuring duration
        DurationUpdate(tree,"TreeMap");
        DurationGet(tree,"TreeMap");
        DurationUpdate(hashMap,"HashMap");
        DurationGet(hashMap,"HashMap");
    }

    public static  void DurationUpdate(ICacshe m, String s){
        long startTime = System.nanoTime();
        for (long j = 0; j<COUNT;j++){
            m.update(j,"qwe"+(COUNT-j),"rty");
        }
        long endTime = System.nanoTime();
        //m.showAll();
        long duration = (endTime - startTime);
        System.out.println("duration update "+s+" = "+duration/NANO );
    }

    public static  void DurationGet(ICacshe m, String s){
        long startTime = System.nanoTime();
        for (long j = 0; j<COUNT;j++){
            m.get(j);
        }
        long endTime = System.nanoTime();
        //m.showAll();
        long duration = (endTime - startTime);
        System.out.println("duration get "+s+" = "+duration/NANO );
    }
}
