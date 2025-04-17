package mx.uv.hefv.SpringBoot_API.model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mx.uv.hefv.SpringBoot_API.jpa.AbstractEntity;
import mx.uv.hefv.SpringBoot_API.jpa.UserId;



@Entity
@Table(name = "copsboot_user")
public class User extends AbstractEntity<UserId> {
    private String email;
    private AuthServerId authServerId;
    private String mobileToken;

    protected User() {}

    public User(UserId id, String email, AuthServerId authServerId, String mobileToken) {
        super(id);
        this.email = email;
        this.authServerId = authServerId;
        this.mobileToken = mobileToken;
    }

    public String getEmail() {
        return email;
    }

    public AuthServerId getAuthServerId() {
        return authServerId;
    }

    public String getMobileToken() {
        return mobileToken;
    }

    
}
