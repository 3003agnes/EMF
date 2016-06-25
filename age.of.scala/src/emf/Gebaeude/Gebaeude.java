/**
 */
package emf.Gebaeude;

import emf.Enum.GebaeudeEnum;
import emf.Enum.KategorieScoreEnum;

import emf.RessourcenContainer.RessourcenContainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.Gebaeude.Gebaeude#getInformation <em>Information</em>}</li>
 *   <li>{@link emf.Gebaeude.Gebaeude#getName <em>Name</em>}</li>
 *   <li>{@link emf.Gebaeude.Gebaeude#getBild <em>Bild</em>}</li>
 *   <li>{@link emf.Gebaeude.Gebaeude#getKategorie <em>Kategorie</em>}</li>
 * </ul>
 *
 * @see emf.Gebaeude.GebaeudePackage#getGebaeude()
 * @model abstract="true"
 * @generated
 */
public interface Gebaeude extends EObject {
	/**
	 * Returns the value of the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' attribute.
	 * @see emf.Gebaeude.GebaeudePackage#getGebaeude_Information()
	 * @model changeable="false"
	 * @generated
	 */
	String getInformation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link emf.Enum.GebaeudeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see emf.Enum.GebaeudeEnum
	 * @see emf.Gebaeude.GebaeudePackage#getGebaeude_Name()
	 * @model changeable="false"
	 * @generated
	 */
	GebaeudeEnum getName();

	/**
	 * Returns the value of the '<em><b>Bild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bild</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bild</em>' attribute.
	 * @see emf.Gebaeude.GebaeudePackage#getGebaeude_Bild()
	 * @model changeable="false"
	 * @generated
	 */
	byte[] getBild();

	/**
	 * Returns the value of the '<em><b>Kategorie</b></em>' attribute.
	 * The literals are from the enumeration {@link emf.Enum.KategorieScoreEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kategorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kategorie</em>' attribute.
	 * @see emf.Enum.KategorieScoreEnum
	 * @see emf.Gebaeude.GebaeudePackage#getGebaeude_Kategorie()
	 * @model changeable="false"
	 * @generated
	 */
	KategorieScoreEnum getKategorie();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RessourcenContainer benoetigteBauRessourcen();

} // Gebaeude
