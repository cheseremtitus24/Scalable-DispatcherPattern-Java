package org.example;

//Dispatcher类，用于注册监听器和分发事件
    import java.util.HashMap;
            import java.util.Map;

//演示整个Dispatcher模式的运作
public class DispatcherDemo {
    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();
        // 创建事件
        Event event1 = new ConcreteEvent("TYPE1", "Data for TYPE1");
        Event event2 = new ConcreteEvent("TYPE2", "Data for TYPE2");
        // 创建监听器
        EventListener listener1 = new ConcreteEventListener("TYPE1");
        EventListener listener2 = new ConcreteEventListener("TYPE2");
        // 注册监听器
        dispatcher.registerListener("TYPE1", listener1);
        dispatcher.registerListener("TYPE2", listener2);
        // 分发事件
        dispatcher.dispatchEvent(event1);
        dispatcher.dispatchEvent(event2);
    }
}
