/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.userstory.userStory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>us Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.userstory.userStory.usActivity#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.userstory.userStory.usActivity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.userstory.userStory.UserStoryPackage#getusActivity()
 * @model
 * @generated
 */
public interface usActivity extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see org.xtext.example.userstory.userStory.UserStoryPackage#getusActivity_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link org.xtext.example.userstory.userStory.usActivity#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.userstory.userStory.UserStoryPackage#getusActivity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.userstory.userStory.usActivity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // usActivity