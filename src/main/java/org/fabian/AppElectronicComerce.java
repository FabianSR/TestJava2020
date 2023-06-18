package org.fabian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("org.fabian.persistence")
public class AppElectronicComerce
{
    public static void main(final String[] args) {
        SpringApplication.run(AppElectronicComerce.class, args);
    }

}
