package top.xingyung.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.xingyung.common.util.client.PayApiClient;
import top.xingyung.pojo.request.PayRequest;
import top.xingyung.pojo.response.PayResponse;

/**
 * Created by xy on 2017/5/27.
 */
@Api("HTTP方式支付接口类")
@RestController
@RequestMapping("/gateway")
public class GatewayController {

    private final static Logger log = LoggerFactory.getLogger(GatewayController.class);

    @Autowired
    private PayApiClient payApiClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @ApiOperation("测试HELLO")
    @ApiImplicitParams(@ApiImplicitParam())
    @ApiResponses(@ApiResponse(code = 200, message = "请求成功"))
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello()
    {
        log.info("hello被调用");
        return payApiClient.hello();

    }


    @ApiOperation("HTTP方式支付接口")
    @ApiImplicitParams(@ApiImplicitParam(name = "payRequest", value = "请求对象", dataTypeClass = PayResponse.class))
    @ApiResponses(@ApiResponse(code = 200, message = "请求成功"))
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public PayResponse pay(PayRequest payRequest){
        log.info("请求对象：{}",payRequest);
        String request = JSON.toJSONString(payRequest);
        String response = payApiClient.pay(request);
        PayResponse payResponse = JSON.parseObject(response,PayResponse.class);
        log.info("响应对象：{}", payResponse);
        return payResponse;
    }
}
