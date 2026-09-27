package com.bx.implatform.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

/**
 * 敏感词
 *
 * @author Blue 
 * @since 1.0.0 2024-07-20
 */
@TableName("im_sensitive_word")
public class SensitiveWord {
	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 敏感词内容
	 */
	private String content;
	/**
	 * 是否启用
	 */
	private Boolean enabled;
	/**
	 * 创建者
	 */
	@TableField(fill = FieldFill.INSERT)
	private Long creator;
	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	private LocalDateTime createTime;

	public SensitiveWord() {
	}

	/**
	 * id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * 敏感词内容
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * 是否启用
	 */
	public Boolean getEnabled() {
		return this.enabled;
	}

	/**
	 * 创建者
	 */
	public Long getCreator() {
		return this.creator;
	}

	/**
	 * 创建时间
	 */
	public LocalDateTime getCreateTime() {
		return this.createTime;
	}

	/**
	 * id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * 敏感词内容
	 */
	public void setContent(final String content) {
		this.content = content;
	}

	/**
	 * 是否启用
	 */
	public void setEnabled(final Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 创建者
	 */
	public void setCreator(final Long creator) {
		this.creator = creator;
	}

	/**
	 * 创建时间
	 */
	public void setCreateTime(final LocalDateTime createTime) {
		this.createTime = createTime;
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof SensitiveWord)) return false;
		final SensitiveWord other = (SensitiveWord) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		final java.lang.Object this$id = this.getId();
		final java.lang.Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		final java.lang.Object this$enabled = this.getEnabled();
		final java.lang.Object other$enabled = other.getEnabled();
		if (this$enabled == null ? other$enabled != null : !this$enabled.equals(other$enabled)) return false;
		final java.lang.Object this$creator = this.getCreator();
		final java.lang.Object other$creator = other.getCreator();
		if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) return false;
		final java.lang.Object this$content = this.getContent();
		final java.lang.Object other$content = other.getContent();
		if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
		final java.lang.Object this$createTime = this.getCreateTime();
		final java.lang.Object other$createTime = other.getCreateTime();
		if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) return false;
		return true;
	}

	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof SensitiveWord;
	}

	@java.lang.Override
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final java.lang.Object $enabled = this.getEnabled();
		result = result * PRIME + ($enabled == null ? 43 : $enabled.hashCode());
		final java.lang.Object $creator = this.getCreator();
		result = result * PRIME + ($creator == null ? 43 : $creator.hashCode());
		final java.lang.Object $content = this.getContent();
		result = result * PRIME + ($content == null ? 43 : $content.hashCode());
		final java.lang.Object $createTime = this.getCreateTime();
		result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
		return result;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "SensitiveWord(id=" + this.getId() + ", content=" + this.getContent() + ", enabled=" + this.getEnabled() + ", creator=" + this.getCreator() + ", createTime=" + this.getCreateTime() + ")";
	}
}
