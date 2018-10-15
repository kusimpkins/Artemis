/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 08 19:04:25 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import javax.swing.plaf.ColorUIResource;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.xmlgraphics.java2d.DefaultGraphics2D;
import org.apache.xmlgraphics.java2d.GraphicsConfigurationWithoutTransparency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;
import uk.ac.sanger.artemis.components.genebuilder.MapPanel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MapPanel_ESTest extends MapPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultGraphics2D defaultGraphics2D0 = new DefaultGraphics2D(true);
      // Undeclared exception!
      try { 
        MapPanel.drawFeature(defaultGraphics2D0, 0, 8000, 8000, (Color) null, 1154.5106F, true, 0.0F, 8000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlgraphics.java2d.AbstractGraphics2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.scrollbar;
      // Undeclared exception!
      try { 
        MapPanel.drawFeature((Graphics2D) null, 15, 15, 0, systemColor0, (-702.0F), false, (-430.15268F), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.MapPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraphicsConfigurationWithoutTransparency graphicsConfigurationWithoutTransparency0 = new GraphicsConfigurationWithoutTransparency();
      BufferedImage bufferedImage0 = graphicsConfigurationWithoutTransparency0.createCompatibleImage(3, 3, 3);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      MapPanel.drawFeature(sunGraphics2D0, (-1203), 3, 0, sunGraphics2D0.backgroundColor, sunGraphics2D0.foregroundColor, 0, true, 3, 3);
      assertEquals(2, sunGraphics2D0.strokeState);
      assertEquals((-1), sunGraphics2D0.pixel);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel();
      int int0 = mapPanel0.getFontHeight();
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel();
      mapPanel0.setFont((Font) null);
      // Undeclared exception!
      try { 
        mapPanel0.getFontHeight();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.controlShadow;
      // Undeclared exception!
      try { 
        MapPanel.drawFeature((Graphics2D) null, (-363), 8931, (-363), systemColor0, systemColor0, 1.0F, false, 8931, 8931);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.MapPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraphicsConfigurationWithoutTransparency graphicsConfigurationWithoutTransparency0 = new GraphicsConfigurationWithoutTransparency();
      BufferedImage bufferedImage0 = graphicsConfigurationWithoutTransparency0.createCompatibleImage(75, 1, (-1238));
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      SystemColor systemColor0 = SystemColor.infoText;
      // Undeclared exception!
      try { 
        MapPanel.drawFeature(graphics2D0, 0, (-1), 0, systemColor0, ((SunGraphics2D) graphics2D0).foregroundColor, 0, true, (-1.0F), 75);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // negative width
         //
         verifyException("java.awt.BasicStroke", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultGraphics2D defaultGraphics2D0 = new DefaultGraphics2D(true);
      // Undeclared exception!
      try { 
        MapPanel.drawFeature(defaultGraphics2D0, 960, 960, (-2170), (Color) null, 1433.607F, true, 1433.607F, 960);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlgraphics.java2d.AbstractGraphics2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel();
      int int0 = mapPanel0.getViewerBorder();
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MapPanel mapPanel0 = new MapPanel();
      int int0 = mapPanel0.getTranscriptSize();
      assertEquals(75, int0);
  }
}
