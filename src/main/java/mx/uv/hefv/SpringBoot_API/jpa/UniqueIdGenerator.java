package mx.uv.hefv.SpringBoot_API.jpa;

public interface UniqueIdGenerator<T> {
    T getNextUniqueId();
}
