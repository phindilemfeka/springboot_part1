public class UserServiceImpl implements UserService {
   // @Autowired
    //public FakeRepo fakeRepo;

    FakeRepo fr = new FakeRepo();

    @Override
    public String addUser(String name, String surname) {
        fr.insertUser(1, "shirley", "ndou");
        return name;
    }

    @Override
    public void removeUser(long Id) {

    }

    @Override
    public long getUser(long Id) {
      fr.findUserById(1);
        return Id;
    }
}
