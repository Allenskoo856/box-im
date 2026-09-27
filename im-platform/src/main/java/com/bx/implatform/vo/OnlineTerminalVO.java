package com.bx.implatform.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

/**
 * @author: Blue
 * @date: 2023-10-28 21:17:59
 * @version: 1.0
 */
public class OnlineTerminalVO {
    @Schema(description = "用户id")
    private Long userId;
    @Schema(description = "在线终端类型")
    private List<Integer> terminals;

    public Long getUserId() {
        return this.userId;
    }

    public List<Integer> getTerminals() {
        return this.terminals;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public void setTerminals(final List<Integer> terminals) {
        this.terminals = terminals;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof OnlineTerminalVO)) return false;
        final OnlineTerminalVO other = (OnlineTerminalVO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$userId = this.getUserId();
        final java.lang.Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final java.lang.Object this$terminals = this.getTerminals();
        final java.lang.Object other$terminals = other.getTerminals();
        if (this$terminals == null ? other$terminals != null : !this$terminals.equals(other$terminals)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof OnlineTerminalVO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final java.lang.Object $terminals = this.getTerminals();
        result = result * PRIME + ($terminals == null ? 43 : $terminals.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "OnlineTerminalVO(userId=" + this.getUserId() + ", terminals=" + this.getTerminals() + ")";
    }

    public OnlineTerminalVO(final Long userId, final List<Integer> terminals) {
        this.userId = userId;
        this.terminals = terminals;
    }
}
