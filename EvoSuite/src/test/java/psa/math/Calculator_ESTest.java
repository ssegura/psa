/*
 * This file was automatically generated by EvoSuite
 * Tue May 07 08:16:04 GMT 2019
 */

package psa.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import psa.math.Calculator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Calculator_ESTest extends Calculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.subtract((-1), (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.subtract((-1815), 0);
      assertEquals((-1815), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.multiply((-11), (-11));
      assertEquals(121, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.multiply(1386, (-1));
      assertEquals((-1386), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.divide(152, 5127);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.divide(2564, (-62));
      assertEquals((-41), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.add(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.add((-1), 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      // Undeclared exception!
      try { 
        calculator0.divide(3247, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("psa.math.Calculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.multiply(5127, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.subtract(5128, 1);
      assertEquals(5127, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.divide(5128, 5128);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Calculator calculator0 = new Calculator();
      int int0 = calculator0.add(2564, 2564);
      assertEquals(5128, int0);
  }
}
