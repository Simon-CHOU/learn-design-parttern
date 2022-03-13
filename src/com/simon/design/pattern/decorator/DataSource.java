package com.simon.design.pattern.decorator;

/**
 * https://refactoringguru.cn/design-patterns/decorator/java/example
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
