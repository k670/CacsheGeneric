public class UserModel {
    public UserModel(long id, String fn, String ln){
        this.id = id;
        this.FirstName = fn;
        this.LastName = ln;
    }

    @Override
    public String toString() {
        return id+". "+FirstName+" "+LastName;
    }

    long id;
    String FirstName;
    String LastName;
}
