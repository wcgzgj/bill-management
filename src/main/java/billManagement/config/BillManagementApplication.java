package billManagement.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("billManagement")
public class BillManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillManagementApplication.class, args);
    }

}
