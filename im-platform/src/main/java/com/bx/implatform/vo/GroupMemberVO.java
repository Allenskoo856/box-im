package com.bx.implatform.vo;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "群成员信息VO")
public class GroupMemberVO {
    @Schema(description = "用户id")
    private Long userId;
    @Schema(description = "群内显示名称")
    private String showNickName;
    @Schema(description = "群内昵称备注")
    private String remarkNickName;
    @Schema(description = "头像")
    private String headImage;
    @Schema(description = "是否已退出")
    private Boolean quit;
    @Schema(description = "是否在线")
    private Boolean online;
    @Schema(description = "群名显示名称")
    private String showGroupName;
    @Schema(description = "群名备注")
    private String remarkGroupName;
    @Schema(description = "版本号")
    private Long version;

    public GroupMemberVO() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getShowNickName() {
        return this.showNickName;
    }

    public String getRemarkNickName() {
        return this.remarkNickName;
    }

    public String getHeadImage() {
        return this.headImage;
    }

    public Boolean getQuit() {
        return this.quit;
    }

    public Boolean getOnline() {
        return this.online;
    }

    public String getShowGroupName() {
        return this.showGroupName;
    }

    public String getRemarkGroupName() {
        return this.remarkGroupName;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public void setShowNickName(final String showNickName) {
        this.showNickName = showNickName;
    }

    public void setRemarkNickName(final String remarkNickName) {
        this.remarkNickName = remarkNickName;
    }

    public void setHeadImage(final String headImage) {
        this.headImage = headImage;
    }

    public void setQuit(final Boolean quit) {
        this.quit = quit;
    }

    public void setOnline(final Boolean online) {
        this.online = online;
    }

    public void setShowGroupName(final String showGroupName) {
        this.showGroupName = showGroupName;
    }

    public void setRemarkGroupName(final String remarkGroupName) {
        this.remarkGroupName = remarkGroupName;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupMemberVO)) return false;
        final GroupMemberVO other = (GroupMemberVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$quit = this.getQuit();
        final java.lang.Object other$quit = other.getQuit();
        if (this$quit == null ? other$quit != null : !this$quit.equals(other$quit)) return false;
        final java.lang.Object this$online = this.getOnline();
        final java.lang.Object other$online = other.getOnline();
        if (this$online == null ? other$online != null : !this$online.equals(other$online)) return false;
        final java.lang.Object this$version = this.getVersion();
        final java.lang.Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final java.lang.Object this$showNickName = this.getShowNickName();
        final java.lang.Object other$showNickName = other.getShowNickName();
        if (this$showNickName == null ? other$showNickName != null : !this$showNickName.equals(other$showNickName)) return false;
        final java.lang.Object this$remarkNickName = this.getRemarkNickName();
        final java.lang.Object other$remarkNickName = other.getRemarkNickName();
        if (this$remarkNickName == null ? other$remarkNickName != null : !this$remarkNickName.equals(other$remarkNickName)) return false;
        final java.lang.Object this$headImage = this.getHeadImage();
        final java.lang.Object other$headImage = other.getHeadImage();
        if (this$headImage == null ? other$headImage != null : !this$headImage.equals(other$headImage)) return false;
        final java.lang.Object this$showGroupName = this.getShowGroupName();
        final java.lang.Object other$showGroupName = other.getShowGroupName();
        if (this$showGroupName == null ? other$showGroupName != null : !this$showGroupName.equals(other$showGroupName)) return false;
        final java.lang.Object this$remarkGroupName = this.getRemarkGroupName();
        final java.lang.Object other$remarkGroupName = other.getRemarkGroupName();
        if (this$remarkGroupName == null ? other$remarkGroupName != null : !this$remarkGroupName.equals(other$remarkGroupName)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupMemberVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $quit = this.getQuit();
        result = result * PRIME + ($quit == null ? 43 : $quit.hashCode());
        final java.lang.Object $online = this.getOnline();
        result = result * PRIME + ($online == null ? 43 : $online.hashCode());
        final java.lang.Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final java.lang.Object $showNickName = this.getShowNickName();
        result = result * PRIME + ($showNickName == null ? 43 : $showNickName.hashCode());
        final java.lang.Object $remarkNickName = this.getRemarkNickName();
        result = result * PRIME + ($remarkNickName == null ? 43 : $remarkNickName.hashCode());
        final java.lang.Object $headImage = this.getHeadImage();
        result = result * PRIME + ($headImage == null ? 43 : $headImage.hashCode());
        final java.lang.Object $showGroupName = this.getShowGroupName();
        result = result * PRIME + ($showGroupName == null ? 43 : $showGroupName.hashCode());
        final java.lang.Object $remarkGroupName = this.getRemarkGroupName();
        result = result * PRIME + ($remarkGroupName == null ? 43 : $remarkGroupName.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupMemberVO(userId=" + this.getUserId() + ", showNickName=" + this.getShowNickName() + ", remarkNickName=" + this.getRemarkNickName() + ", headImage=" + this.getHeadImage() + ", quit=" + this.getQuit() + ", online=" + this.getOnline() + ", showGroupName=" + this.getShowGroupName() + ", remarkGroupName=" + this.getRemarkGroupName() + ", version=" + this.getVersion() + ")";
    }
}
