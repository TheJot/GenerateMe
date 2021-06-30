/**
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.generateMe.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.juliusz.generateme.generateMe.GenerateMePackage;
import uk.juliusz.generateme.generateMe.HomePage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.juliusz.generateme.generateMe.impl.HomePageImpl#getIntroduction <em>Introduction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomePageImpl extends MinimalEObjectImpl.Container implements HomePage
{
  /**
   * The default value of the '{@link #getIntroduction() <em>Introduction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntroduction()
   * @generated
   * @ordered
   */
  protected static final String INTRODUCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntroduction() <em>Introduction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntroduction()
   * @generated
   * @ordered
   */
  protected String introduction = INTRODUCTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HomePageImpl()
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
    return GenerateMePackage.Literals.HOME_PAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIntroduction()
  {
    return introduction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntroduction(String newIntroduction)
  {
    String oldIntroduction = introduction;
    introduction = newIntroduction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenerateMePackage.HOME_PAGE__INTRODUCTION, oldIntroduction, introduction));
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
      case GenerateMePackage.HOME_PAGE__INTRODUCTION:
        return getIntroduction();
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
      case GenerateMePackage.HOME_PAGE__INTRODUCTION:
        setIntroduction((String)newValue);
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
      case GenerateMePackage.HOME_PAGE__INTRODUCTION:
        setIntroduction(INTRODUCTION_EDEFAULT);
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
      case GenerateMePackage.HOME_PAGE__INTRODUCTION:
        return INTRODUCTION_EDEFAULT == null ? introduction != null : !INTRODUCTION_EDEFAULT.equals(introduction);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (Introduction: ");
    result.append(introduction);
    result.append(')');
    return result.toString();
  }

} //HomePageImpl