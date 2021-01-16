package io.github.yxr1024.chinesechess.user.thirdparty.github.api.responses;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GitHubUser {
    private Long id;
    private String login;
    private String email;
    @JSONField(name="avatar_url")
    private String avatarUrl;
}
