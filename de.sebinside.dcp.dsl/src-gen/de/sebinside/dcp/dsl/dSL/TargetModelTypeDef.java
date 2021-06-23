/**
 * generated by Xtext 2.24.0
 */
package de.sebinside.dcp.dsl.dSL;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterized;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Model Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.TargetModelTypeDef#getType <em>Type</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.TargetModelTypeDef#getTypeContainer <em>Type Container</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getTargetModelTypeDef()
 * @model
 * @generated
 */
public interface TargetModelTypeDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getTargetModelTypeDef_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.TargetModelTypeDef#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Type Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Container</em>' reference.
   * @see #setTypeContainer(DataDictionaryCharacterized)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getTargetModelTypeDef_TypeContainer()
   * @model
   * @generated
   */
  DataDictionaryCharacterized getTypeContainer();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.TargetModelTypeDef#getTypeContainer <em>Type Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Container</em>' reference.
   * @see #getTypeContainer()
   * @generated
   */
  void setTypeContainer(DataDictionaryCharacterized value);

} // TargetModelTypeDef
