package mx.uv.hefv.SpringBoot_API.dto;

import mx.uv.hefv.SpringBoot_API.model.User;

public record UserDto(String userId, String email, String authServerId, String mobileToken) {

    public static UserDto fromUser(User user) {
        return new UserDto(
            user.getId().asString(),
            user.getEmail(),
            user.getAuthServerId().asString(),
            user.getMobileToken()
        );
    }
}