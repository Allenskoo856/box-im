package com.bx.implatform.vo;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "用户登录VO")
public class LoginVO {
    @Schema(description = "每次请求都必须在header中携带accessToken")
    private String accessToken;
    @Schema(description = "accessToken过期时间(秒)")
    private Integer accessTokenExpiresIn;
    @Schema(description = "accessToken过期后，通过refreshToken换取新的token")
    private String refreshToken;
    @Schema(description = "refreshToken过期时间(秒)")
    private Integer refreshTokenExpiresIn;

    public LoginVO() {
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public Integer getAccessTokenExpiresIn() {
        return this.accessTokenExpiresIn;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public Integer getRefreshTokenExpiresIn() {
        return this.refreshTokenExpiresIn;
    }

    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }

    public void setAccessTokenExpiresIn(final Integer accessTokenExpiresIn) {
        this.accessTokenExpiresIn = accessTokenExpiresIn;
    }

    public void setRefreshToken(final String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public void setRefreshTokenExpiresIn(final Integer refreshTokenExpiresIn) {
        this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginVO)) return false;
        final LoginVO other = (LoginVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$accessTokenExpiresIn = this.getAccessTokenExpiresIn();
        final java.lang.Object other$accessTokenExpiresIn = other.getAccessTokenExpiresIn();
        if (this$accessTokenExpiresIn == null ? other$accessTokenExpiresIn != null : !this$accessTokenExpiresIn.equals(other$accessTokenExpiresIn)) return false;
        final java.lang.Object this$refreshTokenExpiresIn = this.getRefreshTokenExpiresIn();
        final java.lang.Object other$refreshTokenExpiresIn = other.getRefreshTokenExpiresIn();
        if (this$refreshTokenExpiresIn == null ? other$refreshTokenExpiresIn != null : !this$refreshTokenExpiresIn.equals(other$refreshTokenExpiresIn)) return false;
        final java.lang.Object this$accessToken = this.getAccessToken();
        final java.lang.Object other$accessToken = other.getAccessToken();
        if (this$accessToken == null ? other$accessToken != null : !this$accessToken.equals(other$accessToken)) return false;
        final java.lang.Object this$refreshToken = this.getRefreshToken();
        final java.lang.Object other$refreshToken = other.getRefreshToken();
        if (this$refreshToken == null ? other$refreshToken != null : !this$refreshToken.equals(other$refreshToken)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof LoginVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $accessTokenExpiresIn = this.getAccessTokenExpiresIn();
        result = result * PRIME + ($accessTokenExpiresIn == null ? 43 : $accessTokenExpiresIn.hashCode());
        final java.lang.Object $refreshTokenExpiresIn = this.getRefreshTokenExpiresIn();
        result = result * PRIME + ($refreshTokenExpiresIn == null ? 43 : $refreshTokenExpiresIn.hashCode());
        final java.lang.Object $accessToken = this.getAccessToken();
        result = result * PRIME + ($accessToken == null ? 43 : $accessToken.hashCode());
        final java.lang.Object $refreshToken = this.getRefreshToken();
        result = result * PRIME + ($refreshToken == null ? 43 : $refreshToken.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "LoginVO(accessToken=" + this.getAccessToken() + ", accessTokenExpiresIn=" + this.getAccessTokenExpiresIn() + ", refreshToken=" + this.getRefreshToken() + ", refreshTokenExpiresIn=" + this.getRefreshTokenExpiresIn() + ")";
    }
}
