package com.bx.implatform.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 群
 *
 * @author blue
 * @since 2022-10-31
 */
@TableName("im_group")
public class Group {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 群名字
     */
    private String name;
    /**
     * 群主id
     */
    private Long ownerId;
    /**
     * 群头像
     */
    private String headImage;
    /**
     * 群头像缩略图
     */
    private String headImageThumb;
    /**
     * 群公告
     */
    private String notice;
    /**
     * 是否被封禁
     */
    private Boolean isBanned;
    /**
     * 被封禁原因
     */
    private String reason;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 是否已删除
     */
    private Boolean dissolve;

    public Group() {
    }

    /**
     * id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 群名字
     */
    public String getName() {
        return this.name;
    }

    /**
     * 群主id
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * 群头像
     */
    public String getHeadImage() {
        return this.headImage;
    }

    /**
     * 群头像缩略图
     */
    public String getHeadImageThumb() {
        return this.headImageThumb;
    }

    /**
     * 群公告
     */
    public String getNotice() {
        return this.notice;
    }

    /**
     * 是否被封禁
     */
    public Boolean getIsBanned() {
        return this.isBanned;
    }

    /**
     * 被封禁原因
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * 创建时间
     */
    public Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * 是否已删除
     */
    public Boolean getDissolve() {
        return this.dissolve;
    }

    /**
     * id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 群名字
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 群主id
     */
    public void setOwnerId(final Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 群头像
     */
    public void setHeadImage(final String headImage) {
        this.headImage = headImage;
    }

    /**
     * 群头像缩略图
     */
    public void setHeadImageThumb(final String headImageThumb) {
        this.headImageThumb = headImageThumb;
    }

    /**
     * 群公告
     */
    public void setNotice(final String notice) {
        this.notice = notice;
    }

    /**
     * 是否被封禁
     */
    public void setIsBanned(final Boolean isBanned) {
        this.isBanned = isBanned;
    }

    /**
     * 被封禁原因
     */
    public void setReason(final String reason) {
        this.reason = reason;
    }

    /**
     * 创建时间
     */
    public void setCreatedTime(final Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 是否已删除
     */
    public void setDissolve(final Boolean dissolve) {
        this.dissolve = dissolve;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Group)) return false;
        final Group other = (Group) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$ownerId = this.getOwnerId();
        final java.lang.Object other$ownerId = other.getOwnerId();
        if (this$ownerId == null ? other$ownerId != null : !this$ownerId.equals(other$ownerId)) return false;
        final java.lang.Object this$isBanned = this.getIsBanned();
        final java.lang.Object other$isBanned = other.getIsBanned();
        if (this$isBanned == null ? other$isBanned != null : !this$isBanned.equals(other$isBanned)) return false;
        final java.lang.Object this$dissolve = this.getDissolve();
        final java.lang.Object other$dissolve = other.getDissolve();
        if (this$dissolve == null ? other$dissolve != null : !this$dissolve.equals(other$dissolve)) return false;
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
        final java.lang.Object this$reason = this.getReason();
        final java.lang.Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        final java.lang.Object this$createdTime = this.getCreatedTime();
        final java.lang.Object other$createdTime = other.getCreatedTime();
        if (this$createdTime == null ? other$createdTime != null : !this$createdTime.equals(other$createdTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Group;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $ownerId = this.getOwnerId();
        result = result * PRIME + ($ownerId == null ? 43 : $ownerId.hashCode());
        final java.lang.Object $isBanned = this.getIsBanned();
        result = result * PRIME + ($isBanned == null ? 43 : $isBanned.hashCode());
        final java.lang.Object $dissolve = this.getDissolve();
        result = result * PRIME + ($dissolve == null ? 43 : $dissolve.hashCode());
        final java.lang.Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final java.lang.Object $headImage = this.getHeadImage();
        result = result * PRIME + ($headImage == null ? 43 : $headImage.hashCode());
        final java.lang.Object $headImageThumb = this.getHeadImageThumb();
        result = result * PRIME + ($headImageThumb == null ? 43 : $headImageThumb.hashCode());
        final java.lang.Object $notice = this.getNotice();
        result = result * PRIME + ($notice == null ? 43 : $notice.hashCode());
        final java.lang.Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        final java.lang.Object $createdTime = this.getCreatedTime();
        result = result * PRIME + ($createdTime == null ? 43 : $createdTime.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Group(id=" + this.getId() + ", name=" + this.getName() + ", ownerId=" + this.getOwnerId() + ", headImage=" + this.getHeadImage() + ", headImageThumb=" + this.getHeadImageThumb() + ", notice=" + this.getNotice() + ", isBanned=" + this.getIsBanned() + ", reason=" + this.getReason() + ", createdTime=" + this.getCreatedTime() + ", dissolve=" + this.getDissolve() + ")";
    }
}
