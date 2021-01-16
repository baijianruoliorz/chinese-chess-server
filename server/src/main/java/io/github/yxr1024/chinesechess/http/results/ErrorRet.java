package io.github.yxr1024.chinesechess.http.results;

import lombok.Data;

@Data
public class ErrorRet {
    private String msg;

    public ErrorRet(String msg) {
        this.msg = msg;
    }
}
