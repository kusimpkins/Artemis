# This is a GNU Makefile for Artemis

# $Header: //tmp/pathsoft/artemis/Makefile,v 1.4 2004-07-29 10:45:06 tjc Exp $

SHELL=/bin/sh

OPT_FLAGS = -g

JAVAC := javac $(OPT_FLAGS) -target 1.1 -deprecation -J-mx150m $(EXTRA_FLAGS)

REAL_CLASSPATH := CLASSPATH=.:lib/biojava.jar:lib/jobcontrol.jar:lib/jemAlign.jar:

NAMES:= \
	uk/ac/sanger/artemis/OptionChangeListener \
	uk/ac/sanger/artemis/OptionChangeEvent \
	uk/ac/sanger/artemis/Options \
	uk/ac/sanger/artemis/Selection \
	uk/ac/sanger/artemis/components/ArtemisMain \
        uk/ac/sanger/artemis/components/ActMain \
	uk/ac/sanger/artemis/components/Splash \
	uk/ac/sanger/artemis/components/ListDialog \
	uk/ac/sanger/artemis/components/FeatureListFrame \
	uk/ac/sanger/artemis/components/FeatureList \
	uk/ac/sanger/artemis/components/FeatureDisplay \
	uk/ac/sanger/artemis/components/CanvasPanel \
	uk/ac/sanger/artemis/components/EntryGroupDisplay \
	uk/ac/sanger/artemis/components/EntryHeaderEdit \
	uk/ac/sanger/artemis/components/BasePlotGroup \
	uk/ac/sanger/artemis/components/EntryEditVector \
	uk/ac/sanger/artemis/components/EntryEdit \
	uk/ac/sanger/artemis/components/WritableEMBLCorbaEntrySource \
	uk/ac/sanger/artemis/components/DbfetchEntrySource \
	uk/ac/sanger/artemis/components/EMBLCorbaEntrySource \
	uk/ac/sanger/artemis/components/CorbaEntrySource \
	uk/ac/sanger/artemis/components/BioJavaEntrySource \
	uk/ac/sanger/artemis/components/FileDialogEntrySource \
	uk/ac/sanger/artemis/components/EntryActionListener \
	uk/ac/sanger/artemis/components/DisplayComponent \
	uk/ac/sanger/artemis/components/EntryFileDialog \
	uk/ac/sanger/artemis/components/StickyFileChooser \
	uk/ac/sanger/artemis/components/LogReadListener \
	uk/ac/sanger/artemis/components/Selector \
	uk/ac/sanger/artemis/components/Navigator \
	uk/ac/sanger/artemis/components/EntryGroupPanel \
	uk/ac/sanger/artemis/components/FeaturePopup \
	uk/ac/sanger/artemis/components/WriteMenu \
	uk/ac/sanger/artemis/components/SelectMenu \
	uk/ac/sanger/artemis/components/GraphMenu \
	uk/ac/sanger/artemis/components/RunMenu \
	uk/ac/sanger/artemis/components/AddMenu \
	uk/ac/sanger/artemis/components/ViewMenu \
	uk/ac/sanger/artemis/components/GotoMenu \
	uk/ac/sanger/artemis/components/EditMenu \
	uk/ac/sanger/artemis/components/SelectionMenu \
	uk/ac/sanger/artemis/components/SelectionViewer \
	uk/ac/sanger/artemis/components/FeaturePlotGroup \
	uk/ac/sanger/artemis/components/FeaturePlot \
	uk/ac/sanger/artemis/components/FeatureEdit \
	uk/ac/sanger/artemis/components/FeatureViewer \
	uk/ac/sanger/artemis/components/SearchResultViewer \
	uk/ac/sanger/artemis/components/LogViewer \
	uk/ac/sanger/artemis/components/FileViewer \
	uk/ac/sanger/artemis/components/MessageFrame \
	uk/ac/sanger/artemis/components/MessageDialog \
	uk/ac/sanger/artemis/components/YesNoDialog \
	uk/ac/sanger/artemis/components/KeyChooser \
	uk/ac/sanger/artemis/components/KeyChoice \
	uk/ac/sanger/artemis/components/QualifierEditor \
	uk/ac/sanger/artemis/components/QualifierTextArea \
	uk/ac/sanger/artemis/components/QualifierChoice \
	uk/ac/sanger/artemis/components/ChoiceFrame \
	uk/ac/sanger/artemis/components/SelectionInfoDisplay \
	uk/ac/sanger/artemis/components/EntryGroupMenu \
	uk/ac/sanger/artemis/components/EntryGroupInfoDisplay \
	uk/ac/sanger/artemis/components/Utilities \
	uk/ac/sanger/artemis/components/MarkerRangeRequester \
	uk/ac/sanger/artemis/components/MarkerRangeRequesterListener \
	uk/ac/sanger/artemis/components/MarkerRangeRequesterEvent \
	uk/ac/sanger/artemis/components/TextRequester \
	uk/ac/sanger/artemis/components/TextRequesterListener \
	uk/ac/sanger/artemis/components/TextRequesterEvent \
	uk/ac/sanger/artemis/components/TextDialog \
	uk/ac/sanger/artemis/components/BasePlot \
	uk/ac/sanger/artemis/components/ProcessWatcher \
	uk/ac/sanger/artemis/components/ProcessWatcherEvent \
	uk/ac/sanger/artemis/components/ProcessWatcherListener \
	uk/ac/sanger/artemis/components/ExternalProgramOptions \
	uk/ac/sanger/artemis/components/Plot \
	uk/ac/sanger/artemis/components/PlotMouseListener \
	uk/ac/sanger/artemis/components/FeatureAminoAcidViewer \
	uk/ac/sanger/artemis/components/FeatureBaseViewer \
	uk/ac/sanger/artemis/components/SequenceViewer \
	uk/ac/sanger/artemis/components/FeatureInfo \
	uk/ac/sanger/artemis/components/DisplayAdjustmentListener \
	uk/ac/sanger/artemis/components/DisplayAdjustmentEvent \
	uk/ac/sanger/artemis/components/ScoreChanger \
	uk/ac/sanger/artemis/components/ScoreScrollbar \
	uk/ac/sanger/artemis/components/ScoreChangeListener \
	uk/ac/sanger/artemis/components/ScoreChangeEvent \
	uk/ac/sanger/artemis/components/InputStreamProgressDialog \
	uk/ac/sanger/artemis/plot/KarlinSigAlgorithm \
	uk/ac/sanger/artemis/plot/UserDataAlgorithm \
	uk/ac/sanger/artemis/plot/Codon12CorrelationAlgorithm \
	uk/ac/sanger/artemis/plot/ATDeviationAlgorithm \
	uk/ac/sanger/artemis/plot/GCDeviationAlgorithm \
	uk/ac/sanger/artemis/plot/GCFrameAlgorithm \
	uk/ac/sanger/artemis/plot/CodonUsageAlgorithm \
	uk/ac/sanger/artemis/plot/CodonUsageFormatException \
	uk/ac/sanger/artemis/plot/CodonUsageWeight \
	uk/ac/sanger/artemis/plot/CodonWeight \
	uk/ac/sanger/artemis/plot/AGWindowAlgorithm \
	uk/ac/sanger/artemis/plot/GCSDWindowAlgorithm \
	uk/ac/sanger/artemis/plot/GCWindowAlgorithm \
	uk/ac/sanger/artemis/plot/HydrophilicityAlgorithm \
	uk/ac/sanger/artemis/plot/HydroAlgorithm \
	uk/ac/sanger/artemis/plot/HydrophobicityAlgorithm \
	uk/ac/sanger/artemis/plot/CoilFeatureAlgorithm \
	uk/ac/sanger/artemis/plot/FeatureAlgorithm \
	uk/ac/sanger/artemis/plot/BaseAlgorithm \
	uk/ac/sanger/artemis/plot/Algorithm \
	uk/ac/sanger/artemis/Logger \
	uk/ac/sanger/artemis/ExternalProgramListener \
	uk/ac/sanger/artemis/ExternalProgramException \
	uk/ac/sanger/artemis/ExternalProgramVector \
	uk/ac/sanger/artemis/SimpleExternalProgramMonitor \
	uk/ac/sanger/artemis/ProcessMonitor \
	uk/ac/sanger/artemis/TaskMonitor \
	uk/ac/sanger/artemis/ProcessMonitor \
	uk/ac/sanger/artemis/ExternalProgramMonitor \
	uk/ac/sanger/artemis/ExternalProgram \
	uk/ac/sanger/artemis/EntryGroupChangeListener \
	uk/ac/sanger/artemis/EntryGroupChangeEvent \
	uk/ac/sanger/artemis/EntryChangeListener \
	uk/ac/sanger/artemis/EntryChangeEvent \
	uk/ac/sanger/artemis/FilteredEntryGroup \
	uk/ac/sanger/artemis/SimpleEntryGroup \
	uk/ac/sanger/artemis/EntryGroup \
	uk/ac/sanger/artemis/EntryVector \
	uk/ac/sanger/artemis/EntrySourceVector \
	uk/ac/sanger/artemis/EntrySource \
	uk/ac/sanger/artemis/Entry \
	uk/ac/sanger/artemis/LastSegmentException \
	uk/ac/sanger/artemis/FeatureFromVectorPredicate \
	uk/ac/sanger/artemis/FeatureKeyQualifierPredicate \
	uk/ac/sanger/artemis/FeatureKeyPredicate \
	uk/ac/sanger/artemis/FeaturePatternPredicate \
	uk/ac/sanger/artemis/FeaturePredicateConjunction \
	uk/ac/sanger/artemis/FeaturePredicate \
	uk/ac/sanger/artemis/FeaturePredicateVector \
	uk/ac/sanger/artemis/FeatureEnumeration \
	uk/ac/sanger/artemis/FeatureSegmentVector \
	uk/ac/sanger/artemis/FeatureChangeListener \
	uk/ac/sanger/artemis/FeatureChangeEvent \
	uk/ac/sanger/artemis/FeatureVector \
	uk/ac/sanger/artemis/Feature \
	uk/ac/sanger/artemis/FeatureSegment \
	uk/ac/sanger/artemis/ActionController \
	uk/ac/sanger/artemis/ActionVector \
	uk/ac/sanger/artemis/Action \
	uk/ac/sanger/artemis/ChangeListener \
	uk/ac/sanger/artemis/ChangeEventVector \
	uk/ac/sanger/artemis/ChangeEvent \
	uk/ac/sanger/artemis/GotoListener \
	uk/ac/sanger/artemis/GotoEvent \
	uk/ac/sanger/artemis/GotoEventSource \
	uk/ac/sanger/artemis/SimpleGotoEventSource \
	uk/ac/sanger/artemis/SelectionChangeListener \
	uk/ac/sanger/artemis/SelectionChangeEvent \
	uk/ac/sanger/artemis/Selectable \
	uk/ac/sanger/artemis/sequence/NoSequenceException \
	uk/ac/sanger/artemis/sequence/MarkerRangeVector \
	uk/ac/sanger/artemis/sequence/MarkerRange \
	uk/ac/sanger/artemis/sequence/MarkerChangeListener \
	uk/ac/sanger/artemis/sequence/MarkerChangeEvent \
	uk/ac/sanger/artemis/sequence/Marker \
	uk/ac/sanger/artemis/sequence/Strand \
	uk/ac/sanger/artemis/sequence/BasePatternFormatException \
	uk/ac/sanger/artemis/sequence/BasePattern \
	uk/ac/sanger/artemis/sequence/Bases \
	uk/ac/sanger/artemis/sequence/AminoAcidSequence \
	uk/ac/sanger/artemis/sequence/SequenceChangeListener \
	uk/ac/sanger/artemis/sequence/SequenceChangeEvent \
	uk/ac/sanger/artemis/io/BioJavaFeature \
	uk/ac/sanger/artemis/io/BioJavaSequence \
	uk/ac/sanger/artemis/io/BioJavaEntry \
	uk/ac/sanger/artemis/io/GenbankStreamSequence \
	uk/ac/sanger/artemis/io/RWCorbaEntry \
	uk/ac/sanger/artemis/io/CorbaEntry \
	uk/ac/sanger/artemis/io/DocumentEntryFactory \
	uk/ac/sanger/artemis/io/BlastDocumentEntry \
	uk/ac/sanger/artemis/io/MSPcrunchDocumentEntry \
	uk/ac/sanger/artemis/io/GFFDocumentEntry \
	uk/ac/sanger/artemis/io/GenbankDocumentEntry \
	uk/ac/sanger/artemis/io/EmblDocumentEntry \
	uk/ac/sanger/artemis/io/PublicDBDocumentEntry \
	uk/ac/sanger/artemis/io/SimpleDocumentEntry \
	uk/ac/sanger/artemis/io/DocumentEntry \
	uk/ac/sanger/artemis/io/Entry \
	uk/ac/sanger/artemis/io/ReadOnlyEntry \
	uk/ac/sanger/artemis/io/QualifierInfoException \
	uk/ac/sanger/artemis/io/QualifierInfo \
	uk/ac/sanger/artemis/io/QualifierInfoVector \
	uk/ac/sanger/artemis/io/QualifierInfoHash \

CLASSES := $(NAMES:%=%.class)
SOURCES := $(NAMES:%=%.java)

all: idl code

code: $(CLASSES)

topdown: idl
	$(REAL_CLASSPATH) $(JAVAC) uk/ac/sanger/artemis/components/ArtemisMain.java

%.class : %.java
	$(REAL_CLASSPATH) $(JAVAC) $<

idl : type/*.java nsdb/*.java seqdb/*.java

IDL = idlj
IDLCMD = $(IDL) -Icorba

type/*.java : corba/types.idl
	$(IDLCMD) corba/types.idl

nsdb/*.java : corba/nsdb.idl corba/nsdb_write.idl
	$(IDLCMD) corba/nsdb.idl
	$(IDLCMD) corba/nsdb_write.idl

seqdb/*.java : corba/seqdb.idl
	$(IDLCMD) corba/seqdb.idl

doc :
	$(REAL_CLASSPATH) javadoc -J-mx200m -version \
		AppGlobal.java \
		uk.ac.sanger.artemis uk.ac.sanger.artemis.components \
		uk.ac.sanger.artemis.sequence uk.ac.sanger.artemis.plot \
		uk.ac.sanger.artemis.util uk.ac.sanger.artemis.io

manual :
	(cd docs; make)

CLASS_FILES := `find org uk nsdb type seqdb -name '*.class' -print`

OTHER_FILES := `find images/icon.gif META-INF/MANIFEST.MF images/helix.gif images/sanger-centre.gif COPYING README`

dist :
	rm -rf artemis_compiled.tar.gz tar_build
	mkdir tar_build
	mkdir tar_build/artemis
	rm -f artemis_compiled_latest.tar.gz
	tar cf - $(OTHER_FILES) art etc | (cd tar_build/artemis; tar xf -)
	tar cf - uk nsdb type seqdb lib | (cd tar_build/artemis; tar xf -)
	(cd tar_build; tar czvf ../artemis_compiled.tar artemis)

jar : all powmap.jar

powmap.jar : $(CLASSES)
	rm -f powmap.jar
	if [ ! -d org ]; then \
	  for fileJar in lib/*.jar; do \
	    unzip $$fileJar; \
	  done; \
        fi
	(echo $(CLASS_FILES) ; echo $(OTHER_FILES) ; \
	echo etc/options; echo etc/feature_keys; echo etc/qualifier_types) | \
	perl -pne 's/ /\n/g' | \
	zip -u9@ powmap.jar

clean :
	-rm -rf *.html powmap.jar seqdb nsdb type org
	-rm -rf TAGS* *.o
	-find . -name '*.class' -print | xargs rm -f
