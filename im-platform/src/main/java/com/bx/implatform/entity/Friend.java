package com.bx.implatform.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * <p>
 * 好友
 * </p>
 *
 * @author blue
 * @since 2022-10-22
 */
@TableName("im_friend")
public class Friend {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 好友id
     */
    private Long friendId;
    /**
     * 用户昵称
     */
    private String friendNickName;
    /**
     * 用户头像
     */
    private String friendHeadImage;
    /**
     * 是否开启免打扰
     */
    private Boolean isDnd;
    /**
     * 是否置顶会话
     */
    private Boolean isTop;
    /**
     * 是否已删除
     */
    private Boolean deleted;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 版本号
     */
    private Long version;

    public Friend() {
    }

    /**
     * id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 用户id
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 好友id
     */
    public Long getFriendId() {
        return this.friendId;
    }

    /**
     * 用户昵称
     */
    public String getFriendNickName() {
        return this.friendNickName;
    }

    /**
     * 用户头像
     */
    public String getFriendHeadImage() {
        return this.friendHeadImage;
    }

    /**
     * 是否开启免打扰
     */
    public Boolean getIsDnd() {
        return this.isDnd;
    }

    /**
     * 是否置顶会话
     */
    public Boolean getIsTop() {
        return this.isTop;
    }

    /**
     * 是否已删除
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * 创建时间
     */
    public Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * 版本号
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 用户id
     */
    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    /**
     * 好友id
     */
    public void setFriendId(final Long friendId) {
        this.friendId = friendId;
    }

    /**
     * 用户昵称
     */
    public void setFriendNickName(final String friendNickName) {
        this.friendNickName = friendNickName;
    }

    /**
     * 用户头像
     */
    public void setFriendHeadImage(final String friendHeadImage) {
        this.friendHeadImage = friendHeadImage;
    }

    /**
     * 是否开启免打扰
     */
    public void setIsDnd(final Boolean isDnd) {
        this.isDnd = isDnd;
    }

    /**
     * 是否置顶会话
     */
    public void setIsTop(final Boolean isTop) {
        this.isTop = isTop;
    }

    /**
     * 是否已删除
     */
    public void setDeleted(final Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 创建时间
     */
    public void setCreatedTime(final Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 版本号
     */
    public void setVersion(final Long version) {
        this.version = version;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Friend)) return false;
        final Friend other = (Friend) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$friendId = this.getFriendId();
        final java.lang.Object other$friendId = other.getFriendId();
        if (this$friendId == null ? other$friendId != null : !this$friendId.equals(other$friendId)) return false;
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
        final java.lang.Object this$friendNickName = this.getFriendNickName();
        final java.lang.Object other$friendNickName = other.getFriendNickName();
        if (this$friendNickName == null ? other$friendNickName != null : !this$friendNickName.equals(other$friendNickName)) return false;
        final java.lang.Object this$friendHeadImage = this.getFriendHeadImage();
        final java.lang.Object other$friendHeadImage = other.getFriendHeadImage();
        if (this$friendHeadImage == null ? other$friendHeadImage != null : !this$friendHeadImage.equals(other$friendHeadImage)) return false;
        final java.lang.Object this$createdTime = this.getCreatedTime();
        final java.lang.Object other$createdTime = other.getCreatedTime();
        if (this$createdTime == null ? other$createdTime != null : !this$createdTime.equals(other$createdTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Friend;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $friendId = this.getFriendId();
        result = result * PRIME + ($friendId == null ? 43 : $friendId.hashCode());
        final java.lang.Object $isDnd = this.getIsDnd();
        result = result * PRIME + ($isDnd == null ? 43 : $isDnd.hashCode());
        final java.lang.Object $isTop = this.getIsTop();
        result = result * PRIME + ($isTop == null ? 43 : $isTop.hashCode());
        final java.lang.Object $deleted = this.getDeleted();
        result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
        final java.lang.Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final java.lang.Object $friendNickName = this.getFriendNickName();
        result = result * PRIME + ($friendNickName == null ? 43 : $friendNickName.hashCode());
        final java.lang.Object $friendHeadImage = this.getFriendHeadImage();
        result = result * PRIME + ($friendHeadImage == null ? 43 : $friendHeadImage.hashCode());
        final java.lang.Object $createdTime = this.getCreatedTime();
        result = result * PRIME + ($createdTime == null ? 43 : $createdTime.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Friend(id=" + this.getId() + ", userId=" + this.getUserId() + ", friendId=" + this.getFriendId() + ", friendNickName=" + this.getFriendNickName() + ", friendHeadImage=" + this.getFriendHeadImage() + ", isDnd=" + this.getIsDnd() + ", isTop=" + this.getIsTop() + ", deleted=" + this.getDeleted() + ", createdTime=" + this.getCreatedTime() + ", version=" + this.getVersion() + ")";
    }
}
