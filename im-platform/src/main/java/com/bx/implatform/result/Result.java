package com.bx.implatform.result;

public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result() {
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setData(final T data) {
        this.data = data;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Result)) return false;
        final Result<?> other = (Result<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.getCode() != other.getCode()) return false;
        final java.lang.Object this$message = this.getMessage();
        final java.lang.Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final java.lang.Object this$data = this.getData();
        final java.lang.Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Result;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getCode();
        final java.lang.Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final java.lang.Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Result(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }
}
