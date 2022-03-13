package com.simon.design.pattern.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result  = data.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < result.length; i++) {
             result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String readData) {
        byte[] result = Base64.getDecoder().decode(readData);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return  new String(result);
    }
}
