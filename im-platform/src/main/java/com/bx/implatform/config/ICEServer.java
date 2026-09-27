package com.bx.implatform.config;

public class ICEServer {
    private String urls;
    private String username;
    private String credential;

    public ICEServer() {
    }

    public String getUrls() {
        return this.urls;
    }

    public String getUsername() {
        return this.username;
    }

    public String getCredential() {
        return this.credential;
    }

    public void setUrls(final String urls) {
        this.urls = urls;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setCredential(final String credential) {
        this.credential = credential;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof ICEServer)) return false;
        final ICEServer other = (ICEServer) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$urls = this.getUrls();
        final java.lang.Object other$urls = other.getUrls();
        if (this$urls == null ? other$urls != null : !this$urls.equals(other$urls)) return false;
        final java.lang.Object this$username = this.getUsername();
        final java.lang.Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final java.lang.Object this$credential = this.getCredential();
        final java.lang.Object other$credential = other.getCredential();
        if (this$credential == null ? other$credential != null : !this$credential.equals(other$credential)) return false;
        return true;
    }

    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof ICEServer;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $urls = this.getUrls();
        result = result * PRIME + ($urls == null ? 43 : $urls.hashCode());
        final java.lang.Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final java.lang.Object $credential = this.getCredential();
        result = result * PRIME + ($credential == null ? 43 : $credential.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ICEServer(urls=" + this.getUrls() + ", username=" + this.getUsername() + ", credential=" + this.getCredential() + ")";
    }
}
