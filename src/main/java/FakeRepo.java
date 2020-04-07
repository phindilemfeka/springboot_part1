import org.springframework.beans.factory.annotation.Autowired;

public class FakeRepo {
@Autowired
    public User[] user;

    public void insert(String name, String surname){
        for(int i=0; i<user.length; i++){
           name = user[i].getName();
           surname = user[i].getSurname();
        }
    }

    public void find(long Id){
        for (int i = 0; i <user.length ; i++) {
            Id = user[i].getId();
        }
    }

    public void delete(long Id){

    }
}
