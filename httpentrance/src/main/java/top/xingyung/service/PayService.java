package top.xingyung.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xingyung.common.util.client.PayApiClient;
import top.xingyung.pojo.request.PayRequest;
import top.xingyung.pojo.response.PayResponse;

/**
 * Created by xy on 2017/6/1.
 */
@Service
public class PayService {

    private final static Logger log = LoggerFactory.getLogger(PayService.class);

    @Autowired
    private PayApiClient payApiClient;

    public PayResponse pay(PayRequest payRequest){
        log.info("发送请求数据：{}",payRequest);
        PayResponse payResponse = payApiClient.pay(payRequest);
        log.info("收到响应数据：{}",payRequest);
        return payResponse;
    }
}
