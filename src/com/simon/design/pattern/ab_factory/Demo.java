package com.simon.design.pattern.ab_factory;

import com.simon.design.pattern.ab_factory.factories.GUIFactory;
import com.simon.design.pattern.ab_factory.factories.MacOSFactory;
import com.simon.design.pattern.ab_factory.factories.WindowsFactory;

import java.util.Locale;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
