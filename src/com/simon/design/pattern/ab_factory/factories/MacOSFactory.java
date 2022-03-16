package com.simon.design.pattern.ab_factory.factories;

import com.simon.design.pattern.ab_factory.buttons.Button;
import com.simon.design.pattern.ab_factory.buttons.MacButton;
import com.simon.design.pattern.ab_factory.checkboxes.Checkbox;
import com.simon.design.pattern.ab_factory.checkboxes.MacCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
