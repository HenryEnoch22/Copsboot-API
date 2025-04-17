package mx.uv.hefv.SpringBoot_API.model.user;

import java.util.UUID;

import jakarta.persistence.Converter;
import jakarta.persistence.AttributeConverter;

@Converter(autoApply = true)
public class AuthServerIdAttributeConverter implements AttributeConverter<AuthServerId,UUID> {
    @Override
    public UUID convertToDatabaseColumn(AuthServerId attribute) {
        return attribute.value();
    }
    @Override
    public AuthServerId convertToEntityAttribute(UUID dbData) {
        return new AuthServerId(dbData);
    }
}