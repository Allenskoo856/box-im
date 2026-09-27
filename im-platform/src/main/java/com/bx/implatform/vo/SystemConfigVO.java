package com.bx.implatform.vo;

import com.bx.implatform.config.WebrtcConfig;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author: blue
 * @date: 2024-06-10
 * @version: 1.0
 */
@Schema(description = "系统配置VO")
public class SystemConfigVO {
    @Schema(description = "webrtc配置")
    private WebrtcConfig webrtc;

    public WebrtcConfig getWebrtc() {
        return this.webrtc;
    }

    public void setWebrtc(final WebrtcConfig webrtc) {
        this.webrtc = webrtc;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof SystemConfigVO)) return false;
        final SystemConfigVO other = (SystemConfigVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$webrtc = this.getWebrtc();
        final java.lang.Object other$webrtc = other.getWebrtc();
        if (this$webrtc == null ? other$webrtc != null : !this$webrtc.equals(other$webrtc)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof SystemConfigVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $webrtc = this.getWebrtc();
        result = result * PRIME + ($webrtc == null ? 43 : $webrtc.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "SystemConfigVO(webrtc=" + this.getWebrtc() + ")";
    }

    public SystemConfigVO(final WebrtcConfig webrtc) {
        this.webrtc = webrtc;
    }
}
