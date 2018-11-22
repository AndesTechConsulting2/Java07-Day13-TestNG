package org.andestech.learning.rfb18.g2;

import org.testng.annotations.DataProvider;

public class DataLogic {

    public static String getLogin(String name, String sname)
    {
       return (name.trim().substring(0,1) + sname.trim()).toUpperCase();

    }



    @DataProvider(name = "dataSet2")
    public static Object[][] getdata(){

        return new Object[][]{
                {"Andrei", " Petrov", "APETROV"},
                {" Basil ", " Wolf  ", "BWOLF"},
                {"Vika ", " Ullm", "VULLM2"},
                {"Peter  ", " TheFirst", "PTEFIRST"}
        };

    }
}
