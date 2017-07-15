package top.xingyung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class PayapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayapiApplication.class, args);
	}
}
