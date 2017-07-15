package top.xingyung.common.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import top.xingyung.common.constant.PayapiResultCodeConstant;
import top.xingyung.common.constant.PayapiResultMessageConstant;
import top.xingyung.pojo.request.PayRequest;
import top.xingyung.pojo.response.PayResponse;

/**
 * Created by xy on 2017/5/29.
 */
@Component
public class BusinessClientFallback implements BusinessClient {

    @Override
    public PayResponse business(@RequestBody PayRequest payRequest, @PathVariable String version, @PathVariable String channel, @PathVariable String way, @PathVariable String method) {
        PayResponse payResponse = new PayResponse();
        payResponse.setResultCode(PayapiResultCodeConstant.RESULT_CODE_FAIL);
        payResponse.setResultMsg(PayapiResultMessageConstant.RESULT_MESSAGE_DISABLE_SERVER);

        return payResponse;
    }
}
