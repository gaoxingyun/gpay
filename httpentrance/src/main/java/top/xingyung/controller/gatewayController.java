package top.xingyung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.xingyung.common.util.client.PayApiClient;

import java.net.URI;

/**
 * Created by xy on 2017/5/27.
 */
@RestController
@RequestMapping("/api/pay/gateway")
public class gatewayController {

    @Autowired
    private PayApiClient payApiClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello()
    {
        return payApiClient.hello();

    }
}
