package io.github.yxr1024.chinesechess.spectator;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SpectateParam {
    @NotNull
    private Long roomId;
}
