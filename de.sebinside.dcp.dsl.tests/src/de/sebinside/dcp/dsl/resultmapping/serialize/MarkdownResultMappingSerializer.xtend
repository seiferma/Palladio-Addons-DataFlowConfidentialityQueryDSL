package de.sebinside.dcp.dsl.resultmapping.serialize

import de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector

import static de.sebinside.dcp.dsl.resultmapping.ResultMappingUtils.*

class MarkdownResultMappingSerializer extends AbstractResultMappingSerializer {

	package new() {
	}

	override makeTitle(String value) {
		'''# �value�'''
	}

	override makeSubTitle(String value) {
		'''## �value�'''
	}

	override mapCharacteristicTypeSelector(CharacteristicTypeSelector selector) {
		val characteristicName = selector.ref.name
		val literals = selector.literals.map[literal|escape(literal.entityName)].join(", ")

		'''| �escape(characteristicName)� | �if(selector.negated) "*not* " else ""��literals� |'''
	}

	override fileExtension() {
		"md"
	}

	override escape(String value) {
		'''`�value�`'''
	}

	override highlight(String value) {
		'''*�value�*'''
	}

	override mapCallStackEntry(String entry) {
		'''| �entry� |'''
	}

	override protected mapClassVariable(CharacteristicTypeSelector variable, String value) {
		'''| �escape(variable.ref.name)� | �escape(retrieveClass(variable).get.name)� | �escape(value)� |'''
	}

	override protected advancedEnumHeader(String... entries) {
		val header = '''�FOR entry : entries BEFORE "\n\n| " SEPARATOR " | " AFTER " |\n"��entry��ENDFOR�'''
		val align = '''�FOR entry : entries BEFORE "| " SEPARATOR " | " AFTER " |\n"�:--�ENDFOR�'''
		'''�header��align�'''
	}

	override protected advancedEnumSeparator() {
		"\n"
	}

}
