package top.xingyung.common.util.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.xingyung.pojo.request.PayRequest;
import top.xingyung.pojo.response.PayResponse;

/**
 * Created by xy on 2017/5/27.
 */

@FeignClient(name = "payapi",fallback = PayApiClientFallback.class)
@Component
public interface PayApiClient {
    @RequestMapping(method = RequestMethod.POST, value = "/api/hello")
    public String hello(@RequestBody String request);

    @RequestMapping(method = RequestMethod.POST, value = "/api/pay", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PayResponse pay(PayRequest payRequest);
}
