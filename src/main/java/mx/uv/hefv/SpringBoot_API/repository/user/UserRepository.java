package mx.uv.hefv.SpringBoot_API.repository.user;


import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import mx.uv.hefv.SpringBoot_API.model.User;


public interface UserRepository extends CrudRepository<User, UUID>, UserRepositoryCustom{
}
