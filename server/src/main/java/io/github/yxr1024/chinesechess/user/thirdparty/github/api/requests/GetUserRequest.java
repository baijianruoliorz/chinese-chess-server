package io.github.yxr1024.chinesechess.user.thirdparty.github.api.requests;


import io.github.yxr1024.chinesechess.user.thirdparty.github.api.APIRequest;
import io.github.yxr1024.chinesechess.user.thirdparty.github.api.responses.GitHubUser;
import okhttp3.Request;

public class GetUserRequest extends APIRequest<GitHubUser> {
    public GetUserRequest() {
        super("user");
    }

    @Override
    protected Request.Builder createRequest() {
        return createJSONRequest().get();
    }
}
