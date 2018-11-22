package org.andestech.learning.rfb18.g2;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


@Test
public class AppTest03
{

    @Test(priority = -100, groups = {"fast","high"})
    public void TestCase07(){

    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    assertTrue( true );
    }


    @Test(groups = {"high"})
    public void TestCase06(){

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( false );
    }

    //@Test(groups = {"slow"}, dataProvider = "dataSet2", dataProviderClass = DataLogic.class)
    @Test(groups = {"slow"}, dataProvider = "getdata")
    public void TestCase08(String name, String sname, String realLogin){

        Assert.assertEquals(realLogin, DataLogic.getLogin(name,sname));
       // System.out.println(DataLogic.getLogin("abc","Petrov"));

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }


    //@DataProvider(name = "dataSet1")
    @DataProvider
    public static Object[][] getdata(){

        return new Object[][]{
                {"Andrei", " Petrov", "APETROV"},
                {" Basil ", " Wolf  ", "BWOLF"},
                {"Vika ", " Ullm", "VULLM"}
        };

    }


}
