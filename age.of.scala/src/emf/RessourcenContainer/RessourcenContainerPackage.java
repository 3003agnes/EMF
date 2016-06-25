/**
 */
package emf.RessourcenContainer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emf.RessourcenContainer.RessourcenContainerFactory
 * @model kind="package"
 * @generated
 */
public interface RessourcenContainerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RessourcenContainer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:/www.vogella.de/base/emf/RessourcenContainer/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RessourcenContainer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RessourcenContainerPackage eINSTANCE = emf.RessourcenContainer.impl.RessourcenContainerPackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.RessourcenContainer.impl.RessourcenContainerImpl <em>Ressourcen Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.RessourcenContainer.impl.RessourcenContainerImpl
	 * @see emf.RessourcenContainer.impl.RessourcenContainerPackageImpl#getRessourcenContainer()
	 * @generated
	 */
	int RESSOURCEN_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Ressourcen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCEN_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Ressource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCEN_CONTAINER___GET_RESSOURCE__RESSOURCENENUM = 0;

	/**
	 * The operation id for the '<em>Add Ressource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCEN_CONTAINER___ADD_RESSOURCE__RESSOURCENENUM_INT = 1;

	/**
	 * The operation id for the '<em>Minus Ressource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCEN_CONTAINER___MINUS_RESSOURCE__RESSOURCENENUM_INT = 2;

	/**
	 * The number of operations of the '<em>Ressourcen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCEN_CONTAINER_OPERATION_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link emf.RessourcenContainer.RessourcenContainer <em>Ressourcen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressourcen Container</em>'.
	 * @see emf.RessourcenContainer.RessourcenContainer
	 * @generated
	 */
	EClass getRessourcenContainer();

	/**
	 * Returns the meta object for the '{@link emf.RessourcenContainer.RessourcenContainer#getRessource(emf.Enum.RessourcenEnum) <em>Get Ressource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ressource</em>' operation.
	 * @see emf.RessourcenContainer.RessourcenContainer#getRessource(emf.Enum.RessourcenEnum)
	 * @generated
	 */
	EOperation getRessourcenContainer__GetRessource__RessourcenEnum();

	/**
	 * Returns the meta object for the '{@link emf.RessourcenContainer.RessourcenContainer#addRessource(emf.Enum.RessourcenEnum, int) <em>Add Ressource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Ressource</em>' operation.
	 * @see emf.RessourcenContainer.RessourcenContainer#addRessource(emf.Enum.RessourcenEnum, int)
	 * @generated
	 */
	EOperation getRessourcenContainer__AddRessource__RessourcenEnum_int();

	/**
	 * Returns the meta object for the '{@link emf.RessourcenContainer.RessourcenContainer#minusRessource(emf.Enum.RessourcenEnum, int) <em>Minus Ressource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Minus Ressource</em>' operation.
	 * @see emf.RessourcenContainer.RessourcenContainer#minusRessource(emf.Enum.RessourcenEnum, int)
	 * @generated
	 */
	EOperation getRessourcenContainer__MinusRessource__RessourcenEnum_int();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RessourcenContainerFactory getRessourcenContainerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link emf.RessourcenContainer.impl.RessourcenContainerImpl <em>Ressourcen Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.RessourcenContainer.impl.RessourcenContainerImpl
		 * @see emf.RessourcenContainer.impl.RessourcenContainerPackageImpl#getRessourcenContainer()
		 * @generated
		 */
		EClass RESSOURCEN_CONTAINER = eINSTANCE.getRessourcenContainer();

		/**
		 * The meta object literal for the '<em><b>Get Ressource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCEN_CONTAINER___GET_RESSOURCE__RESSOURCENENUM = eINSTANCE.getRessourcenContainer__GetRessource__RessourcenEnum();

		/**
		 * The meta object literal for the '<em><b>Add Ressource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCEN_CONTAINER___ADD_RESSOURCE__RESSOURCENENUM_INT = eINSTANCE.getRessourcenContainer__AddRessource__RessourcenEnum_int();

		/**
		 * The meta object literal for the '<em><b>Minus Ressource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCEN_CONTAINER___MINUS_RESSOURCE__RESSOURCENENUM_INT = eINSTANCE.getRessourcenContainer__MinusRessource__RessourcenEnum_int();

	}

} //RessourcenContainerPackage
