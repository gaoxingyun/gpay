package top.xingyung.common.util.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xy on 2017/5/27.
 */

@FeignClient(name = "payapi",fallback = PayApiClientFallback.class)
@Component
public interface PayApiClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/hello")
    public String hello();

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public String pay(String request);
}
