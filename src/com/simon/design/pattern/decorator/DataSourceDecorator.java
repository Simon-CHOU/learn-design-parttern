package com.simon.design.pattern.decorator;

public class DataSourceDecorator implements DataSource {
    private DataSource warppee;

    public DataSourceDecorator(DataSource source) {
        this.warppee = source;
    }

    @Override
    public void writeData(String data) {
        warppee.writeData(data);
    }

    @Override
    public String readData() {
        return warppee.readData();
    }
}
