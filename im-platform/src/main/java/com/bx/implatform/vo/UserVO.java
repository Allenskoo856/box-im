package com.bx.implatform.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Schema(description = "用户信息VO")
public class UserVO {
    @NotNull(message = "用户id不能为空")
    @Schema(description = "id")
    private Long id;
    @NotEmpty(message = "用户名不能为空")
    @Length(max = 20, message = "用户名不能大于20字符")
    @Schema(description = "用户名")
    private String userName;
    @NotEmpty(message = "用户昵称不能为空")
    @Length(max = 20, message = "昵称不能大于20字符")
    @Schema(description = "用户昵称")
    private String nickName;
    @Schema(description = "性别")
    private Integer sex;
    @Schema(description = "用户类型 1:普通用户 2:审核账户")
    private Integer type;
    @Length(max = 128, message = "个性签名不能大于128个字符")
    @Schema(description = "个性签名")
    private String signature;
    @Schema(description = "头像")
    private String headImage;
    @Schema(description = "头像缩略图")
    private String headImageThumb;
    @Schema(description = "是否在线")
    private Boolean online;
    @Schema(description = "账号是否被封禁")
    private Boolean isBanned;
    @Schema(description = "被封禁原因")
    private String reason;

    public UserVO() {
    }

    public Long getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getNickName() {
        return this.nickName;
    }

    public Integer getSex() {
        return this.sex;
    }

    public Integer getType() {
        return this.type;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getHeadImage() {
        return this.headImage;
    }

    public String getHeadImageThumb() {
        return this.headImageThumb;
    }

    public Boolean getOnline() {
        return this.online;
    }

    public Boolean getIsBanned() {
        return this.isBanned;
    }

    public String getReason() {
        return this.reason;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public void setNickName(final String nickName) {
        this.nickName = nickName;
    }

    public void setSex(final Integer sex) {
        this.sex = sex;
    }

    public void setType(final Integer type) {
        this.type = type;
    }

    public void setSignature(final String signature) {
        this.signature = signature;
    }

    public void setHeadImage(final String headImage) {
        this.headImage = headImage;
    }

    public void setHeadImageThumb(final String headImageThumb) {
        this.headImageThumb = headImageThumb;
    }

    public void setOnline(final Boolean online) {
        this.online = online;
    }

    public void setIsBanned(final Boolean isBanned) {
        this.isBanned = isBanned;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof UserVO)) return false;
        final UserVO other = (UserVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$sex = this.getSex();
        final java.lang.Object other$sex = other.getSex();
        if (this$sex == null ? other$sex != null : !this$sex.equals(other$sex)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$online = this.getOnline();
        final java.lang.Object other$online = other.getOnline();
        if (this$online == null ? other$online != null : !this$online.equals(other$online)) return false;
        final java.lang.Object this$isBanned = this.getIsBanned();
        final java.lang.Object other$isBanned = other.getIsBanned();
        if (this$isBanned == null ? other$isBanned != null : !this$isBanned.equals(other$isBanned)) return false;
        final java.lang.Object this$userName = this.getUserName();
        final java.lang.Object other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final java.lang.Object this$nickName = this.getNickName();
        final java.lang.Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        final java.lang.Object this$signature = this.getSignature();
        final java.lang.Object other$signature = other.getSignature();
        if (this$signature == null ? other$signature != null : !this$signature.equals(other$signature)) return false;
        final java.lang.Object this$headImage = this.getHeadImage();
        final java.lang.Object other$headImage = other.getHeadImage();
        if (this$headImage == null ? other$headImage != null : !this$headImage.equals(other$headImage)) return false;
        final java.lang.Object this$headImageThumb = this.getHeadImageThumb();
        final java.lang.Object other$headImageThumb = other.getHeadImageThumb();
        if (this$headImageThumb == null ? other$headImageThumb != null : !this$headImageThumb.equals(other$headImageThumb)) return false;
        final java.lang.Object this$reason = this.getReason();
        final java.lang.Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof UserVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $sex = this.getSex();
        result = result * PRIME + ($sex == null ? 43 : $sex.hashCode());
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $online = this.getOnline();
        result = result * PRIME + ($online == null ? 43 : $online.hashCode());
        final java.lang.Object $isBanned = this.getIsBanned();
        result = result * PRIME + ($isBanned == null ? 43 : $isBanned.hashCode());
        final java.lang.Object $userName = this.getUserName();
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final java.lang.Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        final java.lang.Object $signature = this.getSignature();
        result = result * PRIME + ($signature == null ? 43 : $signature.hashCode());
        final java.lang.Object $headImage = this.getHeadImage();
        result = result * PRIME + ($headImage == null ? 43 : $headImage.hashCode());
        final java.lang.Object $headImageThumb = this.getHeadImageThumb();
        result = result * PRIME + ($headImageThumb == null ? 43 : $headImageThumb.hashCode());
        final java.lang.Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "UserVO(id=" + this.getId() + ", userName=" + this.getUserName() + ", nickName=" + this.getNickName() + ", sex=" + this.getSex() + ", type=" + this.getType() + ", signature=" + this.getSignature() + ", headImage=" + this.getHeadImage() + ", headImageThumb=" + this.getHeadImageThumb() + ", online=" + this.getOnline() + ", isBanned=" + this.getIsBanned() + ", reason=" + this.getReason() + ")";
    }
}
