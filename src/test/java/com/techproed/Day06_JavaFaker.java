package com.techproed;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day06_JavaFaker {

    @Test
    public void javaFakerTest(){
        //        create Faker object
        Faker faker = new Faker();

        String fName=faker.name().firstName();
        String lName=faker.name().lastName();
        System.out.println(fName);
        System.out.println(lName);

        System.out.println(faker.name().fullName());
        System.out.println(faker.name().title());
        System.out.println(faker.address().city());

    }
}
