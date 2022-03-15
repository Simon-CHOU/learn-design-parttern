package com.simon.design.pattern.factory;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        System.out.println(System.getProperty("os.name"));
        if(System.getProperty("os.name").equals("Windows 10")){ //check logic
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
