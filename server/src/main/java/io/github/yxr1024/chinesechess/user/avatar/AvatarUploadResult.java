package io.github.yxr1024.chinesechess.user.avatar;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class AvatarUploadResult {
    private boolean success;
    private String url;

    public AvatarUploadResult(String url) {
        this.success = StringUtils.isNotBlank(url);
        this.url = url;
    }

    public static AvatarUploadResult fail() {
        return new AvatarUploadResult(null);
    }
}
