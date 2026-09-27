package com.bx.implatform.exception;

import com.bx.implatform.enums.ResultCode;
import java.io.Serializable;

public class GlobalException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 8134030011662574394L;
    private Integer code;
    private String message;

    public GlobalException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public GlobalException(ResultCode resultCode, String message) {
        this.code = resultCode.getCode();
        this.message = message;
    }

    public GlobalException(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMsg();
    }

    public GlobalException(String message) {
        this.code = ResultCode.PROGRAM_ERROR.getCode();
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GlobalException)) return false;
        final GlobalException other = (GlobalException) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$code = this.getCode();
        final java.lang.Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final java.lang.Object this$message = this.getMessage();
        final java.lang.Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GlobalException;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final java.lang.Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GlobalException(code=" + this.getCode() + ", message=" + this.getMessage() + ")";
    }
}
