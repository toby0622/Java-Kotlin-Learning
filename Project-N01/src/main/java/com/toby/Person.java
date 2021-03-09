package com.toby;

public class Person {
    String name;
    float height;
    float weight;

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("Hello World!");
    }
}
