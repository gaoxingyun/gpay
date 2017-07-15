package top.xingyung.pojo.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Map;

/**
 * Created by xy on 2017/5/31.
 */

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PayRequest {

    // 开发者ID
    @NotEmpty
    private String appId;
    // 业务数据
    @NotEmpty
    private Map<String, Object> bizContent;


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
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
