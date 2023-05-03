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
            User usuario_01 = new User(null, "Adão", "adao@gmail.com", "61999999999", "a1b2c3");
            User usuario_02 = new User(null, "Eva", "eva@gmail.com", "61999999999", "1a2b3c");
            userRepository.saveAll(Arrays.asList(usuario_01, usuario_02));
        };
    }
}
