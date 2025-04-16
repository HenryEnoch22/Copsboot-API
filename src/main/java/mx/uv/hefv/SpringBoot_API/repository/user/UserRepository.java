package mx.uv.hefv.SpringBoot_API.repository.user;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import mx.uv.hefv.SpringBoot_API.jpa.UserId;
import mx.uv.hefv.SpringBoot_API.model.AuthServerId;
import mx.uv.hefv.SpringBoot_API.model.User;


public interface UserRepository extends CrudRepository<User, UserId>, UserRepositoryCustom{
    Optional<User> findByAuthServerId(AuthServerId authServerId);
}
