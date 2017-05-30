package top.xingyung.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by xy on 2017/5/27.
 */

@RestController
@RequestMapping("/api")
public class GatewayController {

    private final static Logger log = LoggerFactory.getLogger(GatewayController.class);
    @RequestMapping("/hello")
    public String hello()
    {
        log.info("hello 被调用");

        return "hello world";
    }
}