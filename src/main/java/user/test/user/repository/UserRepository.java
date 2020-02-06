package user.test.user.repository;

import org.springframework.data.repository.CrudRepository;
import user.test.user.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
