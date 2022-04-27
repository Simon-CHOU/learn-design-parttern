package com.simon.design.pattern.defaultadapter;

public class Client {

    public static void main(String[] args){
        People people = new People();

        people.addJob(new DefaultJobAdapter() {
            @Override
            public void programmer() {
                System.out.println("Write the code, and the product is forced");
            }
        });
    }

}

class People{

    public void addJob(Job job){

    }
}