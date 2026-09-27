package com.bx.imcommon.enums;

/**
 * 强制下线类型
 */
public enum IMForceLogoutType {
    /**
     * 异地登录挤下线
     */
    KICKED(1), /**
     * 账号被封禁
     */
    BANNED(2), /**
     * 账号已注销
     */
    UNREG(3);
    private final Integer code;

    public Integer code() {
        return this.code;
    }

    private IMForceLogoutType(final Integer code) {
        this.code = code;
    }
}
