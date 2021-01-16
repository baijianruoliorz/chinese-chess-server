package io.github.yxr1024.chinesechess.chat;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostMessageParam {
    private boolean isAction;
    @NotBlank
    private String content;
}
