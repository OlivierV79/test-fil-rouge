package simplon2024.test_fil_rouge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TestFilRougeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestFilRougeApplication.class, args);
    }

}
