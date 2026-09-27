package com.bx.implatform.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author blue
 * @since 2022-10-01
 */
@TableName("im_user")
public class User {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 用户头像
     */
    private String headImage;
    /**
     * 用户头像缩略图
     */
    private String headImageThumb;
    /**
     * 密码(明文)
     */
    private String password;
    /**
     * 性别 0:男 1::女
     */
    private Integer sex;
    /**
     * 个性签名
     */
    private String signature;
    /**
     * 账号是否被封禁
     */
    private Boolean isBanned;
    /**
     * 账号被封禁原因
     */
    private String reason;
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;
    /**
     * 创建时间(注册时间)
     */
    private Date createdTime;
    /**
     * 账号类型 1:普通用户 2:wx小程序审核账户
     */
    private Integer type;

    public User() {
    }

    /**
     * id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 用户名
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * 用户昵称
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * 用户头像
     */
    public String getHeadImage() {
        return this.headImage;
    }

    /**
     * 用户头像缩略图
     */
    public String getHeadImageThumb() {
        return this.headImageThumb;
    }

    /**
     * 密码(明文)
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 性别 0:男 1::女
     */
    public Integer getSex() {
        return this.sex;
    }

    /**
     * 个性签名
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * 账号是否被封禁
     */
    public Boolean getIsBanned() {
        return this.isBanned;
    }

    /**
     * 账号被封禁原因
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * 最后登录时间
     */
    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    /**
     * 创建时间(注册时间)
     */
    public Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * 账号类型 1:普通用户 2:wx小程序审核账户
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 用户名
     */
    public void setUserName(final String userName) {
        this.userName = userName;
    }

    /**
     * 用户昵称
     */
    public void setNickName(final String nickName) {
        this.nickName = nickName;
    }

    /**
     * 用户头像
     */
    public void setHeadImage(final String headImage) {
        this.headImage = headImage;
    }

    /**
     * 用户头像缩略图
     */
    public void setHeadImageThumb(final String headImageThumb) {
        this.headImageThumb = headImageThumb;
    }

    /**
     * 密码(明文)
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * 性别 0:男 1::女
     */
    public void setSex(final Integer sex) {
        this.sex = sex;
    }

    /**
     * 个性签名
     */
    public void setSignature(final String signature) {
        this.signature = signature;
    }

    /**
     * 账号是否被封禁
     */
    public void setIsBanned(final Boolean isBanned) {
        this.isBanned = isBanned;
    }

    /**
     * 账号被封禁原因
     */
    public void setReason(final String reason) {
        this.reason = reason;
    }

    /**
     * 最后登录时间
     */
    public void setLastLoginTime(final Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 创建时间(注册时间)
     */
    public void setCreatedTime(final Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 账号类型 1:普通用户 2:wx小程序审核账户
     */
    public void setType(final Integer type) {
        this.type = type;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$sex = this.getSex();
        final java.lang.Object other$sex = other.getSex();
        if (this$sex == null ? other$sex != null : !this$sex.equals(other$sex)) return false;
        final java.lang.Object this$isBanned = this.getIsBanned();
        final java.lang.Object other$isBanned = other.getIsBanned();
        if (this$isBanned == null ? other$isBanned != null : !this$isBanned.equals(other$isBanned)) return false;
        final java.lang.Object this$type = this.getType();
        final java.lang.Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final java.lang.Object this$userName = this.getUserName();
        final java.lang.Object other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final java.lang.Object this$nickName = this.getNickName();
        final java.lang.Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        final java.lang.Object this$headImage = this.getHeadImage();
        final java.lang.Object other$headImage = other.getHeadImage();
        if (this$headImage == null ? other$headImage != null : !this$headImage.equals(other$headImage)) return false;
        final java.lang.Object this$headImageThumb = this.getHeadImageThumb();
        final java.lang.Object other$headImageThumb = other.getHeadImageThumb();
        if (this$headImageThumb == null ? other$headImageThumb != null : !this$headImageThumb.equals(other$headImageThumb)) return false;
        final java.lang.Object this$password = this.getPassword();
        final java.lang.Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final java.lang.Object this$signature = this.getSignature();
        final java.lang.Object other$signature = other.getSignature();
        if (this$signature == null ? other$signature != null : !this$signature.equals(other$signature)) return false;
        final java.lang.Object this$reason = this.getReason();
        final java.lang.Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        final java.lang.Object this$lastLoginTime = this.getLastLoginTime();
        final java.lang.Object other$lastLoginTime = other.getLastLoginTime();
        if (this$lastLoginTime == null ? other$lastLoginTime != null : !this$lastLoginTime.equals(other$lastLoginTime)) return false;
        final java.lang.Object this$createdTime = this.getCreatedTime();
        final java.lang.Object other$createdTime = other.getCreatedTime();
        if (this$createdTime == null ? other$createdTime != null : !this$createdTime.equals(other$createdTime)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof User;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $sex = this.getSex();
        result = result * PRIME + ($sex == null ? 43 : $sex.hashCode());
        final java.lang.Object $isBanned = this.getIsBanned();
        result = result * PRIME + ($isBanned == null ? 43 : $isBanned.hashCode());
        final java.lang.Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final java.lang.Object $userName = this.getUserName();
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final java.lang.Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        final java.lang.Object $headImage = this.getHeadImage();
        result = result * PRIME + ($headImage == null ? 43 : $headImage.hashCode());
        final java.lang.Object $headImageThumb = this.getHeadImageThumb();
        result = result * PRIME + ($headImageThumb == null ? 43 : $headImageThumb.hashCode());
        final java.lang.Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final java.lang.Object $signature = this.getSignature();
        result = result * PRIME + ($signature == null ? 43 : $signature.hashCode());
        final java.lang.Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        final java.lang.Object $lastLoginTime = this.getLastLoginTime();
        result = result * PRIME + ($lastLoginTime == null ? 43 : $lastLoginTime.hashCode());
        final java.lang.Object $createdTime = this.getCreatedTime();
        result = result * PRIME + ($createdTime == null ? 43 : $createdTime.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User(id=" + this.getId() + ", userName=" + this.getUserName() + ", nickName=" + this.getNickName() + ", headImage=" + this.getHeadImage() + ", headImageThumb=" + this.getHeadImageThumb() + ", password=" + this.getPassword() + ", sex=" + this.getSex() + ", signature=" + this.getSignature() + ", isBanned=" + this.getIsBanned() + ", reason=" + this.getReason() + ", lastLoginTime=" + this.getLastLoginTime() + ", createdTime=" + this.getCreatedTime() + ", type=" + this.getType() + ")";
    }
}
