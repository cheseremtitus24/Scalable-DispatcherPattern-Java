package org.example;

//创建具体的事件监听器
public class ConcreteEventListener implements EventListener {
    private String listenerType;

    public ConcreteEventListener(String type) {
        this.listenerType = type;
    }

    @Override
    public void onEvent(Event event) {
        if (event.getEventType().equals(listenerType)) {
            // 处理事件
            System.out.println("Handling event: " + event.getEventType());
            // 可以访问事件的数据
            System.out.println("Event data: " + ((ConcreteEvent) event).getData());
        }
    }
}
