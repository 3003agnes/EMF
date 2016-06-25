/**
 */
package emf.RessourcenContainer.impl;

import emf.RessourcenContainer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RessourcenContainerFactoryImpl extends EFactoryImpl implements RessourcenContainerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RessourcenContainerFactory init() {
		try {
			RessourcenContainerFactory theRessourcenContainerFactory = (RessourcenContainerFactory)EPackage.Registry.INSTANCE.getEFactory(RessourcenContainerPackage.eNS_URI);
			if (theRessourcenContainerFactory != null) {
				return theRessourcenContainerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RessourcenContainerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcenContainerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RessourcenContainerPackage.RESSOURCEN_CONTAINER: return createRessourcenContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcenContainer createRessourcenContainer() {
		RessourcenContainerImpl ressourcenContainer = new RessourcenContainerImpl();
		return ressourcenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcenContainerPackage getRessourcenContainerPackage() {
		return (RessourcenContainerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RessourcenContainerPackage getPackage() {
		return RessourcenContainerPackage.eINSTANCE;
	}

} //RessourcenContainerFactoryImpl
