/**
 * generated by Xtext 2.10.0
 */
package co.edu.icesi.eketal.eketal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trans Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.icesi.eketal.eketal.TransDef#getEvent <em>Event</em>}</li>
 *   <li>{@link co.edu.icesi.eketal.eketal.TransDef#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see co.edu.icesi.eketal.eketal.EketalPackage#getTransDef()
 * @model
 * @generated
 */
public interface TransDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(EvDecl)
   * @see co.edu.icesi.eketal.eketal.EketalPackage#getTransDef_Event()
   * @model
   * @generated
   */
  EvDecl getEvent();

  /**
   * Sets the value of the '{@link co.edu.icesi.eketal.eketal.TransDef#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(EvDecl value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Step)
   * @see co.edu.icesi.eketal.eketal.EketalPackage#getTransDef_Target()
   * @model
   * @generated
   */
  Step getTarget();

  /**
   * Sets the value of the '{@link co.edu.icesi.eketal.eketal.TransDef#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Step value);

} // TransDef
