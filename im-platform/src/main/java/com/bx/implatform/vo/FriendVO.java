package com.bx.implatform.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

@Schema(description = "好友信息VO")
public class FriendVO {
    @NotNull(message = "好友id不可为空")
    @Schema(description = "好友id")
    private Long id;
    @NotNull(message = "好友昵称不可为空")
    @Schema(description = "好友昵称")
    private String nickName;
    @Schema(description = "好友头像")
    private String headImage;
    @Schema(description = "是否开启免打扰")
    private Boolean isDnd;
    @Schema(description = "是否置顶会话")
    private Boolean isTop;
    @Schema(description = "是否已删除")
    private Boolean deleted;
    @Schema(description = "版本号")
    private Long version;

    public FriendVO() {
    }

    public Long getId() {
        return this.id;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getHeadImage() {
        return this.headImage;
    }

    public Boolean getIsDnd() {
        return this.isDnd;
    }

    public Boolean getIsTop() {
        return this.isTop;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setNickName(final String nickName) {
        this.nickName = nickName;
    }

    public void setHeadImage(final String headImage) {
        this.headImage = headImage;
    }

    public void setIsDnd(final Boolean isDnd) {
        this.isDnd = isDnd;
    }

    public void setIsTop(final Boolean isTop) {
        this.isTop = isTop;
    }

    public void setDeleted(final Boolean deleted) {
        this.deleted = deleted;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof FriendVO)) return false;
        final FriendVO other = (FriendVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$isDnd = this.getIsDnd();
        final java.lang.Object other$isDnd = other.getIsDnd();
        if (this$isDnd == null ? other$isDnd != null : !this$isDnd.equals(other$isDnd)) return false;
        final java.lang.Object this$isTop = this.getIsTop();
        final java.lang.Object other$isTop = other.getIsTop();
        if (this$isTop == null ? other$isTop != null : !this$isTop.equals(other$isTop)) return false;
        final java.lang.Object this$deleted = this.getDeleted();
        final java.lang.Object other$deleted = other.getDeleted();
        if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
        final java.lang.Object this$version = this.getVersion();
        final java.lang.Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final java.lang.Object this$nickName = this.getNickName();
        final java.lang.Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        final java.lang.Object this$headImage = this.getHeadImage();
        final java.lang.Object other$headImage = other.getHeadImage();
        if (this$headImage == null ? other$headImage != null : !this$headImage.equals(other$headImage)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof FriendVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $isDnd = this.getIsDnd();
        result = result * PRIME + ($isDnd == null ? 43 : $isDnd.hashCode());
        final java.lang.Object $isTop = this.getIsTop();
        result = result * PRIME + ($isTop == null ? 43 : $isTop.hashCode());
        final java.lang.Object $deleted = this.getDeleted();
        result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
        final java.lang.Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final java.lang.Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        final java.lang.Object $headImage = this.getHeadImage();
        result = result * PRIME + ($headImage == null ? 43 : $headImage.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "FriendVO(id=" + this.getId() + ", nickName=" + this.getNickName() + ", headImage=" + this.getHeadImage() + ", isDnd=" + this.getIsDnd() + ", isTop=" + this.getIsTop() + ", deleted=" + this.getDeleted() + ", version=" + this.getVersion() + ")";
    }
}
