/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:14:25 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.components.SelectionViewer;
import uk.ac.sanger.artemis.util.StringVector;
import java.awt.HeadlessException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class SelectionViewer_ESTest extends SelectionViewer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringVector stringVector0 = SelectionViewer.getBaseSummary("oepBw#ph(`.uP6v(|");
      assertNotNull(stringVector0);
      assertEquals("[# content: 1  (5.55%), ( content: 2  (11.11%), . content: 1  (5.55%), 6 content: 1  (5.55%), B content: 1  (5.55%), P content: 1  (5.55%), ` content: 1  (5.55%), E content: 1  (5.55%), H content: 1  (5.55%), O content: 1  (5.55%), P content: 2  (11.11%), U content: 1  (5.55%), V content: 1  (5.55%), W content: 1  (5.55%), | content: 1  (5.55%),  content: 1  (5.55%), , GC percentage: 0.0]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringVector stringVector0 = SelectionViewer.getBaseSummary(",L3kf`dqtG.#");
      assertEquals("[# content: 1  (7.69%), , content: 1  (7.69%), . content: 1  (7.69%), 3 content: 1  (7.69%), G content: 1  (7.69%), L content: 1  (7.69%), ` content: 1  (7.69%), D content: 1  (7.69%), F content: 1  (7.69%), K content: 1  (7.69%), Q content: 1  (7.69%), T content: 1  (7.69%),  content: 1  (7.69%), , GC percentage: 0.0, GC percentage of non-ambiguous bases: 0.0]", stringVector0.toString());
      assertNotNull(stringVector0);
      assertEquals(16, stringVector0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringVector stringVector0 = SelectionViewer.getBaseSummary("");
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringVector stringVector0 = SelectionViewer.getBaseSummary("c");
      assertEquals("[C content: 1  (100.0%), (no ambiguous bases), , GC percentage: 100.0]", stringVector0.toString());
      assertNotNull(stringVector0);
      assertEquals(10, stringVector0.capacity());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringVector stringVector0 = SelectionViewer.getBaseSummary((String) null);
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EntryGroup entryGroup0 = mock(EntryGroup.class, new ViolatedAssumptionAnswer());
      SelectionViewer selectionViewer0 = null;
      try {
        selectionViewer0 = new SelectionViewer((Selection) null, entryGroup0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
        
      }
  }
}
