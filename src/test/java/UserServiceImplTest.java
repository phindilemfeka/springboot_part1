import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest[classes = UserServiceImpl.class];
class UserServiceImplTest {

//    @Autowired
//    public UserServiceImpl userService;

    UserServiceImpl userService = new UserServiceImpl();
    @Test
    void addUser() {
        String name = userService.addUser("shirley", "ndou");
        assertEquals("shirley", name);
    }
  /*  @Test
    void removeUser() {
    }

    @Test
    void getUser() {
        long id = userService.getUser(1);
        assertEquals(0x1, id);
    }*/
}