/**
 */
package emf.RessourcenContainer;

import emf.Enum.RessourcenEnum;

import emf.Ressource.Ressource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressourcen Container</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see emf.RessourcenContainer.RessourcenContainerPackage#getRessourcenContainer()
 * @model
 * @generated
 */
public interface RessourcenContainer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Ressource getRessource(RessourcenEnum typ);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RessourcenContainer addRessource(RessourcenEnum typ, int anzahl);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RessourcenContainer minusRessource(RessourcenEnum typ, int anzahl);

} // RessourcenContainer
