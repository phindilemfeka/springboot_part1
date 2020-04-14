package com.springapp;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
@Repository
public class FakeRepo implements FakeRepoInterface {
    public User[] user = new User[4]; //object array of type User
    int count =0;
    int index=0;
    @Override
    public void insertUser(long Id, String name, String surname) {
        User userTest = new User(Id, name, surname); //creating an object with its values to add users
        user[count] = userTest;
        System.out.println("name: " + user[count].getName());
        ++count;
    }

    @Override
    public User findUserById(long Id) {
        User user1 = new User();
        for (User value : user) {
            if (value.getId() == Id) {
                user1 = value;
                break;
            }
        }
        System.out.println("found: " + user1.getName());
     return user1;
    }

    @Override
    public void deleteUser(long Id) {
        ArrayList<User> arrayList = new ArrayList<>();
        for (int i =0; i<user.length-1; i++) {
            if (user[i].getId() == Id) {
                index=i;
               break;
            }
        }
        for (int j=index; j<user.length-1; j++) {
            user[j] = user[j+1];
        }
        for (int i = 0; i <user.length-1; i++) {
            if(user[i] !=null) {
                System.out.println(user[i].getName()+ ": removed");
            }
        }
        /*System.out.println(user[0].getName());
        System.out.println(user[1].getName());
        System.out.println(user[2].getName());*/
    }

}
