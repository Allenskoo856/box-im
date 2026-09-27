package com.bx.implatform.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

@Schema(description = "群信息VO")
public class GroupVO {
    @Schema(description = "群id")
    private Long id;
    @Length(max = 20, message = "群名称长度不能大于20")
    @NotEmpty(message = "群名称不可为空")
    @Schema(description = "群名称")
    private String name;
    @Schema(description = "群主id")
    private Long ownerId;
    @Schema(description = "头像")
    private String headImage;
    @Schema(description = "头像缩略图")
    private String headImageThumb;
    @Length(max = 1024, message = "群聊显示长度不能大于1024")
    @Schema(description = "群公告")
    private String notice;
    @Length(max = 20, message = "显示昵称长度不能大于20")
    @Schema(description = "用户在群显示昵称")
    private String remarkNickName;
    @Schema(description = "群内显示名称")
    private String showNickName;
    @Schema(description = "群名显示名称")
    private String showGroupName;
    @Length(max = 20, message = "群备注长度不能大于20")
    @Schema(description = "群名备注")
    private String remarkGroupName;
    @Schema(description = "是否已解散")
    private Boolean dissolve;
    @Schema(description = "是否已退出")
    private Boolean quit;
    @Schema(description = "账号是否被封禁")
    private Boolean isBanned;
    @Schema(description = "被封禁原因")
    private String reason;
    @Schema(description = "是否开启免打扰")
    private Boolean isDnd;
    @Schema(description = "是否置顶会话")
    private Boolean isTop;
    @Schema(description = "版本号")
    private Long version;

    public GroupVO() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Long getOwnerId() {
        return this.ownerId;
    }

    public String getHeadImage() {
        return this.headImage;
    }

    public String getHeadImageThumb() {
        return this.headImageThumb;
    }

    public String getNotice() {
        return this.notice;
    }

    public String getRemarkNickName() {
        return this.remarkNickName;
    }

    public String getShowNickName() {
        return this.showNickName;
    }

    public String getShowGroupName() {
        return this.showGroupName;
    }

    public String getRemarkGroupName() {
        return this.remarkGroupName;
    }

    public Boolean getDissolve() {
        return this.dissolve;
    }

    public Boolean getQuit() {
        return this.quit;
    }

    public Boolean getIsBanned() {
        return this.isBanned;
    }

    public String getReason() {
        return this.reason;
    }

    public Boolean getIsDnd() {
        return this.isDnd;
    }

    public Boolean getIsTop() {
        return this.isTop;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setOwnerId(final Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setHeadImage(final String headImage) {
        this.headImage = headImage;
    }

    public void setHeadImageThumb(final String headImageThumb) {
        this.headImageThumb = headImageThumb;
    }

    public void setNotice(final String notice) {
        this.notice = notice;
    }

    public void setRemarkNickName(final String remarkNickName) {
        this.remarkNickName = remarkNickName;
    }

    public void setShowNickName(final String showNickName) {
        this.showNickName = showNickName;
    }

    public void setShowGroupName(final String showGroupName) {
        this.showGroupName = showGroupName;
    }

    public void setRemarkGroupName(final String remarkGroupName) {
        this.remarkGroupName = remarkGroupName;
    }

    public void setDissolve(final Boolean dissolve) {
        this.dissolve = dissolve;
    }

    public void setQuit(final Boolean quit) {
        this.quit = quit;
    }

    public void setIsBanned(final Boolean isBanned) {
        this.isBanned = isBanned;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public void setIsDnd(final Boolean isDnd) {
        this.isDnd = isDnd;
    }

    public void setIsTop(final Boolean isTop) {
        this.isTop = isTop;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupVO)) return false;
        final GroupVO other = (GroupVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$ownerId = this.getOwnerId();
        final java.lang.Object other$ownerId = other.getOwnerId();
        if (this$ownerId == null ? other$ownerId != null : !this$ownerId.equals(other$ownerId)) return false;
        final java.lang.Object this$dissolve = this.getDissolve();
        final java.lang.Object other$dissolve = other.getDissolve();
        if (this$dissolve == null ? other$dissolve != null : !this$dissolve.equals(other$dissolve)) return false;
        final java.lang.Object this$quit = this.getQuit();
        final java.lang.Object other$quit = other.getQuit();
        if (this$quit == null ? other$quit != null : !this$quit.equals(other$quit)) return false;
        final java.lang.Object this$isBanned = this.getIsBanned();
        final java.lang.Object other$isBanned = other.getIsBanned();
        if (this$isBanned == null ? other$isBanned != null : !this$isBanned.equals(other$isBanned)) return false;
        final java.lang.Object this$isDnd = this.getIsDnd();
        final java.lang.Object other$isDnd = other.getIsDnd();
        if (this$isDnd == null ? other$isDnd != null : !this$isDnd.equals(other$isDnd)) return false;
        final java.lang.Object this$isTop = this.getIsTop();
        final java.lang.Object other$isTop = other.getIsTop();
        if (this$isTop == null ? other$isTop != null : !this$isTop.equals(other$isTop)) return false;
        final java.lang.Object this$version = this.getVersion();
        final java.lang.Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final java.lang.Object this$name = this.getName();
        final java.lang.Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final java.lang.Object this$headImage = this.getHeadImage();
        final java.lang.Object other$headImage = other.getHeadImage();
        if (this$headImage == null ? other$headImage != null : !this$headImage.equals(other$headImage)) return false;
        final java.lang.Object this$headImageThumb = this.getHeadImageThumb();
        final java.lang.Object other$headImageThumb = other.getHeadImageThumb();
        if (this$headImageThumb == null ? other$headImageThumb != null : !this$headImageThumb.equals(other$headImageThumb)) return false;
        final java.lang.Object this$notice = this.getNotice();
        final java.lang.Object other$notice = other.getNotice();
        if (this$notice == null ? other$notice != null : !this$notice.equals(other$notice)) return false;
        final java.lang.Object this$remarkNickName = this.getRemarkNickName();
        final java.lang.Object other$remarkNickName = other.getRemarkNickName();
        if (this$remarkNickName == null ? other$remarkNickName != null : !this$remarkNickName.equals(other$remarkNickName)) return false;
        final java.lang.Object this$showNickName = this.getShowNickName();
        final java.lang.Object other$showNickName = other.getShowNickName();
        if (this$showNickName == null ? other$showNickName != null : !this$showNickName.equals(other$showNickName)) return false;
        final java.lang.Object this$showGroupName = this.getShowGroupName();
        final java.lang.Object other$showGroupName = other.getShowGroupName();
        if (this$showGroupName == null ? other$showGroupName != null : !this$showGroupName.equals(other$showGroupName)) return false;
        final java.lang.Object this$remarkGroupName = this.getRemarkGroupName();
        final java.lang.Object other$remarkGroupName = other.getRemarkGroupName();
        if (this$remarkGroupName == null ? other$remarkGroupName != null : !this$remarkGroupName.equals(other$remarkGroupName)) return false;
        final java.lang.Object this$reason = this.getReason();
        final java.lang.Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $ownerId = this.getOwnerId();
        result = result * PRIME + ($ownerId == null ? 43 : $ownerId.hashCode());
        final java.lang.Object $dissolve = this.getDissolve();
        result = result * PRIME + ($dissolve == null ? 43 : $dissolve.hashCode());
        final java.lang.Object $quit = this.getQuit();
        result = result * PRIME + ($quit == null ? 43 : $quit.hashCode());
        final java.lang.Object $isBanned = this.getIsBanned();
        result = result * PRIME + ($isBanned == null ? 43 : $isBanned.hashCode());
        final java.lang.Object $isDnd = this.getIsDnd();
        result = result * PRIME + ($isDnd == null ? 43 : $isDnd.hashCode());
        final java.lang.Object $isTop = this.getIsTop();
        result = result * PRIME + ($isTop == null ? 43 : $isTop.hashCode());
        final java.lang.Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final java.lang.Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final java.lang.Object $headImage = this.getHeadImage();
        result = result * PRIME + ($headImage == null ? 43 : $headImage.hashCode());
        final java.lang.Object $headImageThumb = this.getHeadImageThumb();
        result = result * PRIME + ($headImageThumb == null ? 43 : $headImageThumb.hashCode());
        final java.lang.Object $notice = this.getNotice();
        result = result * PRIME + ($notice == null ? 43 : $notice.hashCode());
        final java.lang.Object $remarkNickName = this.getRemarkNickName();
        result = result * PRIME + ($remarkNickName == null ? 43 : $remarkNickName.hashCode());
        final java.lang.Object $showNickName = this.getShowNickName();
        result = result * PRIME + ($showNickName == null ? 43 : $showNickName.hashCode());
        final java.lang.Object $showGroupName = this.getShowGroupName();
        result = result * PRIME + ($showGroupName == null ? 43 : $showGroupName.hashCode());
        final java.lang.Object $remarkGroupName = this.getRemarkGroupName();
        result = result * PRIME + ($remarkGroupName == null ? 43 : $remarkGroupName.hashCode());
        final java.lang.Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupVO(id=" + this.getId() + ", name=" + this.getName() + ", ownerId=" + this.getOwnerId() + ", headImage=" + this.getHeadImage() + ", headImageThumb=" + this.getHeadImageThumb() + ", notice=" + this.getNotice() + ", remarkNickName=" + this.getRemarkNickName() + ", showNickName=" + this.getShowNickName() + ", showGroupName=" + this.getShowGroupName() + ", remarkGroupName=" + this.getRemarkGroupName() + ", dissolve=" + this.getDissolve() + ", quit=" + this.getQuit() + ", isBanned=" + this.getIsBanned() + ", reason=" + this.getReason() + ", isDnd=" + this.getIsDnd() + ", isTop=" + this.getIsTop() + ", version=" + this.getVersion() + ")";
    }
}
