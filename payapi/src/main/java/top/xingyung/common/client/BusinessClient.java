package top.xingyung.common.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.xingyung.pojo.request.PayRequest;
import top.xingyung.pojo.response.PayResponse;

/**
 * Created by xy on 2017/5/27.
 */

@FeignClient(name = "business",fallback = BusinessClientFallback.class)
@Component
public interface BusinessClient {

    @RequestMapping(method = RequestMethod.POST, value = "/api/pay/{version}/{channel}/{way}/{method}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PayResponse business(@RequestBody PayRequest payRequest, @PathVariable("version") String version, @PathVariable("channel") String channel, @PathVariable("way") String way, @PathVariable("method") String method);
}
