/**
 * generated by Xtext 2.24.0
 */
package de.sebinside.dcp.dsl.dSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.Rule#getDataSelectors <em>Data Selectors</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.Rule#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.Rule#getDestinationSelectors <em>Destination Selectors</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.Rule#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Data Selectors</b></em>' containment reference list.
   * The list contents are of type {@link de.sebinside.dcp.dsl.dSL.DataSelector}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Selectors</em>' containment reference list.
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getRule_DataSelectors()
   * @model containment="true"
   * @generated
   */
  EList<DataSelector> getDataSelectors();

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getRule_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.Rule#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Destination Selectors</b></em>' containment reference list.
   * The list contents are of type {@link de.sebinside.dcp.dsl.dSL.DestinationSelector}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination Selectors</em>' containment reference list.
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getRule_DestinationSelectors()
   * @model containment="true"
   * @generated
   */
  EList<DestinationSelector> getDestinationSelectors();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getRule_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.Rule#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

} // Rule
