package top.xingyung.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.javafx.tools.packager.PackagerException;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.xingyung.common.constant.PayapiConstant;
import top.xingyung.common.constant.PayapiResultCodeConstant;
import top.xingyung.common.constant.PayapiResultMessageConstant;
import top.xingyung.common.exception.PayapiException;
import top.xingyung.pojo.request.PayRequest;
import top.xingyung.pojo.response.PayResponse;

/**
 * Created by xy on 2017/5/30.
 * 支付接口总入口
 */

@Api("统一支付服务内部接口")
@RestController
@RequestMapping("/api")
public class PayapiController {

    private final static Logger log = LoggerFactory.getLogger(PayapiController.class);

    @ApiOperation("统一支付服务内部接口")
    @ApiImplicitParams(@ApiImplicitParam(name = "payRequest", value = "请求数据", dataTypeClass = PayRequest.class))
    @ApiResponses(@ApiResponse(code = 200, message = "请求成功", response = PayResponse.class))
    @RequestMapping(value = "/pay", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PayResponse pay(@RequestBody PayRequest payRequest) throws PayapiException {

        log.info("请求数据：{}", payRequest);
        String method = payRequest.getMethod();
        String version = payRequest.getVersion();

        String[] methods = method.split("\\.",2);
        String channel = methods[0];
        String way = methods[1];

        switch (channel){
            case PayapiConstant.CHANNEL_NATIVE:
                break;
            case PayapiConstant.CHANNEL_PINGAN:
                break;
            default:
                throw new PayapiException(PayapiResultMessageConstant.RESULT_MESSAGE_UNSUPPORT_CHANNEL);
        }


        log.info("{},{}", channel,way);

        PayResponse payResponse = new PayResponse();
        payResponse.setResultCode(PayapiResultCodeConstant.RESULT_CODE_SUCCESS);
        payResponse.setResultMsg(PayapiResultMessageConstant.RESULT_MESSAGE_SUCCESS);


        log.info("响应数据：{}", payResponse);
        return payResponse;
    }



}
