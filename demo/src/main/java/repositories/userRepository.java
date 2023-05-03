package repositories;

import entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User usuario_01 = new User(null, "Maria", "maria@gmail.com", "61999999999", "pass5454");
    User usuario_02 = new User(null, "Eduarda", "eduarda@gmail.com", "61999999999", "pass1212");
    userRepository.saveAll(Arrays.asList(usuario_01, usuario_02));

}
