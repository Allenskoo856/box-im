package com.bx.implatform.enums;

/**
 * 消息删除类型枚举
 *
 * @author Blue
 * @date 2025-12-31
 */
public enum DeleteType {
    /**
     * 按消息删除
     */
    BY_MESSAGE(1, "按消息删除"), /**
     * 按会话删除
     */
    BY_CHAT(2, "按会话删除");
    private final Integer code;
    private final String desc;

    /**
     * 根据code获取枚举
     *
     * @param code 类型码
     * @return 枚举值
     */
    public static DeleteType fromCode(Integer code) {
        for (DeleteType type : values()) {
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

    private DeleteType(final Integer code, final String desc) {
        this.code = code;
        this.desc = desc;
    }
}
