package mx.uv.hefv.SpringBoot_API.repository.user;

import java.util.UUID;
import mx.uv.hefv.SpringBoot_API.jpa.UniqueIdGenerator;
import mx.uv.hefv.SpringBoot_API.jpa.UserId;



public class UserRepositoryImpl implements UserRepositoryCustom {
    private final UniqueIdGenerator<UUID> generator;

    public UserRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    public UserId nextId() {
        return new UserId(generator.getNextUniqueId());
    }
}
