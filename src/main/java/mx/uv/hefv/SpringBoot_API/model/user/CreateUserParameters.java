package mx.uv.hefv.SpringBoot_API.model.user;


public record CreateUserParameters(AuthServerId authServerId, String email, String mobileToken) {
}