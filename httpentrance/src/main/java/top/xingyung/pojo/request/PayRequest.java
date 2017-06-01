package top.xingyung.pojo.request;

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

    // 数据格式
    private String format;

    // 编码格式
    private String charset;

    // 时间戳 yyyy-MM-dd HH:mm:ss
    private String timestamp;

    // 版本
    private String version;

    // 签名类型
    private String signType;

    // 签名
    @NotEmpty
    private String sign;

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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
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
