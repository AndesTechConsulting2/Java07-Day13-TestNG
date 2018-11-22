package org.andestech.learning.rfb18.g2;


import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


@Test
public class AppTest02
{

    @Test(priority = -100, groups = {"fast","high"})
    public void TestCase03(){

    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    assertTrue( true );
    }


    @Test(groups = {"high"})
    public void TestCase04(){

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( false );
    }

    //@Test
    public void TestCase05(){

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );
    }


}
