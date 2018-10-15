/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 19:20:05 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JCheckBox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.components.QualifierPanel;
import uk.ac.sanger.artemis.io.BlastStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class QualifierPanel_ESTest extends QualifierPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Key key0 = Key.CDS;
      QualifierVector qualifierVector0 = new QualifierVector();
      BlastStreamFeature blastStreamFeature0 = new BlastStreamFeature(key0, (Location) null, qualifierVector0);
      Feature feature0 = new Feature(blastStreamFeature0);
      QualifierPanel qualifierPanel0 = new QualifierPanel(feature0, (String) null);
      Feature feature1 = qualifierPanel0.getFeature();
      assertSame(feature0, feature1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn((QualifierVector) null).when(feature0).getQualifiers();
      QualifierPanel qualifierPanel0 = null;
      try {
        qualifierPanel0 = new QualifierPanel(feature0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.QualifierPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Key key0 = new Key((String) null);
      QualifierVector qualifierVector0 = new QualifierVector();
      BlastStreamFeature blastStreamFeature0 = new BlastStreamFeature(key0, (Location) null, qualifierVector0);
      Feature feature0 = new Feature(blastStreamFeature0);
      QualifierPanel qualifierPanel0 = new QualifierPanel(feature0, (String) null);
      Hashtable<JCheckBox, Vector<JCheckBox>> hashtable0 = qualifierPanel0.getQualifierCheckBoxes();
      assertTrue(hashtable0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Key key0 = new Key((String) null);
      QualifierVector qualifierVector0 = new QualifierVector();
      Qualifier qualifier0 = new Qualifier((String) null, "");
      qualifierVector0.add(qualifier0);
      BlastStreamFeature blastStreamFeature0 = new BlastStreamFeature(key0, (Location) null, qualifierVector0);
      Feature feature0 = new Feature(blastStreamFeature0);
      QualifierPanel qualifierPanel0 = new QualifierPanel(feature0, (String) null);
      Hashtable<JCheckBox, Vector<JCheckBox>> hashtable0 = qualifierPanel0.getQualifierCheckBoxes();
      assertEquals(1, hashtable0.size());
  }
}
