package microservice.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigServiceApplication.class, args);
    }

}