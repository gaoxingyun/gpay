package top.xingyung.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by xy on 2017/5/27.
 */

@RestController
@RequestMapping("/api")
public class gatewayController {

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello world";
    }
}