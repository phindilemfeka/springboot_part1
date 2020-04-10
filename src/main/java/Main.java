import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Main {
    public static void main(String[] args)
    {
        //SpringApplication.run(Application.class, args);
        FakeRepo fr = new FakeRepo();
        fr.insertUser(1, "shirle", "khoza");
        fr.findUserById(1);
    }
}
