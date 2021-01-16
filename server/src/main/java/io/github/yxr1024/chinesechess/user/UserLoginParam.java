package io.github.yxr1024.chinesechess.user;

import lombok.Data;

@Data
public class UserLoginParam {
    private String username;

    private String password;

    private String token;

    private String deviceOS;
}
