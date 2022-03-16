package com.simon.design.pattern.ab_factory.factories;

import com.simon.design.pattern.ab_factory.buttons.Button;
import com.simon.design.pattern.ab_factory.buttons.WindowsButton;
import com.simon.design.pattern.ab_factory.checkboxes.Checkbox;
import com.simon.design.pattern.ab_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
