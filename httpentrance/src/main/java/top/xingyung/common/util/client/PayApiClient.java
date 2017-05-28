package top.xingyung.common.util.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xy on 2017/5/27.
 */

@FeignClient(name = "payapi")
@Component
public interface PayApiClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/hello")
    public String hello();
}
