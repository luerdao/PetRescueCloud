package top.luerdao.petServer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("top.luerdao.petServer.dao")
@EnableDiscoveryClient
public class PetServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetServerApplication.class, args);
    }

}
