package com.bx.implatform.vo;

import com.bx.implatform.session.WebrtcUserInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * @author: Blue
 * @date: 2024-06-09
 * @version: 1.0
 */
@Schema(description = "群通话信息VO")
public class WebrtcGroupInfoVO {
    @Schema(description = "是否在通话中")
    private Boolean isChating;
    @Schema(description = "通话发起人")
    WebrtcUserInfo host;
    @Schema(description = "通话用户列表")
    private List<WebrtcUserInfo> userInfos;

    public WebrtcGroupInfoVO() {
    }

    public Boolean getIsChating() {
        return this.isChating;
    }

    public WebrtcUserInfo getHost() {
        return this.host;
    }

    public List<WebrtcUserInfo> getUserInfos() {
        return this.userInfos;
    }

    public void setIsChating(final Boolean isChating) {
        this.isChating = isChating;
    }

    public void setHost(final WebrtcUserInfo host) {
        this.host = host;
    }

    public void setUserInfos(final List<WebrtcUserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcGroupInfoVO)) return false;
        final WebrtcGroupInfoVO other = (WebrtcGroupInfoVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$isChating = this.getIsChating();
        final java.lang.Object other$isChating = other.getIsChating();
        if (this$isChating == null ? other$isChating != null : !this$isChating.equals(other$isChating)) return false;
        final java.lang.Object this$host = this.getHost();
        final java.lang.Object other$host = other.getHost();
        if (this$host == null ? other$host != null : !this$host.equals(other$host)) return false;
        final java.lang.Object this$userInfos = this.getUserInfos();
        final java.lang.Object other$userInfos = other.getUserInfos();
        if (this$userInfos == null ? other$userInfos != null : !this$userInfos.equals(other$userInfos)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcGroupInfoVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $isChating = this.getIsChating();
        result = result * PRIME + ($isChating == null ? 43 : $isChating.hashCode());
        final java.lang.Object $host = this.getHost();
        result = result * PRIME + ($host == null ? 43 : $host.hashCode());
        final java.lang.Object $userInfos = this.getUserInfos();
        result = result * PRIME + ($userInfos == null ? 43 : $userInfos.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcGroupInfoVO(isChating=" + this.getIsChating() + ", host=" + this.getHost() + ", userInfos=" + this.getUserInfos() + ")";
    }
}
