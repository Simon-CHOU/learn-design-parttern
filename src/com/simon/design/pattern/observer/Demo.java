package com.simon.design.pattern.observer;

/**
 * 每当 编辑器 （Editor）对象改变时，它都会通知其订阅者。邮件通知监听器（Email Notification Listener）
 * 和 日志开启监听器（Log Open Listener）都将通过执行其基本行为来对这些通知做出反应。
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor =new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@exmaple.com"));
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
