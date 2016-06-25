/**
 */
package emf.RessourcenContainer.impl;

import emf.Enum.RessourcenEnum;

import emf.Ressource.Ressource;

import emf.RessourcenContainer.RessourcenContainer;
import emf.RessourcenContainer.RessourcenContainerPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressourcen Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RessourcenContainerImpl extends MinimalEObjectImpl.Container implements RessourcenContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourcenContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RessourcenContainerPackage.Literals.RESSOURCEN_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getRessource(RessourcenEnum typ) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcenContainer addRessource(RessourcenEnum typ, int anzahl) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcenContainer minusRessource(RessourcenEnum typ, int anzahl) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RessourcenContainerPackage.RESSOURCEN_CONTAINER___GET_RESSOURCE__RESSOURCENENUM:
				return getRessource((RessourcenEnum)arguments.get(0));
			case RessourcenContainerPackage.RESSOURCEN_CONTAINER___ADD_RESSOURCE__RESSOURCENENUM_INT:
				return addRessource((RessourcenEnum)arguments.get(0), (Integer)arguments.get(1));
			case RessourcenContainerPackage.RESSOURCEN_CONTAINER___MINUS_RESSOURCE__RESSOURCENENUM_INT:
				return minusRessource((RessourcenEnum)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RessourcenContainerImpl
