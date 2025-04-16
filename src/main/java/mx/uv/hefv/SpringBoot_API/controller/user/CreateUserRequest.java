package mx.uv.hefv.SpringBoot_API.controller.user;

import java.util.UUID;

import org.springframework.security.oauth2.jwt.Jwt;

import mx.uv.hefv.SpringBoot_API.model.AuthServerId;
import mx.uv.hefv.SpringBoot_API.model.CreateUserParameters;

public record CreateUserRequest(String mobileToken) {
    public CreateUserParameters toParameters(Jwt jwt) {
        AuthServerId authServerId = new AuthServerId(UUID.fromString(jwt.getSubject()));

        String email = jwt.getClaimAsString("email"); 
        return new CreateUserParameters(authServerId, email, mobileToken);
}
}
