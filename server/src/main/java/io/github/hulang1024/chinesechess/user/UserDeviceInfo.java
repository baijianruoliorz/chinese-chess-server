package io.github.hulang1024.chinesechess.user;

import lombok.Data;

@Data
public class UserDeviceInfo {
    private String deviceOS;

    public static final UserDeviceInfo NULL = new UserDeviceInfo();
}
