package io.github.yxr1024.chinesechess.ban;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("ip_ban")
public class IpBan {
    @TableId(type = IdType.INPUT)
    private String ip;

    private Long userId;

    private LocalDateTime createAt;
}