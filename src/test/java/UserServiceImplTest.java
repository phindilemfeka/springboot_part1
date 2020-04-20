import com.springapp.Main;
import com.springapp.User;
import com.springapp.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = Main.class)
class UserServiceImplTest {

    @Autowired
   public UserService userService;

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
        assertEquals(user.getId(),  userService.getUser(1));

    }

}
