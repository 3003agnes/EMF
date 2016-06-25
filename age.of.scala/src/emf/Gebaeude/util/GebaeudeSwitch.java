/**
 */
package emf.Gebaeude.util;

import emf.Gebaeude.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see emf.Gebaeude.GebaeudePackage
 * @generated
 */
public class GebaeudeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GebaeudePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GebaeudeSwitch() {
		if (modelPackage == null) {
			modelPackage = GebaeudePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GebaeudePackage.GEBAEUDE: {
				Gebaeude gebaeude = (Gebaeude)theEObject;
				T result = caseGebaeude(gebaeude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GebaeudePackage.WOHNGEBAEUDE: {
				Wohngebaeude wohngebaeude = (Wohngebaeude)theEObject;
				T result = caseWohngebaeude(wohngebaeude);
				if (result == null) result = caseGebaeude(wohngebaeude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GebaeudePackage.LAGER_GEBAEUDE: {
				LagerGebaeude lagerGebaeude = (LagerGebaeude)theEObject;
				T result = caseLagerGebaeude(lagerGebaeude);
				if (result == null) result = caseGebaeude(lagerGebaeude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GebaeudePackage.PRODUZIERENDES_GEBAEUDE: {
				ProduzierendesGebaeude produzierendesGebaeude = (ProduzierendesGebaeude)theEObject;
				T result = caseProduzierendesGebaeude(produzierendesGebaeude);
				if (result == null) result = caseGebaeude(produzierendesGebaeude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gebaeude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGebaeude(Gebaeude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wohngebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wohngebaeude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWohngebaeude(Wohngebaeude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lager Gebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lager Gebaeude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLagerGebaeude(LagerGebaeude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Produzierendes Gebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Produzierendes Gebaeude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduzierendesGebaeude(ProduzierendesGebaeude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GebaeudeSwitch
