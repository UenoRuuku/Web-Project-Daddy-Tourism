package fudan.se.perfect.demo.Repository;

import fudan.se.perfect.demo.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    List<User> findUsersByUsernameContaining(String field);
}