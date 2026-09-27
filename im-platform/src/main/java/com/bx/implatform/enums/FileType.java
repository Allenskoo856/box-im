package com.bx.implatform.enums;

public enum FileType {
    /**
     * 文件
     */
    FILE(0, "文件"), /**
     * 图片
     */
    IMAGE(1, "图片"), /**
     * 视频
     */
    VIDEO(2, "视频");
    private final Integer code;
    private final String desc;

    public Integer code() {
        return this.code;
    }

    private FileType(final Integer code, final String desc) {
        this.code = code;
        this.desc = desc;
    }
}
