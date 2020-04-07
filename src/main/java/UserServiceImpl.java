import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    public FakeRepo fakeRepo;

    public void addUser(String name, String surname){
        name = fakeRepo.insert("Shirley", "Ndou");
        System.out.println("name" + name);
    }

    @Override
    public void removeUser(long Id) {
       Id = fakeRepo.delete(123);
        System.out.println(Id + "removed");
    }

    @Override
    public void getUser(long Id) {
        Id = fakeRepo.find(542);
        System.out.println("hello" + Id);
    }

}
