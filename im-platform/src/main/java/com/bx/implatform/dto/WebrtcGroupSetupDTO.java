package com.bx.implatform.dto;

import com.bx.implatform.session.WebrtcUserInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;

/**
 * @author: Blue
 * @date: 2024-06-01
 * @version: 1.0
 */
@Schema(description = "发起群视频通话DTO")
public class WebrtcGroupSetupDTO {
    @NotNull(message = "群聊id不可为空")
    @Schema(description = "群聊id")
    private Long groupId;
    @NotEmpty(message = "参与用户信息不可为空")
    @Schema(description = "参与用户信息")
    private List<WebrtcUserInfo> userInfos;

    public WebrtcGroupSetupDTO() {
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public List<WebrtcUserInfo> getUserInfos() {
        return this.userInfos;
    }

    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    public void setUserInfos(final List<WebrtcUserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcGroupSetupDTO)) return false;
        final WebrtcGroupSetupDTO other = (WebrtcGroupSetupDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$userInfos = this.getUserInfos();
        final java.lang.Object other$userInfos = other.getUserInfos();
        if (this$userInfos == null ? other$userInfos != null : !this$userInfos.equals(other$userInfos)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcGroupSetupDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $userInfos = this.getUserInfos();
        result = result * PRIME + ($userInfos == null ? 43 : $userInfos.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcGroupSetupDTO(groupId=" + this.getGroupId() + ", userInfos=" + this.getUserInfos() + ")";
    }
}
