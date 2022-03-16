package com.simon.design.pattern.ab_factory;

import com.simon.design.pattern.ab_factory.buttons.Button;
import com.simon.design.pattern.ab_factory.checkboxes.Checkbox;
import com.simon.design.pattern.ab_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button =  factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
