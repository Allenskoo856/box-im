package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

@Schema(description = "修改密码DTO")
public class ModifyPwdDTO {
    @NotEmpty(message = "旧用户密码不可为空")
    @Schema(description = "旧用户密码")
    private String oldPassword;
    @NotEmpty(message = "新用户密码不可为空")
    @Schema(description = "新用户密码")
    private String newPassword;

    public ModifyPwdDTO() {
    }

    public String getOldPassword() {
        return this.oldPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public void setOldPassword(final String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public void setNewPassword(final String newPassword) {
        this.newPassword = newPassword;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof ModifyPwdDTO)) return false;
        final ModifyPwdDTO other = (ModifyPwdDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$oldPassword = this.getOldPassword();
        final java.lang.Object other$oldPassword = other.getOldPassword();
        if (this$oldPassword == null ? other$oldPassword != null : !this$oldPassword.equals(other$oldPassword)) return false;
        final java.lang.Object this$newPassword = this.getNewPassword();
        final java.lang.Object other$newPassword = other.getNewPassword();
        if (this$newPassword == null ? other$newPassword != null : !this$newPassword.equals(other$newPassword)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof ModifyPwdDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $oldPassword = this.getOldPassword();
        result = result * PRIME + ($oldPassword == null ? 43 : $oldPassword.hashCode());
        final java.lang.Object $newPassword = this.getNewPassword();
        result = result * PRIME + ($newPassword == null ? 43 : $newPassword.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ModifyPwdDTO(oldPassword=" + this.getOldPassword() + ", newPassword=" + this.getNewPassword() + ")";
    }
}
