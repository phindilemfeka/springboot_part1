import com.sun.tools.javac.util.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//@Repository
public class FakeRepo implements FakeRepoInterface {
    //@Autowired
    public User[] user = new User[4]; //object array of type User

    int count =0;

    @Override
    public void insertUser(long Id, String name, String surname) {
        User userTest = new User(Id, name, surname); //creating an object with its values to add users
        user[count] = userTest;
        ++count;

        System.out.println("name: " + user[0].getName());
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
        System.out.println("found: " + user1.getName());
     return user1;
    }

    @Override
    public void deleteUser(long Id) {
       /* for(int i = 0; i < user.length; i++){
            if(user[i].getId() == Id){
                user = removeElement(user, i);
                break;
            }
        }

        System.out.println("Array elements after deletion-- " );
        for(int i = 0; i < user.length; i++){
            System.out.print(" " + user[i]);
        }*/
    }

   /* public static User[] removeElement( User[] numArray, int index ){
        // Converting to list
        List tempList = new ArrayList(Arrays.asList(numArray));
        tempList.remove(index);
        // converting back to array

        return tempList.toArray(new User[0]);
    }*/

}
