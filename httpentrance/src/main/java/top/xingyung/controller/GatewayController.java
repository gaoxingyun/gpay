package top.xingyung.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xingyung.common.util.client.PayApiClient;

/**
 * Created by xy on 2017/5/27.
 */
@RestController
@RequestMapping("/api/pay/gateway")
public class GatewayController {

    private final static Logger log = LoggerFactory.getLogger(GatewayController.class);

    @Autowired
    private PayApiClient payApiClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello()
    {
        log.info("hello被调用");
        return payApiClient.hello();

    }
}
