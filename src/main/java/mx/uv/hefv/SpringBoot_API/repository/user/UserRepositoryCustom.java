package mx.uv.hefv.SpringBoot_API.repository.user;

import mx.uv.hefv.SpringBoot_API.jpa.UserId;

public interface UserRepositoryCustom {
    UserId nextId();
}
