package com.blockchain.authservice.modal;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Document(collection = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    private String id;

    @Field(name = "username")
    private String username;

    @Field(name = "password")
    private String password;

    @Field(name = "email")
    private String email;

    @Field(name = "wallet_address")
    private String walletAddress;

    public User(String username, String password, String email, String walletAddress) {
        this.username = username;
        // this.password = encodePassword(password);
        this.email = email;
        this.walletAddress = walletAddress;
        this.password = password;
    }

    public void setPassword(String password) {
        // this.password = encodePassword(password);
        this.password = password;
    }

    /*
TODO:
    private String encodePassword(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
*/

}
