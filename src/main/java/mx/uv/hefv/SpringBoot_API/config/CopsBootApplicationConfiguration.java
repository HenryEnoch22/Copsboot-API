package mx.uv.hefv.SpringBoot_API.config;

import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.uv.hefv.SpringBoot_API.jpa.UniqueIdGenerator;
import mx.uv.hefv.SpringBoot_API.jpa.InMemoryUniqueIdGenerator;

@Configuration
public class CopsBootApplicationConfiguration {
    @Bean
    public UniqueIdGenerator<UUID> uniqueIdGenerator() {
        return new InMemoryUniqueIdGenerator();
    }
}
