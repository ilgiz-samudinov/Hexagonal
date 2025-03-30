package ie.example.hehagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HehagonalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HehagonalApplication.class, args);
    }

}
