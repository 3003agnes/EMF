/**
 */
package emf.Gebaeude;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emf.Gebaeude.GebaeudePackage
 * @generated
 */
public interface GebaeudeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GebaeudeFactory eINSTANCE = emf.Gebaeude.impl.GebaeudeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wohngebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wohngebaeude</em>'.
	 * @generated
	 */
	Wohngebaeude createWohngebaeude();

	/**
	 * Returns a new object of class '<em>Lager Gebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lager Gebaeude</em>'.
	 * @generated
	 */
	LagerGebaeude createLagerGebaeude();

	/**
	 * Returns a new object of class '<em>Produzierendes Gebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Produzierendes Gebaeude</em>'.
	 * @generated
	 */
	ProduzierendesGebaeude createProduzierendesGebaeude();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GebaeudePackage getGebaeudePackage();

} //GebaeudeFactory
