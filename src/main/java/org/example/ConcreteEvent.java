package org.example;

// 创建具体的事件类
public class ConcreteEvent implements Event {
    private String eventType;
    private Object data;

    public ConcreteEvent(String eventType, Object data) {
        this.eventType = eventType;
        this.data = data;
    }

    @Override
    public String getEventType() {
        return eventType;
    }

    public Object getData() {
        return data;
    }
}
