package com.bx.implatform.enums;

/**
 * @author: Blue
 * @date: 2024-06-01
 * @version: 1.0
 */
public enum WebrtcMode {
    /**
     * 视频通话
     */
    VIDEO("video"), /**
     * 语音通话
     */
    VOICE("voice");
    private final String value;

    public String getValue() {
        return this.value;
    }

    private WebrtcMode(final String value) {
        this.value = value;
    }
}
