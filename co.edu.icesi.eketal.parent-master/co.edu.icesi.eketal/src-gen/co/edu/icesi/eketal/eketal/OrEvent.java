/**
 * generated by Xtext 2.10.0
 */
package co.edu.icesi.eketal.eketal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.icesi.eketal.eketal.OrEvent#getLeft <em>Left</em>}</li>
 *   <li>{@link co.edu.icesi.eketal.eketal.OrEvent#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see co.edu.icesi.eketal.eketal.EketalPackage#getOrEvent()
 * @model
 * @generated
 */
public interface OrEvent extends EventExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(EventExpression)
   * @see co.edu.icesi.eketal.eketal.EketalPackage#getOrEvent_Left()
   * @model containment="true"
   * @generated
   */
  EventExpression getLeft();

  /**
   * Sets the value of the '{@link co.edu.icesi.eketal.eketal.OrEvent#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EventExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(EventExpression)
   * @see co.edu.icesi.eketal.eketal.EketalPackage#getOrEvent_Right()
   * @model containment="true"
   * @generated
   */
  EventExpression getRight();

  /**
   * Sets the value of the '{@link co.edu.icesi.eketal.eketal.OrEvent#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EventExpression value);

} // OrEvent
