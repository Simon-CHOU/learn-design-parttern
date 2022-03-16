package com.simon.design.pattern.ab_factory.factories;

import com.simon.design.pattern.ab_factory.buttons.Button;
import com.simon.design.pattern.ab_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
