package mx.uv.hefv.SpringBoot_API.jpa;

import java.io.Serializable;

public interface EntityId<T> extends Serializable {
    T getId();
    String asString();
}
