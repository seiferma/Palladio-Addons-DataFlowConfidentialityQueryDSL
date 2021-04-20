package de.sebinside.dcp.dsl.generator.crossplatform

import de.sebinside.dcp.dsl.dSL.CharacteristicType
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal
import de.sebinside.dcp.dsl.dSL.NodeIdentitiySelector
import org.palladiosimulator.dataflow.confidentiality.transformation.prolog.DFD2PrologTransformationTrace

import static de.sebinside.dcp.dsl.generator.util.PrologUtils.*
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristicType
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedExternalActor
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedStore
import org.palladiosimulator.dataflow.diagram.characterized.DataFlowDiagramCharacterized.CharacterizedNode

class DFDConverter implements Converter {
	
	val DFD2PrologTransformationTrace trace
	
	new(DFD2PrologTransformationTrace trace) {
		this.trace = trace
	}
	
	override convert(CharacteristicType characteristicType) {
		if (trace === null) {
			val name = characteristicType.ref.name
			val id = characteristicType.ref.id

			AtomicQuotedString('''EnumCharacteristicType «name» («id»)''')
		} else {
			var dfdid = trace.getDfdId(characteristicType.ref.id)
			var dfdpinid = trace.getDfdPinId(characteristicType.ref.id)
			//var resolveElement = trace.resolveDfdElement(characteristicType.ref.id, characteristicType.class)
			throw new UnsupportedOperationException("convert CharType error")
//			val computedValue = trace.value.resolveId(characteristicType.ref)
//
//			if (computedValue.present) {
//				AtomicQuotedString(computedValue.get)
//			} else {
//				throw new Exception("Unable to resolve CharacteristicType id.")
//			}
		}
	}
	
	override convertMember(CharacteristicType characteristicType) {
		if (trace === null && characteristicType.ref instanceof EnumCharacteristicType) {
			val enumType = characteristicType.ref as EnumCharacteristicType
			val name = enumType.type.name
			val id = enumType.type.id

			AtomicQuotedString('''Enumeration «name» («id»)''')
		} else {
			//this.convert(characteristicType)
			throw new UnsupportedOperationException("convertMember error")
		}
	}
	
	override convert(Literal characteristicLiteral) {
		if (trace === null) {
			val content = characteristicLiteral.name
			val id = characteristicLiteral.id

			AtomicQuotedString('''Literal «content» («id»)''')
		} else {
			throw new UnsupportedOperationException("convert Literal error")
//			val computedValue = trace
//
//			if (computedValue.present) {
//				AtomicQuotedString(computedValue.get)
//			} else {
//				throw new Exception("Unable to resolve Literal id.")
//			}
		}
	}
	
	def dispatch String convertCharacterizedNode(CharacterizedExternalActor actor) {'''«actor.name» («actor.id»)'''}
	def dispatch String convertCharacterizedNode(CharacterizedStore store) {'''«store.name» («store.id»)'''}
	def dispatch String convertCharacterizedNode(CharacterizedNode node) {throw new IllegalArgumentException("Unsupported node type selected!")}
	
	override convert(NodeIdentitiySelector selector) {
		if(this.trace === null) {
			if(selector.diaNode === null) {
			throw new IllegalArgumentException("Target model type and node selector are incompatible.")
		}
		
			AtomicQuotedString(convertCharacterizedNode(selector.diaNode))
		} else {
			throw new UnsupportedOperationException("convert node identity selector error")
		}
	}
	
	override createQualifiedName(NodeIdentitiySelector selector) {
		convertCharacterizedNode(selector.diaNode)
	}
	
	override resolveQualifiedName(String id, Boolean fullName) {
		if(trace === null) {
			id 
			// ERROR: This is not technically correct!
			// Calling this method without a trace will yield an incorrect result!
			// Qualified names in the DFD look like "name (id)" 
			// trace already contains the names correctly
		} else {
			throw new UnsupportedOperationException("resolve qual name error")
		}
		
//		val seff = trace.value.resolveSeffInstance(id)
//		val operation = trace.value.resolveDataOperationInstance(id)
//
//		if (seff.present) {
//			val seffName = seff.get.entity.describedService__SEFF.entityName
//			val componentName = seff.get.entity.basicComponent_ServiceEffectSpecification.entityName
//			val contextName = seff.get.ac.entityName
//
//			if (fullName) {
//				'''�contextName�.�componentName�.�seffName�'''
//			} else {
//				seffName
//			}
//		} else if (operation.present) {
//			operation.get.entity.entityName
//		} else {
//			id
//		}
	}
	
	override convertVariable(String id) {
		if(trace === null) {
			id 
			// ERROR: This is not technically correct!
			// Calling this method without a trace will yield an incorrect result!
			// Qualified names in the DFD look like "name (id)" 
			// trace already contains the names correctly
		} else {
			throw new UnsupportedOperationException("convert Var error")
		}
		
//		val result = trace.value.resolveVariable(id)
//
//		if (result.empty) {
//			id
//		} else {
//			val data = result.get.data
//
//			if (data instanceof ParameterBasedData) {
//				data.parameter.parameterName
//			} else {
//				data.entityName
//			}
//		}

	}
	
	override convertCharacteristicLiteral(String id) {
		if(trace === null) {
			id 
			// ERROR: This is not technically correct!
			// Calling this method without a trace will yield an incorrect result!
			// Qualified names in the DFD look like "name (id)" 
			// trace already contains the names correctly
		} else {
			throw new UnsupportedOperationException("convert CharacteristicLiteral error")
		}
//		val result = trace.value.resolveIdentifier(id)
//
//		if (result.empty) {
//			id
//		} else {
//			if (result.get instanceof Literal) {
//				(result.get as Literal).name
//			} else {
//				id
//			}
//		}
	}
	
	override qualifiedNameResolvable(String id) {
		if(trace === null) {
			false 
			// ERROR: This is not technically correct!
			// Calling this method without a trace will yield an incorrect result!
		} else {
//		trace.value.resolveSeffInstance(id).present || trace.value.resolveDataOperationInstance(id).present
			throw new UnsupportedOperationException("qualifiedNameResolvable error")		
		}


		
	}
	
}