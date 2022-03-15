package com.simon.design.pattern.observer;

import java.io.File;

public class Editor {
    public EventManager events;//订阅者类不与编辑器类相耦合， 且能在需要时在其他应用中复用。
    private File file;

    public Editor() {
        this.events = new EventManager("open","save");//不改变编辑器代码的情况下添加新的订阅者类型。
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception{
        if(this.file != null){
            events.notify("save", file);
        }else{
            throw new Exception("Please open a file first.");
        }
    }
}
