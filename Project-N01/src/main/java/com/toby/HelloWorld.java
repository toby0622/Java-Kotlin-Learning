package com.toby;

public class HelloWorld {
    // psvm + tab = main function template
    public static void main(String[] args) {
        // sout + tab = println function template
        // System.out.println("Hello World!");

        Person p = new Person();
        p.hello();

        // Basic Variable -> No Method (Lower-case Letter)
        int age = 20;
        char c = '我';
        byte b = 120;
        float weight = 80.0f;
        double height = 1.8;
        boolean adult = true;
        boolean enroll = false;

        // Reference Varialbe -> With Method (Capital Letter)
        String name = "Toby";
        Integer age2 = 20;
        Character c2 = '我';
        Byte b2 = 120;
        Float weight2 = 80.0f;
        Double height2 = 1.8;
        Boolean adult2 = true;
        Boolean enroll2 = false;
    }
}
