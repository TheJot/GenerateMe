/**
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.generateMe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.juliusz.generateme.generateMe.Photo#getName <em>Name</em>}</li>
 *   <li>{@link uk.juliusz.generateme.generateMe.Photo#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.juliusz.generateme.generateMe.Photo#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see uk.juliusz.generateme.generateMe.GenerateMePackage#getPhoto()
 * @model
 * @generated
 */
public interface Photo extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.juliusz.generateme.generateMe.GenerateMePackage#getPhoto_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.juliusz.generateme.generateMe.Photo#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see uk.juliusz.generateme.generateMe.GenerateMePackage#getPhoto_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link uk.juliusz.generateme.generateMe.Photo#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' attribute.
   * @see #setFileName(String)
   * @see uk.juliusz.generateme.generateMe.GenerateMePackage#getPhoto_FileName()
   * @model
   * @generated
   */
  String getFileName();

  /**
   * Sets the value of the '{@link uk.juliusz.generateme.generateMe.Photo#getFileName <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' attribute.
   * @see #getFileName()
   * @generated
   */
  void setFileName(String value);

} // Photo
