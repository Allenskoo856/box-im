package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Schema(description = "用户登录DTO")
public class LoginDTO {
    @Max(value = 2, message = "登录终端类型取值范围:0,2")
    @Min(value = 0, message = "登录终端类型取值范围:0,2")
    @NotNull(message = "登录终端类型不可为空")
    @Schema(description = "登录终端 0:web 1:app 2:pc")
    private Integer terminal;
    @NotEmpty(message = "用户名不可为空")
    @Schema(description = "用户名")
    private String userName;
    @NotEmpty(message = "用户密码不可为空")
    @Schema(description = "用户密码")
    private String password;

    public LoginDTO() {
    }

    public Integer getTerminal() {
        return this.terminal;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setTerminal(final Integer terminal) {
        this.terminal = terminal;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginDTO)) return false;
        final LoginDTO other = (LoginDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$terminal = this.getTerminal();
        final java.lang.Object other$terminal = other.getTerminal();
        if (this$terminal == null ? other$terminal != null : !this$terminal.equals(other$terminal)) return false;
        final java.lang.Object this$userName = this.getUserName();
        final java.lang.Object other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final java.lang.Object this$password = this.getPassword();
        final java.lang.Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof LoginDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $terminal = this.getTerminal();
        result = result * PRIME + ($terminal == null ? 43 : $terminal.hashCode());
        final java.lang.Object $userName = this.getUserName();
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final java.lang.Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "LoginDTO(terminal=" + this.getTerminal() + ", userName=" + this.getUserName() + ", password=" + this.getPassword() + ")";
    }
}
