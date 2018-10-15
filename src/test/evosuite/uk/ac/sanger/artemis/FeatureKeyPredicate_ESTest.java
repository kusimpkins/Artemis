/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 14:30:31 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeatureKeyPredicate;
import uk.ac.sanger.artemis.io.Key;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FeatureKeyPredicate_ESTest extends FeatureKeyPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      FeatureKeyPredicate featureKeyPredicate0 = new FeatureKeyPredicate(key0);
      Key key1 = mock(Key.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn(key1).when(feature0).getKey();
      boolean boolean0 = featureKeyPredicate0.testPredicate(feature0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FeatureKeyPredicate featureKeyPredicate0 = new FeatureKeyPredicate((Key) null);
      // Undeclared exception!
      try { 
        featureKeyPredicate0.testPredicate((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.FeatureKeyPredicate", e);
      }
  }
}
