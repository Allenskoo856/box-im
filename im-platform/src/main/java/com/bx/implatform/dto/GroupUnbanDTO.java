package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author: Blue
 * @date: 2024-07-14
 * @version: 1.0
 */
@Schema(description = "群组解锁")
public class GroupUnbanDTO {
    @Schema(description = "群组id")
    private Long id;

    public GroupUnbanDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof GroupUnbanDTO)) return false;
        final GroupUnbanDTO other = (GroupUnbanDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof GroupUnbanDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupUnbanDTO(id=" + this.getId() + ")";
    }
}
