/**
 */
package emf.RessourcenContainer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emf.RessourcenContainer.RessourcenContainerPackage
 * @generated
 */
public interface RessourcenContainerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RessourcenContainerFactory eINSTANCE = emf.RessourcenContainer.impl.RessourcenContainerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ressourcen Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ressourcen Container</em>'.
	 * @generated
	 */
	RessourcenContainer createRessourcenContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RessourcenContainerPackage getRessourcenContainerPackage();

} //RessourcenContainerFactory
