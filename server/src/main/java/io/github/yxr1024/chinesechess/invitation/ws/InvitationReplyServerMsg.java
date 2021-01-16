package io.github.yxr1024.chinesechess.invitation.ws;

import io.github.yxr1024.chinesechess.invitation.Reply;
import io.github.yxr1024.chinesechess.ws.ServerMessage;
import lombok.Data;

@Data
public class InvitationReplyServerMsg extends ServerMessage {
    private Reply reply;

    public InvitationReplyServerMsg(Reply reply) {
        super("invitation.reply");

        this.reply = reply;
    }
}
