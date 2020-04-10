public class FakeRepo implements FakeRepoInterface {

    public User[] user = new User[4]; //object array of type User

    int count =0;

    @Override
    public void insertUser(long Id, String name, String surname) {
        User userTest = new User(Id, name, surname); //creating an object with its values to add users
        user[count] = userTest;
        count++;

        System.out.println(user[0].getName());
    }

    @Override
    public User findUserById(long Id) {
        User user1 = new User();
        for (int i = 0; i <user.length ; i++) {
            if(user[i].getId() == Id){
                user1 = user[i];
                break;
            }
        }
        System.out.println(user1.getName());
     return user1;
    }

    @Override
    public void deleteUser(long Id) {

    }
}
