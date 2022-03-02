package com.railway.biticketfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class})
public class BiTicketFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiTicketFrontApplication.class, args);
    }
}
