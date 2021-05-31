package com.techproed;

import org.junit.*;

public class Day04_FirstJunitClass {
    //    We no longer need MAIN METHOD
    //    @Test creates a test case.
    //    @Ignore skips test case
    // setUp -> tearDown -> test1 -> test2(SKIPPED) -> test3
    //    @After runs after EACH METHOD
    //    @Before runs before EACH METHOD
    @Before
    public void setUp(){
        System.out.println("@Before This should run before each method");
    }



    @Test
    public void test1(){
        System.out.println("TestCase 1");

    }


    @Test
    public void test2(){
        System.out.println("TestCase 2");

    }



    @Test
    public void test3(){
        System.out.println("TestCase 3");
    }



    @After
    public void tearDown(){
        System.out.println("@After This should run after each method");
    }
    //ASSERTION: iF EXPECTED =ACTUAL
    //assertion()
    @Test
    public void assertion(){
        //1.Assert.assertTrue()
        //2.Assert.assertFalse()
        Assert.assertTrue(3==3);
        Assert.assertFalse(3==4);
        Assert.assertTrue("junit".contains("j"));

        Assert.assertEquals("junit","j");






    }




}
