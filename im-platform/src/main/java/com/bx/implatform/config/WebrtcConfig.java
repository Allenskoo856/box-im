package com.bx.implatform.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "webrtc")
public class WebrtcConfig {
    private Integer maxChannel = 9;
    private List<ICEServer> iceServers = new ArrayList<>();

    public WebrtcConfig() {
    }

    public Integer getMaxChannel() {
        return this.maxChannel;
    }

    public List<ICEServer> getIceServers() {
        return this.iceServers;
    }

    public void setMaxChannel(final Integer maxChannel) {
        this.maxChannel = maxChannel;
    }

    public void setIceServers(final List<ICEServer> iceServers) {
        this.iceServers = iceServers;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof WebrtcConfig)) return false;
        final WebrtcConfig other = (WebrtcConfig) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$maxChannel = this.getMaxChannel();
        final java.lang.Object other$maxChannel = other.getMaxChannel();
        if (this$maxChannel == null ? other$maxChannel != null : !this$maxChannel.equals(other$maxChannel)) return false;
        final java.lang.Object this$iceServers = this.getIceServers();
        final java.lang.Object other$iceServers = other.getIceServers();
        if (this$iceServers == null ? other$iceServers != null : !this$iceServers.equals(other$iceServers)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof WebrtcConfig;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $maxChannel = this.getMaxChannel();
        result = result * PRIME + ($maxChannel == null ? 43 : $maxChannel.hashCode());
        final java.lang.Object $iceServers = this.getIceServers();
        result = result * PRIME + ($iceServers == null ? 43 : $iceServers.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WebrtcConfig(maxChannel=" + this.getMaxChannel() + ", iceServers=" + this.getIceServers() + ")";
    }
}
