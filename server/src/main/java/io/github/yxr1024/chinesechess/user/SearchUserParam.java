package io.github.yxr1024.chinesechess.user;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SearchUserParam {
    @NotNull
    private Boolean onlyFriends;

    private Integer status;
}
