package com.stalary.pf.push.common;

import lombok.Getter;

public enum PushConstants {
    MESSAGE_CHANNEL("message"),
     CLOSE_CHANNEL("close");

    @Getter
    private final String channel;

    PushConstants(String channel) {
        this.channel = channel;
    }
}
