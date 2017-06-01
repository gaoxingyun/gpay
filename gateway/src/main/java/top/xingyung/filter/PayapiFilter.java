package top.xingyung.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * Created by xy on 2017/5/31.
 */
public class PayapiFilter extends ZuulFilter{

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
