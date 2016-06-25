/**
 */
package emf.Gebaeude.impl;

import emf.Gebaeude.GebaeudePackage;
import emf.Gebaeude.LagerGebaeude;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lager Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emf.Gebaeude.impl.LagerGebaeudeImpl#getKapazitaet <em>Kapazitaet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LagerGebaeudeImpl extends GebaeudeImpl implements LagerGebaeude {
	/**
	 * The default value of the '{@link #getKapazitaet() <em>Kapazitaet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKapazitaet()
	 * @generated
	 * @ordered
	 */
	protected static final int KAPAZITAET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKapazitaet() <em>Kapazitaet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKapazitaet()
	 * @generated
	 * @ordered
	 */
	protected int kapazitaet = KAPAZITAET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LagerGebaeudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GebaeudePackage.Literals.LAGER_GEBAEUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKapazitaet() {
		return kapazitaet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKapazitaet(int newKapazitaet) {
		int oldKapazitaet = kapazitaet;
		kapazitaet = newKapazitaet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GebaeudePackage.LAGER_GEBAEUDE__KAPAZITAET, oldKapazitaet, kapazitaet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GebaeudePackage.LAGER_GEBAEUDE__KAPAZITAET:
				return getKapazitaet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GebaeudePackage.LAGER_GEBAEUDE__KAPAZITAET:
				setKapazitaet((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GebaeudePackage.LAGER_GEBAEUDE__KAPAZITAET:
				setKapazitaet(KAPAZITAET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GebaeudePackage.LAGER_GEBAEUDE__KAPAZITAET:
				return kapazitaet != KAPAZITAET_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kapazitaet: ");
		result.append(kapazitaet);
		result.append(')');
		return result.toString();
	}

} //LagerGebaeudeImpl
