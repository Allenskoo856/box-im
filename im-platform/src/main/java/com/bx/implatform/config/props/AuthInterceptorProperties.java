package com.bx.implatform.config.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "auth-interceptor")
public class AuthInterceptorProperties {
    /**
     * 登录拦截器放行的 URL 路径
     */
    private List<String> excludePaths = new ArrayList<>();

    public AuthInterceptorProperties() {
    }

    /**
     * 登录拦截器放行的 URL 路径
     */
    public List<String> getExcludePaths() {
        return this.excludePaths;
    }

    /**
     * 登录拦截器放行的 URL 路径
     */
    public void setExcludePaths(final List<String> excludePaths) {
        this.excludePaths = excludePaths;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof AuthInterceptorProperties)) return false;
        final AuthInterceptorProperties other = (AuthInterceptorProperties) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$excludePaths = this.getExcludePaths();
        final java.lang.Object other$excludePaths = other.getExcludePaths();
        if (this$excludePaths == null ? other$excludePaths != null : !this$excludePaths.equals(other$excludePaths)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof AuthInterceptorProperties;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $excludePaths = this.getExcludePaths();
        result = result * PRIME + ($excludePaths == null ? 43 : $excludePaths.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "AuthInterceptorProperties(excludePaths=" + this.getExcludePaths() + ")";
    }
}
