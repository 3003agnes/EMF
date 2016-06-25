/**
 */
package emf.Gebaeude;

import emf.Ressource.Ressource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produzierendes Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see emf.Gebaeude.GebaeudePackage#getProduzierendesGebaeude()
 * @model
 * @generated
 */
public interface ProduzierendesGebaeude extends Gebaeude {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EList<Ressource> getInputProSekunde();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EList<Ressource> getOutputProSekunde();

} // ProduzierendesGebaeude
