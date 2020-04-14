import com.springapp.Main;
import com.springapp.User;
import com.springapp.UserService;
import com.springapp.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = Main.class)
class UserServiceImplTest {

    @Autowired
   public UserService userService;

   // UserServiceImpl userService = new UserServiceImpl();

    @Test
    void addUser() {
        String name = userService.addUser(1, "shirley", "ndou");
        assertEquals("shirley", name);
    }
  @Test
    void removeUser() {
    }

    @Test
    void getUser() {
        User user = new User();
        user.setName("shirley");
        user.setSurname("ndou");
        user.setId(1);
        assertEquals(user,  userService.getUser(1));

    }

}
