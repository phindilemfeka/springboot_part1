public interface UserService {

    String addUser(String name, String surname);
    void removeUser(long Id);
    long getUser(long Id);
}
