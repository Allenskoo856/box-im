package com.bx.implatform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

/**
 * @author Blue
 * @version 1.0
 */
@Schema(description = "查询私聊历史消息DTO")
public class PrivateMessageHistoryDTO {
    @NotNull(message = "好友id不可为空")
    @Schema(description = "好友id")
    Long friendId;
    @Size(max = 100, message = "一次最多拉取100条消息")
    @Schema(description = "条件1:本地消息列表")
    List<String> localIds;
    @Size(max = 100, message = "一次最多拉取100条消息")
    @Schema(description = "条件2:消息序号列表")
    List<Long> seqNos;
    @Schema(description = "条件3:最小消息序号")
    Long minSeqNo;
    @Schema(description = "条件3:最大消息序号,0或负值表示不限制")
    Long maxSeqNo;

    public PrivateMessageHistoryDTO() {
    }

    public Long getFriendId() {
        return this.friendId;
    }

    public List<String> getLocalIds() {
        return this.localIds;
    }

    public List<Long> getSeqNos() {
        return this.seqNos;
    }

    public Long getMinSeqNo() {
        return this.minSeqNo;
    }

    public Long getMaxSeqNo() {
        return this.maxSeqNo;
    }

    public void setFriendId(final Long friendId) {
        this.friendId = friendId;
    }

    public void setLocalIds(final List<String> localIds) {
        this.localIds = localIds;
    }

    public void setSeqNos(final List<Long> seqNos) {
        this.seqNos = seqNos;
    }

    public void setMinSeqNo(final Long minSeqNo) {
        this.minSeqNo = minSeqNo;
    }

    public void setMaxSeqNo(final Long maxSeqNo) {
        this.maxSeqNo = maxSeqNo;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof PrivateMessageHistoryDTO)) return false;
        final PrivateMessageHistoryDTO other = (PrivateMessageHistoryDTO) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$friendId = this.getFriendId();
        final java.lang.Object other$friendId = other.getFriendId();
        if (this$friendId == null ? other$friendId != null : !this$friendId.equals(other$friendId)) return false;
        final java.lang.Object this$minSeqNo = this.getMinSeqNo();
        final java.lang.Object other$minSeqNo = other.getMinSeqNo();
        if (this$minSeqNo == null ? other$minSeqNo != null : !this$minSeqNo.equals(other$minSeqNo)) return false;
        final java.lang.Object this$maxSeqNo = this.getMaxSeqNo();
        final java.lang.Object other$maxSeqNo = other.getMaxSeqNo();
        if (this$maxSeqNo == null ? other$maxSeqNo != null : !this$maxSeqNo.equals(other$maxSeqNo)) return false;
        final java.lang.Object this$localIds = this.getLocalIds();
        final java.lang.Object other$localIds = other.getLocalIds();
        if (this$localIds == null ? other$localIds != null : !this$localIds.equals(other$localIds)) return false;
        final java.lang.Object this$seqNos = this.getSeqNos();
        final java.lang.Object other$seqNos = other.getSeqNos();
        if (this$seqNos == null ? other$seqNos != null : !this$seqNos.equals(other$seqNos)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof PrivateMessageHistoryDTO;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $friendId = this.getFriendId();
        result = result * PRIME + ($friendId == null ? 43 : $friendId.hashCode());
        final java.lang.Object $minSeqNo = this.getMinSeqNo();
        result = result * PRIME + ($minSeqNo == null ? 43 : $minSeqNo.hashCode());
        final java.lang.Object $maxSeqNo = this.getMaxSeqNo();
        result = result * PRIME + ($maxSeqNo == null ? 43 : $maxSeqNo.hashCode());
        final java.lang.Object $localIds = this.getLocalIds();
        result = result * PRIME + ($localIds == null ? 43 : $localIds.hashCode());
        final java.lang.Object $seqNos = this.getSeqNos();
        result = result * PRIME + ($seqNos == null ? 43 : $seqNos.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PrivateMessageHistoryDTO(friendId=" + this.getFriendId() + ", localIds=" + this.getLocalIds() + ", seqNos=" + this.getSeqNos() + ", minSeqNo=" + this.getMinSeqNo() + ", maxSeqNo=" + this.getMaxSeqNo() + ")";
    }
}
