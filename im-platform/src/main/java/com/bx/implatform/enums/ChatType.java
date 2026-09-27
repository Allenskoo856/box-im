package com.bx.implatform.enums;

/**
 * 会话类型枚举
 *
 * @author Blue
 * @date 2025-12-31
 */
public enum ChatType {
    /**
     * 私聊
     */
    PRIVATE(1, "私聊"), /**
     * 群聊
     */
    GROUP(2, "群聊");
    private final Integer code;
    private final String desc;

    /**
     * 根据code获取枚举
     *
     * @param code 类型码
     * @return 枚举值
     */
    public static ChatType fromCode(Integer code) {
        for (ChatType type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    private ChatType(final Integer code, final String desc) {
        this.code = code;
        this.desc = desc;
    }
}
