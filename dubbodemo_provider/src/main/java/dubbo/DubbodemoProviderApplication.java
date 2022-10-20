package dubbo;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubbodemoProviderApplication {

    public static void main(String[] args) {


        SpringApplication.run(DubbodemoProviderApplication.class, args);
        System.out.println("dubbo service started");
    }

}
