package com.bx.imcommon.model;

public class IMHeartbeatInfo {
	public IMHeartbeatInfo() {
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof IMHeartbeatInfo)) return false;
		final IMHeartbeatInfo other = (IMHeartbeatInfo) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		return true;
	}

	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof IMHeartbeatInfo;
	}

	@java.lang.Override
	public int hashCode() {
		final int result = 1;
		return result;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "IMHeartbeatInfo()";
	}
}
