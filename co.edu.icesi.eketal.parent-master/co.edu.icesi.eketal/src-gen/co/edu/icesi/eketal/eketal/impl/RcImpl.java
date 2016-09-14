/**
 * generated by Xtext 2.10.0
 */
package co.edu.icesi.eketal.eketal.impl;

import co.edu.icesi.eketal.eketal.Automaton;
import co.edu.icesi.eketal.eketal.Body;
import co.edu.icesi.eketal.eketal.EketalPackage;
import co.edu.icesi.eketal.eketal.Pos;
import co.edu.icesi.eketal.eketal.Rc;
import co.edu.icesi.eketal.eketal.Step;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.RcImpl#getSyncex <em>Syncex</em>}</li>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.RcImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.RcImpl#getAutomaton <em>Automaton</em>}</li>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.RcImpl#getState <em>State</em>}</li>
 *   <li>{@link co.edu.icesi.eketal.eketal.impl.RcImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RcImpl extends DeclImpl implements Rc
{
  /**
   * The default value of the '{@link #getSyncex() <em>Syncex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyncex()
   * @generated
   * @ordered
   */
  protected static final String SYNCEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSyncex() <em>Syncex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyncex()
   * @generated
   * @ordered
   */
  protected String syncex = SYNCEX_EDEFAULT;

  /**
   * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPos()
   * @generated
   * @ordered
   */
  protected static final Pos POS_EDEFAULT = Pos.BEFORE;

  /**
   * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPos()
   * @generated
   * @ordered
   */
  protected Pos pos = POS_EDEFAULT;

  /**
   * The cached value of the '{@link #getAutomaton() <em>Automaton</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutomaton()
   * @generated
   * @ordered
   */
  protected Automaton automaton;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected Step state;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Body body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RcImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EketalPackage.Literals.RC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSyncex()
  {
    return syncex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSyncex(String newSyncex)
  {
    String oldSyncex = syncex;
    syncex = newSyncex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.RC__SYNCEX, oldSyncex, syncex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pos getPos()
  {
    return pos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPos(Pos newPos)
  {
    Pos oldPos = pos;
    pos = newPos == null ? POS_EDEFAULT : newPos;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.RC__POS, oldPos, pos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Automaton getAutomaton()
  {
    if (automaton != null && automaton.eIsProxy())
    {
      InternalEObject oldAutomaton = (InternalEObject)automaton;
      automaton = (Automaton)eResolveProxy(oldAutomaton);
      if (automaton != oldAutomaton)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EketalPackage.RC__AUTOMATON, oldAutomaton, automaton));
      }
    }
    return automaton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Automaton basicGetAutomaton()
  {
    return automaton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutomaton(Automaton newAutomaton)
  {
    Automaton oldAutomaton = automaton;
    automaton = newAutomaton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.RC__AUTOMATON, oldAutomaton, automaton));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (Step)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EketalPackage.RC__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(Step newState)
  {
    Step oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.RC__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Body newBody, NotificationChain msgs)
  {
    Body oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EketalPackage.RC__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Body newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EketalPackage.RC__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EketalPackage.RC__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EketalPackage.RC__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EketalPackage.RC__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EketalPackage.RC__SYNCEX:
        return getSyncex();
      case EketalPackage.RC__POS:
        return getPos();
      case EketalPackage.RC__AUTOMATON:
        if (resolve) return getAutomaton();
        return basicGetAutomaton();
      case EketalPackage.RC__STATE:
        if (resolve) return getState();
        return basicGetState();
      case EketalPackage.RC__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EketalPackage.RC__SYNCEX:
        setSyncex((String)newValue);
        return;
      case EketalPackage.RC__POS:
        setPos((Pos)newValue);
        return;
      case EketalPackage.RC__AUTOMATON:
        setAutomaton((Automaton)newValue);
        return;
      case EketalPackage.RC__STATE:
        setState((Step)newValue);
        return;
      case EketalPackage.RC__BODY:
        setBody((Body)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EketalPackage.RC__SYNCEX:
        setSyncex(SYNCEX_EDEFAULT);
        return;
      case EketalPackage.RC__POS:
        setPos(POS_EDEFAULT);
        return;
      case EketalPackage.RC__AUTOMATON:
        setAutomaton((Automaton)null);
        return;
      case EketalPackage.RC__STATE:
        setState((Step)null);
        return;
      case EketalPackage.RC__BODY:
        setBody((Body)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EketalPackage.RC__SYNCEX:
        return SYNCEX_EDEFAULT == null ? syncex != null : !SYNCEX_EDEFAULT.equals(syncex);
      case EketalPackage.RC__POS:
        return pos != POS_EDEFAULT;
      case EketalPackage.RC__AUTOMATON:
        return automaton != null;
      case EketalPackage.RC__STATE:
        return state != null;
      case EketalPackage.RC__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (syncex: ");
    result.append(syncex);
    result.append(", pos: ");
    result.append(pos);
    result.append(')');
    return result.toString();
  }

} //RcImpl
