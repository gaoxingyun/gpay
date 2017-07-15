package top.xingyung.controller;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import top.xingyung.common.constant.PayapiResultCodeConstant;
import top.xingyung.common.constant.PayapiResultMessageConstant;
import top.xingyung.pojo.request.PayRequest;
import top.xingyung.pojo.response.PayResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xy on 2017/6/9.
 */

@RestController
@RequestMapping("/api/pay")
public class BusinessController {

    private final static Logger log = LoggerFactory.getLogger(BusinessController.class);

    @ApiOperation("统一支付服务内部接口")
    @ApiImplicitParams(@ApiImplicitParam(name = "payRequest", value = "请求数据", dataTypeClass = PayRequest.class))
    @ApiResponses(@ApiResponse(code = 200, message = "请求成功", response = PayResponse.class))
    @RequestMapping(value = "/{version}/{channel}/{way}/{method}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PayResponse business(@RequestBody PayRequest payRequest, @PathVariable String version, @PathVariable String channel, @PathVariable String way, @PathVariable String method)
    {

        log.info("request:{},{},{},{}", payRequest, version, way, channel, method);

        Map<String, Object> map = new HashMap<>();
        map.put("verSion", version);
        map.put("way", way);
        map.put("channel", channel);
        map.put("method",method);

        PayResponse payResponse = new PayResponse();
        payResponse.setResultCode(PayapiResultCodeConstant.RESULT_CODE_SUCCESS);
        payResponse.setResultMsg(PayapiResultMessageConstant.RESULT_MESSAGE_SUCCESS);
        payResponse.setResultContent(map);

        log.info("response:{}",payResponse);
        return payResponse;
    }

}
