/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 19:20:38 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.KeyVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class KeyVector_ESTest extends KeyVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      doReturn((-2282), 1108, 0, 0, 0).when(key0).compareTo(any(uk.ac.sanger.artemis.io.Key.class));
      KeyVector keyVector0 = new KeyVector(key0);
      keyVector0.addAll((Collection) keyVector0);
      keyVector0.addAll((Collection) keyVector0);
      keyVector0.mysort();
      assertEquals(4, keyVector0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      KeyVector keyVector0 = new KeyVector(key0);
      UnaryOperator<Object> unaryOperator0 = (UnaryOperator<Object>) mock(UnaryOperator.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(unaryOperator0).apply(any());
      keyVector0.replaceAll(unaryOperator0);
      keyVector0.addAll((Collection) keyVector0);
      // Undeclared exception!
      try { 
        keyVector0.mysort();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.KeyVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      KeyVector keyVector0 = new KeyVector(key0);
      keyVector0.insertElementAfter(keyVector0, keyVector0);
      // Undeclared exception!
      try { 
        keyVector0.mysort();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // uk.ac.sanger.artemis.io.KeyVector cannot be cast to uk.ac.sanger.artemis.io.Key
         //
         verifyException("uk.ac.sanger.artemis.io.KeyVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KeyVector keyVector0 = null;
      try {
        keyVector0 = new KeyVector((Key) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - adding a null object
         //
         verifyException("uk.ac.sanger.artemis.util.FastVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(key0).toString();
      KeyVector keyVector0 = new KeyVector(key0);
      KeyVector keyVector1 = keyVector0.copy();
      assertNotSame(keyVector1, keyVector0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      KeyVector keyVector0 = new KeyVector();
      KeyVector keyVector1 = keyVector0.copy();
      assertNotSame(keyVector1, keyVector0);
  }
}