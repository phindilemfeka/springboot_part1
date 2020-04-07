import org.springframework.beans.factory.annotation.Autowired;

public class FakeRepo {
@Autowired
    public User[] user;

    public String insert(String name, String surname){
        for(int i=0; i<user.length; i++){
           name = user[i].getName();
           surname = user[i].getSurname();
        }
        return insert(name, surname);
    }

    public long find(long Id){
        for (int i = 0; i <user.length ; i++) {
            Id = user[i].getId();
        }
        return Id;
    }

    public long delete(long Id){
        for (int i = 0; i <user.length ; i++) {
        }
        return Id;
    }
}
