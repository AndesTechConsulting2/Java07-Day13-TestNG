package org.andestech.learning.rfb18.g2;

import org.testng.xml.*;
import org.testng.*;

import java.util.Arrays;


public class TestNGRunner {

    public static void main(String[] args)
    {
       TestNG testNG = new TestNG();
       //testNG.setTestClasses(new Class[]{AppTest02.class});

      XmlSuite s1 = new XmlSuite();
      s1.setName("Virtual_Suite");



      XmlTest t1 = new XmlTest(s1);
      t1.setName("virt_test");

      XmlClass c1 = new XmlClass();
      c1.setClass(org.andestech.learning.rfb18.g2.AppTest03.class);

      t1.setXmlClasses(
              Arrays.asList(
                      new XmlClass[]{c1}
              )
      );


      s1.setTests(Arrays.asList(
           new XmlTest[]{t1}

      ));


      testNG.setXmlSuites(Arrays.asList(
           new XmlSuite[] {s1}

      ));




//       testNG.setTestSuites(Arrays.asList(
//              new String[]{"testng_fast_suite.xml",
//                           "testng_slow_suite.xml" }
//       ));
        TestListenerAdapter tla = new TestListenerAdapter();
        testNG.addListener(tla);

       testNG.run();

       if(testNG.hasFailure()) System.out.println("Test Failed!!");
    }

}
