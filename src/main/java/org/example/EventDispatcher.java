package org.example;

import java.util.HashMap;
import java.util.Map;

public class EventDispatcher {
    private Map<String, EventListener> listeners = new HashMap<>();

    public void registerListener(String eventType, EventListener listener) {
        listeners.put(eventType, listener);
    }

    public void dispatchEvent(Event event) {
        EventListener listener = listeners.get(event.getEventType());
        if (listener != null) {
            listener.onEvent(event);
        } else {
            System.out.println("No listener for event: " + event.getEventType());
        }
    }
}
