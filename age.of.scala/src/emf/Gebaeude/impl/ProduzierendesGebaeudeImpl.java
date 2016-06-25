/**
 */
package emf.Gebaeude.impl;

import emf.Gebaeude.GebaeudePackage;
import emf.Gebaeude.ProduzierendesGebaeude;

import emf.Ressource.Ressource;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produzierendes Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProduzierendesGebaeudeImpl extends GebaeudeImpl implements ProduzierendesGebaeude {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProduzierendesGebaeudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GebaeudePackage.Literals.PRODUZIERENDES_GEBAEUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getInputProSekunde() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getOutputProSekunde() {
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
			case GebaeudePackage.PRODUZIERENDES_GEBAEUDE___GET_INPUT_PRO_SEKUNDE:
				return getInputProSekunde();
			case GebaeudePackage.PRODUZIERENDES_GEBAEUDE___GET_OUTPUT_PRO_SEKUNDE:
				return getOutputProSekunde();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProduzierendesGebaeudeImpl
