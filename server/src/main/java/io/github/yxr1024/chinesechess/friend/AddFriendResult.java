package io.github.yxr1024.chinesechess.friend;

import lombok.Data;

@Data
public class AddFriendResult {
    private boolean ok;
    private Boolean isMutual;

    public static AddFriendResult ok(boolean isMutual) {
        AddFriendResult result = new AddFriendResult();
        result.ok = true;
        result.isMutual = isMutual;

        return result;
    }

    public static AddFriendResult fail() {
        return new AddFriendResult();
    }
}
