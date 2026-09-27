package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author: Blue
 * @date: 2024-07-14
 * @version: 1.0
 */
@Schema(description = "群组封禁")
public class GroupBanDTO {
    @Schema(description = "群组id")
    private Long id;
    @Schema(description = "封禁原因")
    private String reason;

    public GroupBanDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public String getReason() {
        return this.reason;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupBanDTO)) return false;
        final GroupBanDTO other = (GroupBanDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$reason = this.getReason();
        final java.lang.Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupBanDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupBanDTO(id=" + this.getId() + ", reason=" + this.getReason() + ")";
    }
}
