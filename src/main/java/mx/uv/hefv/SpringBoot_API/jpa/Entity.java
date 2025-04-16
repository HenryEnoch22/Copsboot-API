package mx.uv.hefv.SpringBoot_API.jpa;

public interface Entity<T extends EntityId> {
    T getId();
}
