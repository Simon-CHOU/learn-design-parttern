package com.simon.design.pattern.observer;

import java.io.File;

/**
 * Subscriber
 */
public interface EventListener {
    void update (String eventType, File file);
}
