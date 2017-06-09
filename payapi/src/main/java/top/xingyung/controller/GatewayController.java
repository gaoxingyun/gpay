package top.xingyung.controller;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by xy on 2017/5/27.
 */

@Api("接口测试类")
@RestController
@RequestMapping("/api")
public class GatewayController {

    private final static Logger log = LoggerFactory.getLogger(GatewayController.class);

    @ApiOperation("测试HELLO")
    @ApiImplicitParams(@ApiImplicitParam())
    @ApiResponses(@ApiResponse(code = 200, message = "请求成功"))
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestBody String request)
    {
        log.info("hello 被调用");

        return "hello" + request;
    }
}