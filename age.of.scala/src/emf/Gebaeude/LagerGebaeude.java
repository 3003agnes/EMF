/**
 */
package emf.Gebaeude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lager Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.Gebaeude.LagerGebaeude#getKapazitaet <em>Kapazitaet</em>}</li>
 * </ul>
 *
 * @see emf.Gebaeude.GebaeudePackage#getLagerGebaeude()
 * @model
 * @generated
 */
public interface LagerGebaeude extends Gebaeude {
	/**
	 * Returns the value of the '<em><b>Kapazitaet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kapazitaet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kapazitaet</em>' attribute.
	 * @see #setKapazitaet(int)
	 * @see emf.Gebaeude.GebaeudePackage#getLagerGebaeude_Kapazitaet()
	 * @model
	 * @generated
	 */
	int getKapazitaet();

	/**
	 * Sets the value of the '{@link emf.Gebaeude.LagerGebaeude#getKapazitaet <em>Kapazitaet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kapazitaet</em>' attribute.
	 * @see #getKapazitaet()
	 * @generated
	 */
	void setKapazitaet(int value);

} // LagerGebaeude
