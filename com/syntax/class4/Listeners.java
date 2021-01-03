package com.syntax.class4;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    public void onTestStart(ITestResult result){
        System.out.println("starting test with name "+ result.getName());//returns name of the test method
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("test pass, we are taking screenshot");
    }

    public void onTestFailure(ITestResult result){
        System.out.println("test fail we are taking sc");

    }
    public void onTestSkipped(ITestResult result){
        System.out.println("Finishing test with name "+result.getName());
    }
}
