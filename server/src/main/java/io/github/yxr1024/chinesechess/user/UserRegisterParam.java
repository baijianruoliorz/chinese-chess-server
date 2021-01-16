package io.github.yxr1024.chinesechess.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class UserRegisterParam {
    private int source = 0;

    @NotEmpty
    private String nickname;

    @NotBlank
    private String password;

    private String email;

    private String avatarUrl;

    private String openId;
}
