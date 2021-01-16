package io.github.yxr1024.chinesechess.friend;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("friends")
public class FriendRelation {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long userId;

    private Long friendUserId;

    private Boolean isMutual;
}
