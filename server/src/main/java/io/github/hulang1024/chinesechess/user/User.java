package io.github.hulang1024.chinesechess.user;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("users")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String nickname;

    private Integer gender;

    private String avatarUrl;

    @JSONField(serialize = false)
    private String password;

    private String email;

    @JSONField(name = "isAdmin")
    private boolean isAdmin;

    private int source;

    @JSONField(serialize = false)
    private String openId;

    private LocalDateTime registerTime;

    private LocalDateTime lastLoginTime;

    private LocalDateTime lastActiveTime;

    private String userIp;

    /**
     * 1=banned
     */
    private Integer userType;

    public static User SYSTEM_USER;
    static {
        User systemUser = new User(0);
        systemUser.setNickname("系统");
        SYSTEM_USER = systemUser;
    }

    public User() {}

    public User(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }

        return ((User)other).id.equals(this.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}