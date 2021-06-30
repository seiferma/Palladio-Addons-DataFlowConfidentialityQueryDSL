/*
 * generated by Xtext 2.25.0
 */
package org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.serializer;

import com.google.inject.Inject;
import de.sebinside.dcp.dsl.dSL.AbstractElement;
import de.sebinside.dcp.dsl.dSL.AttributeClassSelector;
import de.sebinside.dcp.dsl.dSL.AttributeSelector;
import de.sebinside.dcp.dsl.dSL.CharacteristicClass;
import de.sebinside.dcp.dsl.dSL.CharacteristicReference;
import de.sebinside.dcp.dsl.dSL.CharacteristicSet;
import de.sebinside.dcp.dsl.dSL.CharacteristicSetReference;
import de.sebinside.dcp.dsl.dSL.CharacteristicType;
import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector;
import de.sebinside.dcp.dsl.dSL.CharacteristicVariable;
import de.sebinside.dcp.dsl.dSL.Condition;
import de.sebinside.dcp.dsl.dSL.Constraint;
import de.sebinside.dcp.dsl.dSL.CreateSetOperation;
import de.sebinside.dcp.dsl.dSL.DSLPackage;
import de.sebinside.dcp.dsl.dSL.ElementOfOperation;
import de.sebinside.dcp.dsl.dSL.EmptySetOperation;
import de.sebinside.dcp.dsl.dSL.Include;
import de.sebinside.dcp.dsl.dSL.IntersectionOperation;
import de.sebinside.dcp.dsl.dSL.LogicalAndOperation;
import de.sebinside.dcp.dsl.dSL.LogicalNegationOperation;
import de.sebinside.dcp.dsl.dSL.LogicalOrOperation;
import de.sebinside.dcp.dsl.dSL.Rule;
import de.sebinside.dcp.dsl.dSL.Statement;
import de.sebinside.dcp.dsl.dSL.StatementModality;
import de.sebinside.dcp.dsl.dSL.StatementType;
import de.sebinside.dcp.dsl.dSL.SubtractOperation;
import de.sebinside.dcp.dsl.dSL.UnionOperation;
import de.sebinside.dcp.dsl.dSL.VariableEqualityOperation;
import de.sebinside.dcp.dsl.dSL.VariableInequalityOperation;
import de.sebinside.dcp.dsl.serializer.DSLSemanticSequencer;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.Model;
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.NodeIdentitiySelector;
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.PCMDFDConstraintLanguagePackage;
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.PropertyClassSelector;
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.PropertySelector;
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.pCMDFDConstraintLanguage.TargetModelTypeDef;
import org.palladiosimulator.dataflow.confidentiality.dcp.dsl.pcm.services.PCMDFDConstraintLanguageGrammarAccess;

@SuppressWarnings("all")
public class PCMDFDConstraintLanguageSemanticSequencer extends DSLSemanticSequencer {

	@Inject
	private PCMDFDConstraintLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DSLPackage.ABSTRACT_ELEMENT:
				sequence_AbstractElement(context, (AbstractElement) semanticObject); 
				return; 
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR:
				sequence_AttributeClassSelector(context, (AttributeClassSelector) semanticObject); 
				return; 
			case DSLPackage.ATTRIBUTE_SELECTOR:
				sequence_AttributeSelector(context, (AttributeSelector) semanticObject); 
				return; 
			case DSLPackage.CHARACTERISTIC_CLASS:
				sequence_CharacteristicClass(context, (CharacteristicClass) semanticObject); 
				return; 
			case DSLPackage.CHARACTERISTIC_REFERENCE:
				sequence_CharacteristicReference(context, (CharacteristicReference) semanticObject); 
				return; 
			case DSLPackage.CHARACTERISTIC_SET:
				sequence_CharacteristicSet(context, (CharacteristicSet) semanticObject); 
				return; 
			case DSLPackage.CHARACTERISTIC_SET_REFERENCE:
				sequence_CharacteristicSetReference(context, (CharacteristicSetReference) semanticObject); 
				return; 
			case DSLPackage.CHARACTERISTIC_TYPE:
				sequence_CharacteristicType(context, (CharacteristicType) semanticObject); 
				return; 
			case DSLPackage.CHARACTERISTIC_TYPE_SELECTOR:
				sequence_CharacteristicTypeSelector(context, (CharacteristicTypeSelector) semanticObject); 
				return; 
			case DSLPackage.CHARACTERISTIC_VARIABLE:
				sequence_CharacteristicVariable(context, (CharacteristicVariable) semanticObject); 
				return; 
			case DSLPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case DSLPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case DSLPackage.CREATE_SET_OPERATION:
				sequence_CreateSetOperation(context, (CreateSetOperation) semanticObject); 
				return; 
			case DSLPackage.ELEMENT_OF_OPERATION:
				sequence_ElementOfOperation(context, (ElementOfOperation) semanticObject); 
				return; 
			case DSLPackage.EMPTY_SET_OPERATION:
				sequence_EmptySetOperation(context, (EmptySetOperation) semanticObject); 
				return; 
			case DSLPackage.INCLUDE:
				sequence_Include(context, (Include) semanticObject); 
				return; 
			case DSLPackage.INTERSECTION_OPERATION:
				sequence_IntersectionOperation(context, (IntersectionOperation) semanticObject); 
				return; 
			case DSLPackage.LOGICAL_AND_OPERATION:
				sequence_LogicalAndOperation(context, (LogicalAndOperation) semanticObject); 
				return; 
			case DSLPackage.LOGICAL_NEGATION_OPERATION:
				sequence_LogicalNegationOperation(context, (LogicalNegationOperation) semanticObject); 
				return; 
			case DSLPackage.LOGICAL_OR_OPERATION:
				sequence_LogicalOrOperation(context, (LogicalOrOperation) semanticObject); 
				return; 
			case DSLPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case DSLPackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case DSLPackage.STATEMENT_MODALITY:
				sequence_StatementModality(context, (StatementModality) semanticObject); 
				return; 
			case DSLPackage.STATEMENT_TYPE:
				sequence_StatementType(context, (StatementType) semanticObject); 
				return; 
			case DSLPackage.SUBTRACT_OPERATION:
				sequence_SubtractOperation(context, (SubtractOperation) semanticObject); 
				return; 
			case DSLPackage.UNION_OPERATION:
				sequence_UnionOperation(context, (UnionOperation) semanticObject); 
				return; 
			case DSLPackage.VARIABLE_EQUALITY_OPERATION:
				sequence_VariableEqualityOperation(context, (VariableEqualityOperation) semanticObject); 
				return; 
			case DSLPackage.VARIABLE_INEQUALITY_OPERATION:
				sequence_VariableInequalityOperation(context, (VariableInequalityOperation) semanticObject); 
				return; 
			}
		else if (epackage == PCMDFDConstraintLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PCMDFDConstraintLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case PCMDFDConstraintLanguagePackage.NODE_IDENTITIY_SELECTOR:
				sequence_NodeIdentitiySelector(context, (NodeIdentitiySelector) semanticObject); 
				return; 
			case PCMDFDConstraintLanguagePackage.PROPERTY_CLASS_SELECTOR:
				sequence_PropertyClassSelector(context, (PropertyClassSelector) semanticObject); 
				return; 
			case PCMDFDConstraintLanguagePackage.PROPERTY_SELECTOR:
				sequence_PropertySelector(context, (PropertySelector) semanticObject); 
				return; 
			case PCMDFDConstraintLanguagePackage.TARGET_MODEL_TYPE_DEF:
				sequence_TargetModelTypeDef(context, (TargetModelTypeDef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     ((targetModelType=TargetModelTypeDef elements+=AbstractElement+) | elements+=AbstractElement+)?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NodeIdentitiySelector returns NodeIdentitiySelector
	 *     DestinationSelector returns NodeIdentitiySelector
	 *
	 * Constraint:
	 *     (
	 *         name=STRING | 
	 *         (assembly=[AssemblyContext|ID] component=[BasicComponent|ID]) | 
	 *         action=[AbstractAction|ID] | 
	 *         (assembly=[AssemblyContext|ID] component=[BasicComponent|ID] signature=[OperationSignature|ID]) | 
	 *         userAction=[EntryLevelSystemCall|ID] | 
	 *         (assembly=[AssemblyContext|ID] store=[OperationalDataStoreComponent|ID])
	 *     )
	 */
	protected void sequence_NodeIdentitiySelector(ISerializationContext context, NodeIdentitiySelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyClassSelector returns PropertyClassSelector
	 *     CharacteristicClassSelector returns PropertyClassSelector
	 *     DestinationSelector returns PropertyClassSelector
	 *
	 * Constraint:
	 *     ref=[CharacteristicClass|ID]
	 */
	protected void sequence_PropertyClassSelector(ISerializationContext context, PropertyClassSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLPackage.Literals.CHARACTERISTIC_CLASS_SELECTOR__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.CHARACTERISTIC_CLASS_SELECTOR__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyClassSelectorAccess().getRefCharacteristicClassIDTerminalRuleCall_1_0_1(), semanticObject.eGet(DSLPackage.Literals.CHARACTERISTIC_CLASS_SELECTOR__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertySelector returns PropertySelector
	 *     CharacteristicSelector returns PropertySelector
	 *     DestinationSelector returns PropertySelector
	 *
	 * Constraint:
	 *     ref=CharacteristicTypeSelector
	 */
	protected void sequence_PropertySelector(ISerializationContext context, PropertySelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLPackage.Literals.CHARACTERISTIC_SELECTOR__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.CHARACTERISTIC_SELECTOR__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertySelectorAccess().getRefCharacteristicTypeSelectorParserRuleCall_1_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TargetModelTypeDef returns TargetModelTypeDef
	 *
	 * Constraint:
	 *     (type='PCMDFD' pcmTypeContainer=[CharacteristicTypeDictionary|ID] (usageModel=[UsageModel|ID] repositoryModel=[Repository|ID])?)
	 */
	protected void sequence_TargetModelTypeDef(ISerializationContext context, TargetModelTypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
