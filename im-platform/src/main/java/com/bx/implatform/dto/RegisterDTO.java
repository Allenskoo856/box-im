package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

@Schema(description = "用户注册DTO")
public class RegisterDTO {
    @Length(max = 20, message = "用户名不能大于20字符")
    @NotEmpty(message = "用户名不可为空")
    @Schema(description = "用户名")
    private String userName;
    @Length(min = 5, max = 20, message = "密码长度必须在5-20个字符之间")
    @NotEmpty(message = "用户密码不可为空")
    @Schema(description = "用户密码")
    private String password;
    @Length(max = 20, message = "昵称不能大于20字符")
    @Schema(description = "用户昵称")
    private String nickName;

    public RegisterDTO() {
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setNickName(final String nickName) {
        this.nickName = nickName;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof RegisterDTO)) return false;
        final RegisterDTO other = (RegisterDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$userName = this.getUserName();
        final java.lang.Object other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final java.lang.Object this$password = this.getPassword();
        final java.lang.Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final java.lang.Object this$nickName = this.getNickName();
        final java.lang.Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof RegisterDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $userName = this.getUserName();
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final java.lang.Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final java.lang.Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "RegisterDTO(userName=" + this.getUserName() + ", password=" + this.getPassword() + ", nickName=" + this.getNickName() + ")";
    }
}
