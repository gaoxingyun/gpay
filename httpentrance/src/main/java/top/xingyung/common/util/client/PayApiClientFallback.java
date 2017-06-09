package top.xingyung.common.util.client;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;
import top.xingyung.common.constant.PayapiResultCodeConstant;
import top.xingyung.common.constant.PayapiResultMessageConstant;
import top.xingyung.pojo.request.PayRequest;
import top.xingyung.pojo.response.PayResponse;

/**
 * Created by xy on 2017/5/29.
 */
@Component
public class PayApiClientFallback implements PayApiClient{

    @Override
    public String hello(String request) {
        return "服务暂时不可用!";
    }

    @Override
    public PayResponse pay(PayRequest payRequest) {
        PayResponse payResponse = new PayResponse();
        payResponse.setResultCode(PayapiResultCodeConstant.RESULT_CODE_FAIL);
        payResponse.setResultMsg(PayapiResultMessageConstant.RESULT_MESSAGE_DISABLE_SERVER);

        return payResponse;
    }
}
