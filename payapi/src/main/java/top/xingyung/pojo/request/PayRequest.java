package top.xingyung.pojo.request;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Map;

/**
 * Created by xy on 2017/5/31.
 */

public class PayRequest {

    // 开发者ID
    @NotEmpty
    private String appId;

    // 接口名称 eg: native:alipay:query
    @NotEmpty
    private String method;

    // 版本
    @NotEmpty
    private String version;

    // 业务数据
    @NotEmpty
    private Map<String, Object> bizContent;


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, Object> getBizContent() {
        return bizContent;
    }

    public void setBizContent(Map<String, Object> bizContent) {
        this.bizContent = bizContent;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
