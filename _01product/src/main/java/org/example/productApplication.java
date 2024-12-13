package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class productApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(productApplication.class, args);
    }

    @Bean
    public RestClient restClient() {
        return RestClient.builder().build();
    }
}
