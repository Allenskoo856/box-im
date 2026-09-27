package com.bx.implatform.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * @author: Blue
 * @date: 2024-06-09
 * @version: 1.0
 */
@Schema(description = "用户加入群通话失败VO")
public class WebrtcGroupFailedVO {
    @Schema(description = "失败用户列表")
    private List<Long> userIds;
    @Schema(description = "失败原因")
    private String reason;

    public WebrtcGroupFailedVO() {
    }

    public List<Long> getUserIds() {
        return this.userIds;
    }

    public String getReason() {
        return this.reason;
    }

    public void setUserIds(final List<Long> userIds) {
        this.userIds = userIds;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcGroupFailedVO)) return false;
        final WebrtcGroupFailedVO other = (WebrtcGroupFailedVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$userIds = this.getUserIds();
        final java.lang.Object other$userIds = other.getUserIds();
        if (this$userIds == null ? other$userIds != null : !this$userIds.equals(other$userIds)) return false;
        final java.lang.Object this$reason = this.getReason();
        final java.lang.Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcGroupFailedVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $userIds = this.getUserIds();
        result = result * PRIME + ($userIds == null ? 43 : $userIds.hashCode());
        final java.lang.Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcGroupFailedVO(userIds=" + this.getUserIds() + ", reason=" + this.getReason() + ")";
    }
}
