/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Sep 20 12:05:13 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PublicDBStreamFeature_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.io.PublicDBStreamFeature"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T/"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.dir", "/Users/kp11/workspace/applications/Artemis-build-ci/Artemis"); 
    java.lang.System.setProperty("user.home", "/Users/kp11"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "kp11"); 
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PublicDBStreamFeature_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.biojava.bio.symbol.EmptySymbolList",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "uk.ac.sanger.artemis.io.StreamQualifier",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.FuzzyRange",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "org.biojava.bio.seq.io.SeqIOListener",
      "org.biojava.utils.ChangeType",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "org.biojava.utils.ChangeListener",
      "uk.ac.sanger.artemis.io.RangeVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.io.LocationLexer$TokenEnumeration",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.seq.Feature$Template",
      "uk.ac.sanger.artemis.io.FeatureTree",
      "org.gmod.schema.sequence.FeatureRelationship",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "org.biojava.bio.seq.io.SequenceBuilderFactory",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "org.biojava.utils.Changeable",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.RootLogger",
      "org.biojava.bio.seq.StrandedFeature$Template",
      "org.biojava.bio.BioError",
      "org.apache.log4j.spi.ErrorHandler",
      "uk.ac.sanger.artemis.io.Sequence",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "org.biojava.bio.symbol.Symbol",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LineGroup",
      "org.apache.log4j.helpers.OptionConverter",
      "org.biojava.bio.symbol.Edit",
      "uk.ac.sanger.artemis.util.InputStreamProgressEvent",
      "uk.ac.sanger.artemis.io.BioJavaFeature",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.LazyQualifierValue",
      "org.apache.log4j.or.ObjectRenderer",
      "org.gmod.schema.cv.CvTerm",
      "org.biojava.bio.seq.Feature",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.io.Feature",
      "org.biojava.bio.Annotation",
      "uk.ac.sanger.artemis.io.LocationLexer",
      "org.biojava.bio.seq.Sequence",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "org.biojava.bio.seq.SequenceIterator",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.util.FastVector",
      "org.biojava.bio.seq.FeatureFilter",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.io.GFF3AttributeBuilder$1",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.GFF3AttributeBuilder",
      "uk.ac.sanger.artemis.io.Range",
      "org.biojava.utils.ChangeEvent",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "org.apache.log4j.or.DefaultRenderer",
      "org.biojava.bio.seq.io.SequenceBuilder",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "org.biojava.bio.EmptyAnnotation",
      "org.gmod.schema.sequence.FeatureProp",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "org.biojava.bio.Annotatable",
      "org.apache.log4j.spi.ThrowableRenderer",
      "org.biojava.bio.symbol.Location",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "org.biojava.bio.symbol.Alphabet",
      "uk.ac.sanger.artemis.io.FeatureComparator",
      "org.biojava.utils.AssertionFailure",
      "org.biojava.bio.seq.FeatureHolder",
      "org.biojava.bio.seq.io.SequenceFormat",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.util.PushBackException",
      "uk.ac.sanger.artemis.io.BioJavaEntry",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "org.biojava.bio.symbol.SymbolList",
      "org.biojava.bio.BioException",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PublicDBStreamFeature_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.StreamQualifier",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.LocationLexer",
      "uk.ac.sanger.artemis.io.LocationLexer$TokenEnumeration",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.io.FuzzyRange",
      "uk.ac.sanger.artemis.util.Document",
      "uk.ac.sanger.artemis.io.BioJavaEntry",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.io.FeatureTree",
      "uk.ac.sanger.artemis.io.FeatureComparator"
    );
  }
}
