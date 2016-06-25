/**
 */
package emf.Gebaeude;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wohngebaeude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.Gebaeude.Wohngebaeude#getAnzahlSiedler <em>Anzahl Siedler</em>}</li>
 * </ul>
 *
 * @see emf.Gebaeude.GebaeudePackage#getWohngebaeude()
 * @model
 * @generated
 */
public interface Wohngebaeude extends Gebaeude {
	/**
	 * Returns the value of the '<em><b>Anzahl Siedler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anzahl Siedler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Siedler</em>' attribute.
	 * @see emf.Gebaeude.GebaeudePackage#getWohngebaeude_AnzahlSiedler()
	 * @model changeable="false"
	 * @generated
	 */
	int getAnzahlSiedler();

} // Wohngebaeude
