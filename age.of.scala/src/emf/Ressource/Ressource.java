/**
 */
package emf.Ressource;

import emf.Enum.RessourcenEnum;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.Ressource.Ressource#getTyp <em>Typ</em>}</li>
 *   <li>{@link emf.Ressource.Ressource#getAnzahl <em>Anzahl</em>}</li>
 * </ul>
 *
 * @see emf.Ressource.RessourcePackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * The literals are from the enumeration {@link emf.Enum.RessourcenEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see emf.Enum.RessourcenEnum
	 * @see #setTyp(RessourcenEnum)
	 * @see emf.Ressource.RessourcePackage#getRessource_Typ()
	 * @model
	 * @generated
	 */
	RessourcenEnum getTyp();

	/**
	 * Sets the value of the '{@link emf.Ressource.Ressource#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see emf.Enum.RessourcenEnum
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(RessourcenEnum value);

	/**
	 * Returns the value of the '<em><b>Anzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anzahl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl</em>' attribute.
	 * @see #setAnzahl(int)
	 * @see emf.Ressource.RessourcePackage#getRessource_Anzahl()
	 * @model
	 * @generated
	 */
	int getAnzahl();

	/**
	 * Sets the value of the '{@link emf.Ressource.Ressource#getAnzahl <em>Anzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl</em>' attribute.
	 * @see #getAnzahl()
	 * @generated
	 */
	void setAnzahl(int value);

} // Ressource
