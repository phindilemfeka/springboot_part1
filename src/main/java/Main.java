import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Main {
    public static void main(String[] args)
    {
        //SpringApplication.run(Application.class, args);
        FakeRepo fr = new FakeRepo();
        fr.insertUser(1, "shirley", "khoza");
        fr.insertUser(2, "sbh", "yuer");
        fr.findUserById(1);
        //fr.deleteUser(1);
        fr.findUserById(2);
    }
}
