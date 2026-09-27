package com.bx.imcommon.model;

/**
 * @author: Blue
 * @date: 2023-09-24 09:23:11
 * @version: 1.0
 */
public class IMUserInfo {
    /**
     * 用户id
     */
    private Long id;
    /**
     * 用户终端类型 IMTerminalType
     */
    private Integer terminal;

    /**
     * 用户id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 用户终端类型 IMTerminalType
     */
    public Integer getTerminal() {
        return this.terminal;
    }

    /**
     * 用户id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 用户终端类型 IMTerminalType
     */
    public void setTerminal(final Integer terminal) {
        this.terminal = terminal;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof IMUserInfo)) return false;
        final IMUserInfo other = (IMUserInfo) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$terminal = this.getTerminal();
        final java.lang.Object other$terminal = other.getTerminal();
        if (this$terminal == null ? other$terminal != null : !this$terminal.equals(other$terminal)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof IMUserInfo;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $terminal = this.getTerminal();
        result = result * PRIME + ($terminal == null ? 43 : $terminal.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "IMUserInfo(id=" + this.getId() + ", terminal=" + this.getTerminal() + ")";
    }

    public IMUserInfo() {
    }

    public IMUserInfo(final Long id, final Integer terminal) {
        this.id = id;
        this.terminal = terminal;
    }
}
