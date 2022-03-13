package com.simon.design.pattern.decorator;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name, Salary\nJohn Smith, 100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("src/com/simon/design/pattern/decorator/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("src/com/simon/design/pattern/decorator/OutputDemo.txt");
        System.out.println("- Input ---------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded -------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded -------------");
        System.out.println(encoded.readData());
    }
}
