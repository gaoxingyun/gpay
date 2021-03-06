package top.xingyung.controller;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.xingyung.common.util.client.PayApiClient;
import top.xingyung.pojo.request.PayRequest;
import top.xingyung.pojo.response.PayResponse;
import top.xingyung.service.PayService;

/**
 * Created by xy on 2017/5/27.
 */
@Api("HTTP方式支付接口类")
@RestController
@RequestMapping("/")
public class GatewayController {

    private final static Logger log = LoggerFactory.getLogger(GatewayController.class);

    @Autowired
    private PayApiClient payApiClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private PayService payService;

    @ApiOperation("测试HELLO")
    @ApiImplicitParams(@ApiImplicitParam())
    @ApiResponses(@ApiResponse(code = 200, message = "请求成功"))
    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello()
    {
        log.info("hello被调用");
        return payApiClient.hello("xy");

    }


    @ApiOperation("HTTP方式支付接口")
    @ApiImplicitParams(@ApiImplicitParam(name = "payRequest", value = "请求数据",  dataTypeClass = PayRequest.class))
    @ApiResponses(@ApiResponse(code = 200, message = "请求成功",response = PayResponse.class))
    @RequestMapping(method = RequestMethod.POST, value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PayResponse pay(@RequestBody PayRequest payRequest){
        log.info("请求对象：{}",payRequest);

        PayResponse payResponse = payService.pay(payRequest);

        log.info("响应对象：{}", payResponse);
        return payResponse;
    }
}
