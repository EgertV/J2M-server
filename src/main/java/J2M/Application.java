package J2M;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    @ResponseBody
    public String foo() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
