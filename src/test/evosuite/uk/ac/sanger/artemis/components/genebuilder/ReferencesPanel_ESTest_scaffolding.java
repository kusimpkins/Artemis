/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Sep 20 12:51:08 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ReferencesPanel_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReferencesPanel_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.ExternalProgram",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.ChangeListener",
      "org.gmod.schema.dao.SchemaDaoI",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.gmod.schema.dao.SequenceDaoI",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.spi.ErrorHandler",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "org.gmod.schema.dao.GeneralDaoI",
      "uk.ac.sanger.artemis.components.Splash$3",
      "org.gmod.schema.dao.BaseDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "org.apache.log4j.or.ObjectRenderer",
      "org.gmod.schema.dao.CvDaoI",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.components.QualifierTextArea$2",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.Feature",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.components.LogViewer",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.gmod.schema.sequence.Feature",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "org.gmod.schema.utils.Rankable",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.Logger",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "org.apache.log4j.Priority",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.components.Splash"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReferencesPanel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel",
      "uk.ac.sanger.artemis.EntryVector",
      "uk.ac.sanger.artemis.SimpleEntryGroup",
      "uk.ac.sanger.artemis.ActionController",
      "uk.ac.sanger.artemis.ActionVector",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "uk.ac.sanger.artemis.util.Document",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.components.LogViewer",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.LocationLexer",
      "uk.ac.sanger.artemis.io.LocationLexer$TokenEnumeration",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.sequence.MarkerChangeEvent",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.io.FuzzyRange",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry$1",
      "uk.ac.sanger.artemis.Entry$FeatureEnumerator",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.FilteredEntryGroup",
      "uk.ac.sanger.artemis.FilteredEntryGroup$1",
      "uk.ac.sanger.artemis.FilteredEntryGroup$2",
      "uk.ac.sanger.artemis.FilteredEntryGroup$3",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.io.GFFEntryInformation",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.FeatureKeyQualifierPredicate",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "org.biojava.utils.AbstractChangeable",
      "org.biojava.bio.seq.SimpleAssembly",
      "org.biojava.bio.AbstractAnnotation",
      "org.biojava.bio.SimpleAnnotation",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "org.biojava.bio.seq.impl.FeatureImpl$1",
      "org.biojava.bio.seq.SimpleFeatureRealizer$TemplateImpl",
      "org.biojava.bio.seq.impl.FeatureImpl",
      "org.biojava.bio.symbol.AbstractSymbolList",
      "org.biojava.bio.seq.impl.AssembledSymbolList",
      "org.biojava.utils.Unchangeable",
      "org.biojava.bio.symbol.AlphabetManager$GapSymbol",
      "org.biojava.bio.symbol.AlphabetManager$SizeQueen",
      "org.biojava.bio.symbol.IntegerAlphabet",
      "org.biojava.utils.cache.WeakValueHashMap",
      "org.biojava.bio.symbol.DoubleAlphabet",
      "org.biojava.bio.symbol.AbstractSymbol",
      "org.biojava.bio.symbol.SimpleSymbol",
      "org.biojava.bio.symbol.AbstractSimpleBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownGapSymbol",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.EmptyAnnotation",
      "org.biojava.bio.Annotation",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.symbol.Alphabet",
      "org.biojava.utils.ListTools$5",
      "org.biojava.utils.ListTools",
      "org.biojava.utils.SingletonList",
      "org.biojava.utils.ClassTools",
      "org.biojava.utils.stax.SAX2StAXAdaptor",
      "org.biojava.utils.stax.StAXContentHandlerBase",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler",
      "org.biojava.utils.stax.SAX2StAXAdaptor$HandlerBinding",
      "org.biojava.utils.stax.SAX2StAXAdaptor$S2SDelegationManager",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler",
      "org.biojava.bio.SmallAnnotation",
      "org.biojava.utils.lsid.LifeScienceIdentifier",
      "org.biojava.utils.stax.StringElementHandlerBase",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler$1",
      "org.biojava.utils.SmallMap",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAtomicSymbol",
      "org.biojava.bio.symbol.FundamentalAtomicSymbol",
      "org.biojava.utils.ChangeListener$AlwaysVetoListener",
      "org.biojava.utils.ChangeListener$LoggingListener",
      "org.biojava.utils.ChangeListener",
      "org.biojava.utils.ChangeSupport",
      "org.biojava.bio.Annotatable",
      "org.biojava.utils.ChangeType$1",
      "org.biojava.utils.ChangeForwarder",
      "org.biojava.utils.ChangeForwarder$Retyper",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "org.biojava.bio.symbol.SingletonAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$ImmutableWellKnownAlphabetWrapper",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler$1",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler",
      "org.biojava.bio.seq.io.CharacterTokenization",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler$MappingHandler",
      "org.biojava.bio.symbol.SimpleBasisSymbol",
      "org.biojava.bio.seq.io.AlternateTokenization",
      "org.biojava.bio.symbol.AlphabetManager",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownTokenizationWrapper",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "org.biojava.bio.seq.io.SeqIOAdapter",
      "org.biojava.bio.symbol.SimpleSymbolList$SSLIOListener",
      "org.biojava.bio.seq.io.CharacterTokenization$TPStreamParser",
      "org.biojava.bio.seq.DNATools$DNAComplementTranslationTable",
      "org.biojava.bio.symbol.AbstractTranslationTable",
      "org.biojava.bio.symbol.AbstractReversibleTranslationTable",
      "org.biojava.bio.symbol.SimpleReversibleTranslationTable",
      "org.biojava.bio.seq.RNATools$RNAComplementTranslationTable",
      "org.biojava.bio.symbol.SimpleCrossProductAlphabet",
      "org.biojava.utils.ListTools$Triplet",
      "org.biojava.bio.symbol.SimpleAtomicSymbol",
      "org.biojava.utils.cache.KeyedWeakReference",
      "org.biojava.bio.seq.io.WordTokenization",
      "org.biojava.bio.seq.io.NameTokenization",
      "org.biojava.bio.symbol.AbstractManyToOneTranslationTable",
      "org.biojava.bio.symbol.SimpleManyToOneTranslationTable",
      "org.biojava.bio.symbol.SimpleGeneticCodeTable",
      "org.biojava.bio.symbol.AbstractSymbolList$ListView",
      "org.biojava.bio.BioException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.biojava.bio.BioError",
      "org.biojava.bio.seq.RNATools",
      "org.biojava.bio.seq.DNATools",
      "uk.ac.sanger.artemis.FeatureKeyPredicate",
      "uk.ac.sanger.artemis.io.StreamQualifier",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.FeaturePatternPredicate",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.FeaturePredicateVector",
      "uk.ac.sanger.artemis.FeatureFromVectorPredicate",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.SimpleGotoEventSource",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "uk.ac.sanger.artemis.plot.FeatureAlgorithm",
      "uk.ac.sanger.artemis.plot.CoilFeatureAlgorithm",
      "uk.ac.sanger.artemis.SimpleEntryGroup$FeatureEnumerator",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "uk.ac.sanger.artemis.io.GenbankDocumentEntry",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "org.biojava.bio.seq.NewSimpleAssembly",
      "org.biojava.bio.seq.impl.NewAssembledSymbolList",
      "org.biojava.bio.seq.Feature$ByLocationComparator",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.io.MSPcrunchDocumentEntry",
      "uk.ac.sanger.artemis.io.MSPcrunchEntryInformation",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.io.BlastEntryInformation",
      "uk.ac.sanger.artemis.FilteredEntryGroup$FeatureEnumerator",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.util.StringVector$1",
      "uk.ac.sanger.artemis.io.BlastDocumentEntry",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.io.FeatureTree",
      "uk.ac.sanger.artemis.io.FeatureComparator",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.sequence.MarkerInternal",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "uk.ac.sanger.artemis.OptionChangeEvent",
      "org.biojava.bio.seq.Feature$Template",
      "org.biojava.bio.seq.StrandedFeature$Template",
      "org.biojava.bio.seq.RemoteFeature$Template",
      "org.biojava.bio.symbol.EmptyLocation",
      "org.biojava.bio.symbol.AbstractLocation",
      "org.biojava.bio.symbol.AbstractRangeLocation",
      "org.biojava.bio.symbol.RangeLocation",
      "org.biojava.bio.symbol.LocationComparator",
      "org.biojava.bio.symbol.Location",
      "org.biojava.bio.seq.impl.SimpleFeature",
      "org.biojava.bio.seq.impl.SimpleStrandedFeature",
      "org.biojava.bio.seq.impl.SimpleRemoteFeature",
      "org.biojava.bio.seq.AbstractFeatureHolder",
      "org.biojava.bio.seq.MergeFeatureHolder",
      "org.biojava.utils.ChangeVetoException",
      "uk.ac.sanger.artemis.io.ReadEvent",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.biojava.bio.seq.impl.ViewSequence",
      "org.biojava.bio.seq.CircularView",
      "uk.ac.sanger.artemis.io.StreamSequenceFactory",
      "uk.ac.sanger.artemis.sequence.BasePattern",
      "uk.ac.sanger.artemis.components.SelectionViewer",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "org.biojava.bio.seq.io.SequenceBuilderBase",
      "org.biojava.bio.seq.io.SimpleAssemblyBuilder$SSBFactory",
      "org.biojava.bio.seq.io.SimpleAssemblyBuilder",
      "org.biojava.bio.seq.ComponentFeature$Template",
      "uk.ac.sanger.artemis.components.LogReadListener",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry",
      "uk.ac.sanger.artemis.util.CacheHashMap",
      "uk.ac.sanger.artemis.util.TextDocument",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "org.apache.log4j.helpers.ThreadLocalMap",
      "org.apache.log4j.MDC",
      "uk.ac.sanger.artemis.io.DocumentEntryFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "org.biojava.bio.seq.FramedFeature$Template",
      "org.biojava.bio.seq.impl.SimpleFramedFeature",
      "uk.ac.sanger.artemis.io.BioJavaSequence",
      "uk.ac.sanger.artemis.io.ReadOnlyEmblStreamFeature",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "htsjdk.variant.vcf.VCFHeader",
      "htsjdk.tribble.util.ParsingUtils",
      "org.biojava.bio.seq.homol.HomologyFeature$Template",
      "uk.ac.sanger.artemis.io.DatabaseInferredFeature",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay$1",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.components.EntryGroupPanel$1",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "uk.ac.sanger.artemis.components.FeatureDisplay$10",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.util.ZipFileDocument",
      "org.biojava.bio.seq.io.GenbankFormat",
      "org.biojava.bio.seq.io.GenbankXmlFormat",
      "uk.ac.sanger.artemis.io.BioJavaEntry",
      "uk.ac.sanger.artemis.util.URLDocument",
      "org.biojava.bio.seq.homol.SimilarityPairFeature$Template",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.io.IndexFastaStream",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.gmod.schema.sequence.FeatureLoc",
      "uk.ac.sanger.artemis.components.genebuilder.GeneUtils",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "org.biojava.bio.seq.io.EmblLikeFormat",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "uk.ac.sanger.artemis.chado.DbSqlConfig",
      "com.ibatis.common.resources.Resources",
      "com.ibatis.sqlmap.client.SqlMapClientBuilder",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser",
      "com.ibatis.common.xml.NodeletParser",
      "com.ibatis.sqlmap.engine.builder.xml.XmlParserState",
      "com.ibatis.common.beans.BaseProbe",
      "com.ibatis.common.beans.DomProbe",
      "com.ibatis.common.beans.ComplexBeanProbe",
      "com.ibatis.common.beans.GenericProbe",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "com.ibatis.sqlmap.engine.scope.ErrorContext",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory$1",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "com.ibatis.sqlmap.engine.type.BaseTypeHandler",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "com.ibatis.sqlmap.engine.type.BooleanTypeHandler",
      "com.ibatis.sqlmap.engine.type.ByteTypeHandler",
      "com.ibatis.sqlmap.engine.type.ShortTypeHandler",
      "com.ibatis.sqlmap.engine.type.IntegerTypeHandler",
      "com.ibatis.sqlmap.engine.type.LongTypeHandler",
      "com.ibatis.sqlmap.engine.type.FloatTypeHandler",
      "com.ibatis.sqlmap.engine.type.DoubleTypeHandler",
      "com.ibatis.sqlmap.engine.type.StringTypeHandler",
      "com.ibatis.sqlmap.engine.type.CustomTypeHandler",
      "com.ibatis.sqlmap.engine.type.ClobTypeHandlerCallback",
      "com.ibatis.sqlmap.engine.type.BigDecimalTypeHandler",
      "com.ibatis.sqlmap.engine.type.ByteArrayTypeHandler",
      "com.ibatis.sqlmap.engine.type.BlobTypeHandlerCallback",
      "com.ibatis.sqlmap.engine.type.ObjectTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "com.ibatis.sqlmap.engine.exchange.DataExchangeFactory",
      "com.ibatis.sqlmap.engine.exchange.BaseDataExchange",
      "com.ibatis.sqlmap.engine.exchange.DomDataExchange",
      "com.ibatis.sqlmap.engine.exchange.ListDataExchange",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "com.ibatis.sqlmap.engine.exchange.PrimitiveDataExchange",
      "com.ibatis.common.logging.LogFactory",
      "com.ibatis.common.logging.jakarta.JakartaCommonsLoggingImpl",
      "org.apache.commons.logging.impl.Log4JLogger",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapClasspathEntityResolver",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$1",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$2",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$3",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$4",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$5",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$6",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$7",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$8",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$9",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$10",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$11",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapConfigParser$12",
      "com.ibatis.common.xml.NodeletParser$1",
      "com.ibatis.common.xml.NodeletParser$Path",
      "com.ibatis.common.xml.NodeletUtils",
      "com.ibatis.common.beans.ClassInfo",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlanFactory",
      "com.ibatis.common.beans.MethodInvoker",
      "com.ibatis.common.beans.SetFieldInvoker",
      "com.ibatis.common.beans.GetFieldInvoker",
      "com.ibatis.sqlmap.engine.datasource.SimpleDataSourceFactory",
      "com.ibatis.common.jdbc.SimpleDataSource",
      "org.postgresql.util.SharedTimer",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.postgresql.Driver",
      "com.ibatis.sqlmap.engine.transaction.BaseTransactionConfig",
      "com.ibatis.sqlmap.engine.transaction.jdbc.JdbcTransactionConfig",
      "com.ibatis.sqlmap.engine.transaction.TransactionManager",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser",
      "com.ibatis.sqlmap.engine.builder.xml.SqlStatementParser",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$1",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$2",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$3",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$4",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$5",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$6",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$7",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$8",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$9",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$10",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$11",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$12",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$13",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$14",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$15",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$16",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$17",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$18",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$19",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$20",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$21",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapParser$22",
      "com.ibatis.sqlmap.engine.config.ResultMapConfig",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMap",
      "com.ibatis.sqlmap.engine.exchange.JavaBeanDataExchange",
      "com.ibatis.sqlmap.engine.accessplan.BaseAccessPlan",
      "com.ibatis.sqlmap.engine.accessplan.EnhancedPropertyAccessPlan",
      "net.sf.cglib.core.CollectionUtils",
      "net.sf.cglib.core.TypeUtils",
      "net.sf.cglib.core.Signature",
      "net.sf.cglib.asm.Type",
      "net.sf.cglib.core.KeyFactory$1",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.AbstractClassGenerator",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "net.sf.cglib.core.KeyFactory$Generator",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "net.sf.cglib.asm.ClassWriter",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.asm.ByteVector",
      "net.sf.cglib.asm.Item",
      "net.sf.cglib.asm.ClassAdapter",
      "net.sf.cglib.core.ClassEmitter",
      "net.sf.cglib.core.ReflectUtils$1",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "net.sf.cglib.core.ClassInfo",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "net.sf.cglib.core.EmitUtils",
      "net.sf.cglib.asm.MethodWriter",
      "net.sf.cglib.asm.Label",
      "net.sf.cglib.core.Constants",
      "net.sf.cglib.asm.MethodAdapter",
      "net.sf.cglib.core.LocalVariablesSorter",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.core.LocalVariablesSorter$State",
      "net.sf.cglib.core.MethodInfo",
      "net.sf.cglib.core.CodeEmitter$State",
      "net.sf.cglib.asm.Frame",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "net.sf.cglib.asm.FieldWriter",
      "net.sf.cglib.asm.Edge",
      "net.sf.cglib.core.EmitUtils$7",
      "net.sf.cglib.core.Local",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "net.sf.cglib.asm.ClassReader",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.core.ClassNameReader$1",
      "net.sf.cglib.beans.BulkBean",
      "net.sf.cglib.beans.BulkBean$Generator",
      "net.sf.cglib.beans.BulkBeanEmitter",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMapping",
      "com.ibatis.sqlmap.engine.type.JdbcTypeRegistry",
      "net.sf.cglib.core.ReflectUtils$3",
      "net.sf.cglib.core.ReflectUtils$4",
      "net.sf.cglib.core.Block",
      "net.sf.cglib.asm.Handler",
      "com.ibatis.sqlmap.engine.mapping.statement.MappedStatement",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectStatement",
      "com.ibatis.sqlmap.engine.mapping.parameter.InlineParameterMapParser",
      "com.ibatis.sqlmap.engine.builder.xml.XMLSqlSource",
      "com.ibatis.sqlmap.engine.config.MappedStatementConfig",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.DynamicSql",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlText",
      "com.ibatis.sqlmap.engine.mapping.sql.raw.RawSql",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap",
      "com.ibatis.sqlmap.engine.mapping.sql.simple.SimpleDynamicSql",
      "com.ibatis.sqlmap.engine.cache.CacheKey",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMapping",
      "com.ibatis.sqlmap.engine.mapping.sql.stat.StaticSql",
      "com.ibatis.sqlmap.engine.cache.lru.LruCacheController",
      "com.ibatis.sqlmap.engine.config.CacheModelConfig",
      "com.ibatis.sqlmap.engine.cache.CacheModel",
      "com.ibatis.sqlmap.engine.accessplan.ComplexAccessPlan",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.BaseTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.ConditionalTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEmptyTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEqualTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterEqualTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterThanTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessEqualTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessThanTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEmptyTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEqualTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNullTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotNullTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsParameterPresentTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotParameterPresentTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsPropertyAvailableTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotPropertyAvailableTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.DynamicTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandlerFactory",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTag",
      "com.ibatis.sqlmap.engine.mapping.statement.CachingStatement",
      "com.ibatis.sqlmap.engine.mapping.statement.InsertStatement",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "com.ibatis.sqlmap.engine.config.ParameterMapConfig",
      "com.ibatis.common.beans.ProbeException",
      "net.sf.cglib.beans.BulkBeanException",
      "com.ibatis.sqlmap.engine.mapping.result.AutoResultMap",
      "com.ibatis.sqlmap.engine.mapping.statement.UpdateStatement",
      "com.ibatis.sqlmap.engine.mapping.statement.DeleteStatement",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectKeyStatement",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "com.ibatis.sqlmap.engine.impl.SqlMapSessionImpl",
      "com.ibatis.sqlmap.engine.scope.SessionScope",
      "com.ibatis.sqlmap.engine.transaction.TransactionState",
      "com.ibatis.sqlmap.engine.transaction.jdbc.JdbcTransaction",
      "com.ibatis.sqlmap.engine.transaction.IsolationLevel",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder",
      "com.ibatis.common.xml.NodeletException",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.j2ssh.FileTransferProgressMonitor",
      "org.biojava.bio.seq.io.FastaFormat",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.io.BioJavaFeature",
      "org.biojava.bio.seq.io.GenpeptFormat",
      "org.biojava.bio.seq.impl.SimpleHomologyFeature",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox$ComboBoxRenderer",
      "uk.ac.sanger.artemis.components.genebuilder.AutoCompleteComboDocument",
      "uk.ac.sanger.artemis.components.genebuilder.AutoCompleteComboDocument$1",
      "uk.ac.sanger.artemis.components.genebuilder.AutoCompleteComboDocument$2",
      "uk.ac.sanger.artemis.components.genebuilder.AutoCompleteComboDocument$3",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox$ComboPopupMenuLister",
      "org.biojava.bio.symbol.PackedSymbolList",
      "org.emboss.jemboss.gui.Browser",
      "org.biojava.bio.seq.io.GAMEFormat",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot"
    );
  }
}
