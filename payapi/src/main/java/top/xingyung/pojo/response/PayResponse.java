package top.xingyung.pojo.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Map;

/**
 * Created by xy on 2017/5/31.
 */
public class PayResponse {

    // 返回码
    private String resultCode;
    // 返回信息
    private String resultMsg;

    // 返回数据
    private Map<String, Object> resultContent;


    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Map<String, Object> getResultContent() {
        return resultContent;
    }

    public void setResultContent(Map<String, Object> resultContent) {
        this.resultContent = resultContent;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
