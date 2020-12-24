package com.syntax.class1;

import org.testng.annotations.*;

public class Task2 {
    /*
create a class that will have:
before and after class annotation
before and after method annotation
2 methods with test annotation
 */
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I'LL BE LAST");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("print me");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("jehdjkehkfjhe");
    }
    @Test
    public void beforeTest2(){
        System.out.println("print me");
    }
    @Test
    public void afterTest2() {
        System.out.println("jehdjkehkfjhe");
    }


}
