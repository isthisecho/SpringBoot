package com.example.SpringBoot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(Controllers repository) {
          // Just adding some parameters for to show our website a little bit filled.
          // If u don't want you can just use  "//" for hiding the columns.
        return args -> {
            log.info("Preloading " + repository.save(new User ("Ekrem","Görgüç","ekremberkgorguc@gmail.com")));
            log.info("Preloading " + repository.save(new User("Ali","Veli","aliveli@hotmail.com")));

        };
    }
}