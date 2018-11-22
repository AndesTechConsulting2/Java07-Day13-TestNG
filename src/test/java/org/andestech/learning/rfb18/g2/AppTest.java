package org.andestech.learning.rfb18.g2;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class AppTest
{

    @Test(groups = {"slow"})
    @Parameters({"data1","p1"})
    public void TestCase01(double d, double percent){

    System.out.println("d=" +d +", percent="+percent +
                ", Result=" + (percent * d));

    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    assertTrue( true );
    }


    @Test(groups = {"fast"})
    @Parameters({"greets2"})
    public void TestCase02(@Optional("Хай!") String gr){
        System.out.println("Greetings: " + gr);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );
    }


}
