package com.bx.implatform.config.props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtProperties {
    @Value("${jwt.accessToken.expireIn}")
    private Integer accessTokenExpireIn;
    @Value("${jwt.accessToken.secret}")
    private String accessTokenSecret;
    @Value("${jwt.refreshToken.expireIn}")
    private Integer refreshTokenExpireIn;
    @Value("${jwt.refreshToken.secret}")
    private String refreshTokenSecret;

    public JwtProperties() {
    }

    public Integer getAccessTokenExpireIn() {
        return this.accessTokenExpireIn;
    }

    public String getAccessTokenSecret() {
        return this.accessTokenSecret;
    }

    public Integer getRefreshTokenExpireIn() {
        return this.refreshTokenExpireIn;
    }

    public String getRefreshTokenSecret() {
        return this.refreshTokenSecret;
    }

    public void setAccessTokenExpireIn(final Integer accessTokenExpireIn) {
        this.accessTokenExpireIn = accessTokenExpireIn;
    }

    public void setAccessTokenSecret(final String accessTokenSecret) {
        this.accessTokenSecret = accessTokenSecret;
    }

    public void setRefreshTokenExpireIn(final Integer refreshTokenExpireIn) {
        this.refreshTokenExpireIn = refreshTokenExpireIn;
    }

    public void setRefreshTokenSecret(final String refreshTokenSecret) {
        this.refreshTokenSecret = refreshTokenSecret;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof JwtProperties)) return false;
        final JwtProperties other = (JwtProperties) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$accessTokenExpireIn = this.getAccessTokenExpireIn();
        final java.lang.Object other$accessTokenExpireIn = other.getAccessTokenExpireIn();
        if (this$accessTokenExpireIn == null ? other$accessTokenExpireIn != null : !this$accessTokenExpireIn.equals(other$accessTokenExpireIn)) return false;
        final java.lang.Object this$refreshTokenExpireIn = this.getRefreshTokenExpireIn();
        final java.lang.Object other$refreshTokenExpireIn = other.getRefreshTokenExpireIn();
        if (this$refreshTokenExpireIn == null ? other$refreshTokenExpireIn != null : !this$refreshTokenExpireIn.equals(other$refreshTokenExpireIn)) return false;
        final java.lang.Object this$accessTokenSecret = this.getAccessTokenSecret();
        final java.lang.Object other$accessTokenSecret = other.getAccessTokenSecret();
        if (this$accessTokenSecret == null ? other$accessTokenSecret != null : !this$accessTokenSecret.equals(other$accessTokenSecret)) return false;
        final java.lang.Object this$refreshTokenSecret = this.getRefreshTokenSecret();
        final java.lang.Object other$refreshTokenSecret = other.getRefreshTokenSecret();
        if (this$refreshTokenSecret == null ? other$refreshTokenSecret != null : !this$refreshTokenSecret.equals(other$refreshTokenSecret)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof JwtProperties;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $accessTokenExpireIn = this.getAccessTokenExpireIn();
        result = result * PRIME + ($accessTokenExpireIn == null ? 43 : $accessTokenExpireIn.hashCode());
        final java.lang.Object $refreshTokenExpireIn = this.getRefreshTokenExpireIn();
        result = result * PRIME + ($refreshTokenExpireIn == null ? 43 : $refreshTokenExpireIn.hashCode());
        final java.lang.Object $accessTokenSecret = this.getAccessTokenSecret();
        result = result * PRIME + ($accessTokenSecret == null ? 43 : $accessTokenSecret.hashCode());
        final java.lang.Object $refreshTokenSecret = this.getRefreshTokenSecret();
        result = result * PRIME + ($refreshTokenSecret == null ? 43 : $refreshTokenSecret.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "JwtProperties(accessTokenExpireIn=" + this.getAccessTokenExpireIn() + ", accessTokenSecret=" + this.getAccessTokenSecret() + ", refreshTokenExpireIn=" + this.getRefreshTokenExpireIn() + ", refreshTokenSecret=" + this.getRefreshTokenSecret() + ")";
    }
}
