package top.xingyung.common.util.client;

import org.springframework.stereotype.Component;

/**
 * Created by xy on 2017/5/29.
 */
@Component
public class PayApiClientFallback implements PayApiClient{

    @Override
    public String hello() {
        return "服务暂时不可用!";
    }
}
