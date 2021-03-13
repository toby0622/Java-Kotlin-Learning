package com.toby;

public class HelloWorld {
    // psvm + tab = main function template
    public static void main(String[] args) {
        // sout + tab = println function template

        Person p = new Person("Toby", 80.0f, 1.8f);
        p.hello();
        System.out.println(p.bmi());

        int score = 88;
        System.out.println(score > 80 && score < 90);
        System.out.println(score < 80 || score > 90);

        char c = 'A';
        System.out.println(c > 'a');

        // Basic Variable -> No Method (Lower-case Letter)

        /*int age = 20;
        char c = 'T';
        byte b = 120;
        float weight = 80.0f;
        double height = 1.8;
        boolean adult = true;
        boolean enroll = false;*/

        // Reference Varialbe -> With Method (Capital Letter)

        /*String name = "Toby";*/

        // Wrapper Class

        /*Integer age2 = 20;
        Character c2 = 'T';
        Byte b2 = 120;
        Float weight2 = 80.0f;
        Double height2 = 1.8;
        Boolean adult2 = true;
        Boolean enroll2 = false;*/
    }
}
