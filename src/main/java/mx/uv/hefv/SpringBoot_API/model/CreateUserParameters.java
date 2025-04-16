package mx.uv.hefv.SpringBoot_API.model;


public record CreateUserParameters(AuthServerId authServerId, String email, String mobileToken) {
}