package com.bx.implatform.entity;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;

/**
 * <p>
 * 群成员
 * </p>
 *
 * @author blue
 * @since 2022-10-31
 */
@TableName("im_group_member")
public class GroupMember extends Model<GroupMember> {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 群id
     */
    private Long groupId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户昵称
     */
    private String userNickName;
    /**
     * 显示昵称备注
     */
    private String remarkNickName;
    /**
     * 用户头像
     */
    private String headImage;
    /**
     * 显示群名备注
     */
    private String remarkGroupName;
    /**
     * 是否免打扰
     */
    private Boolean isDnd;
    /**
     * 是否置顶会话
     */
    private Boolean isTop;
    /**
     * 是否已退出
     */
    private Boolean quit;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 退出时间
     */
    private Date quitTime;
    /**
     * 版本号
     */
    private Long version;

    public String getShowNickName() {
        return StrUtil.blankToDefault(remarkNickName, userNickName);
    }

    public GroupMember() {
    }

    /**
     * id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 群id
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * 用户id
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 用户昵称
     */
    public String getUserNickName() {
        return this.userNickName;
    }

    /**
     * 显示昵称备注
     */
    public String getRemarkNickName() {
        return this.remarkNickName;
    }

    /**
     * 用户头像
     */
    public String getHeadImage() {
        return this.headImage;
    }

    /**
     * 显示群名备注
     */
    public String getRemarkGroupName() {
        return this.remarkGroupName;
    }

    /**
     * 是否免打扰
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
     * 是否已退出
     */
    public Boolean getQuit() {
        return this.quit;
    }

    /**
     * 创建时间
     */
    public Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * 退出时间
     */
    public Date getQuitTime() {
        return this.quitTime;
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
     * 群id
     */
    public void setGroupId(final Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 用户id
     */
    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    /**
     * 用户昵称
     */
    public void setUserNickName(final String userNickName) {
        this.userNickName = userNickName;
    }

    /**
     * 显示昵称备注
     */
    public void setRemarkNickName(final String remarkNickName) {
        this.remarkNickName = remarkNickName;
    }

    /**
     * 用户头像
     */
    public void setHeadImage(final String headImage) {
        this.headImage = headImage;
    }

    /**
     * 显示群名备注
     */
    public void setRemarkGroupName(final String remarkGroupName) {
        this.remarkGroupName = remarkGroupName;
    }

    /**
     * 是否免打扰
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
     * 是否已退出
     */
    public void setQuit(final Boolean quit) {
        this.quit = quit;
    }

    /**
     * 创建时间
     */
    public void setCreatedTime(final Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 退出时间
     */
    public void setQuitTime(final Date quitTime) {
        this.quitTime = quitTime;
    }

    /**
     * 版本号
     */
    public void setVersion(final Long version) {
        this.version = version;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupMember(id=" + this.getId() + ", groupId=" + this.getGroupId() + ", userId=" + this.getUserId() + ", userNickName=" + this.getUserNickName() + ", remarkNickName=" + this.getRemarkNickName() + ", headImage=" + this.getHeadImage() + ", remarkGroupName=" + this.getRemarkGroupName() + ", isDnd=" + this.getIsDnd() + ", isTop=" + this.getIsTop() + ", quit=" + this.getQuit() + ", createdTime=" + this.getCreatedTime() + ", quitTime=" + this.getQuitTime() + ", version=" + this.getVersion() + ")";
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupMember)) return false;
        final GroupMember other = (GroupMember) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$groupId = this.getGroupId();
        final java.lang.Object other$groupId = other.getGroupId();
        if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$isDnd = this.getIsDnd();
        final java.lang.Object other$isDnd = other.getIsDnd();
        if (this$isDnd == null ? other$isDnd != null : !this$isDnd.equals(other$isDnd)) return false;
        final java.lang.Object this$isTop = this.getIsTop();
        final java.lang.Object other$isTop = other.getIsTop();
        if (this$isTop == null ? other$isTop != null : !this$isTop.equals(other$isTop)) return false;
        final java.lang.Object this$quit = this.getQuit();
        final java.lang.Object other$quit = other.getQuit();
        if (this$quit == null ? other$quit != null : !this$quit.equals(other$quit)) return false;
        final java.lang.Object this$version = this.getVersion();
        final java.lang.Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final java.lang.Object this$userNickName = this.getUserNickName();
        final java.lang.Object other$userNickName = other.getUserNickName();
        if (this$userNickName == null ? other$userNickName != null : !this$userNickName.equals(other$userNickName)) return false;
        final java.lang.Object this$remarkNickName = this.getRemarkNickName();
        final java.lang.Object other$remarkNickName = other.getRemarkNickName();
        if (this$remarkNickName == null ? other$remarkNickName != null : !this$remarkNickName.equals(other$remarkNickName)) return false;
        final java.lang.Object this$headImage = this.getHeadImage();
        final java.lang.Object other$headImage = other.getHeadImage();
        if (this$headImage == null ? other$headImage != null : !this$headImage.equals(other$headImage)) return false;
        final java.lang.Object this$remarkGroupName = this.getRemarkGroupName();
        final java.lang.Object other$remarkGroupName = other.getRemarkGroupName();
        if (this$remarkGroupName == null ? other$remarkGroupName != null : !this$remarkGroupName.equals(other$remarkGroupName)) return false;
        final java.lang.Object this$createdTime = this.getCreatedTime();
        final java.lang.Object other$createdTime = other.getCreatedTime();
        if (this$createdTime == null ? other$createdTime != null : !this$createdTime.equals(other$createdTime)) return false;
        final java.lang.Object this$quitTime = this.getQuitTime();
        final java.lang.Object other$quitTime = other.getQuitTime();
        if (this$quitTime == null ? other$quitTime != null : !this$quitTime.equals(other$quitTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupMember;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $groupId = this.getGroupId();
        result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $isDnd = this.getIsDnd();
        result = result * PRIME + ($isDnd == null ? 43 : $isDnd.hashCode());
        final java.lang.Object $isTop = this.getIsTop();
        result = result * PRIME + ($isTop == null ? 43 : $isTop.hashCode());
        final java.lang.Object $quit = this.getQuit();
        result = result * PRIME + ($quit == null ? 43 : $quit.hashCode());
        final java.lang.Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final java.lang.Object $userNickName = this.getUserNickName();
        result = result * PRIME + ($userNickName == null ? 43 : $userNickName.hashCode());
        final java.lang.Object $remarkNickName = this.getRemarkNickName();
        result = result * PRIME + ($remarkNickName == null ? 43 : $remarkNickName.hashCode());
        final java.lang.Object $headImage = this.getHeadImage();
        result = result * PRIME + ($headImage == null ? 43 : $headImage.hashCode());
        final java.lang.Object $remarkGroupName = this.getRemarkGroupName();
        result = result * PRIME + ($remarkGroupName == null ? 43 : $remarkGroupName.hashCode());
        final java.lang.Object $createdTime = this.getCreatedTime();
        result = result * PRIME + ($createdTime == null ? 43 : $createdTime.hashCode());
        final java.lang.Object $quitTime = this.getQuitTime();
        result = result * PRIME + ($quitTime == null ? 43 : $quitTime.hashCode());
        return result;
    }
}
