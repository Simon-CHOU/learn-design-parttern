package com.simon.design.pattern.singleton.headfirstch5;

public class ChocolateBoilerSingleton {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoilerSingleton uniqueInstance;
//    private static ChocolateBoilerSingleton uniqueInstance= new ChocolateBoilerSingleton();

    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }
//    public static ChocolateBoilerSingleton getInstance() {
//        return uniqueInstance;
//    }

//    public static ChocolateBoilerSingleton getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new ChocolateBoilerSingleton();
//        }
//        return uniqueInstance;
//    }
    public static ChocolateBoilerSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoilerSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoilerSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fi ll the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
