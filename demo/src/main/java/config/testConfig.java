package config;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.UserRepository;

@Configuration
public class TestConfig {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public CommandLineRunner run() {
        return args -> {
            User usuario_01 = new User(null, "Maria", "maria@mail.com", "61999999999", "pass5454");
            User usuario_02 = new User(null, "Eduarda", "eduarda@mail.com", "61999999999", "pass1212");
            userRepository.saveAll(Arrays.asList(usuario_01, usuario_02));
        };
    }
}
