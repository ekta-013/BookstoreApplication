package com.qapitol.main.base;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "Data")
    public static Object [][] getData(){
        return new Object[][]{
                {"EKTAM123","Forgot@1"}

        };
    }
}
