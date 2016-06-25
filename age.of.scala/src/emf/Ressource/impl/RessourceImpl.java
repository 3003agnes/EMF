/**
 */
package emf.Ressource.impl;

import emf.Enum.RessourcenEnum;

import emf.Ressource.Ressource;
import emf.Ressource.RessourcePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emf.Ressource.impl.RessourceImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link emf.Ressource.impl.RessourceImpl#getAnzahl <em>Anzahl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceImpl extends MinimalEObjectImpl.Container implements Ressource {
	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final RessourcenEnum TYP_EDEFAULT = RessourcenEnum.HOLZ;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected RessourcenEnum typ = TYP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnzahl() <em>Anzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahl()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnzahl() <em>Anzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahl()
	 * @generated
	 * @ordered
	 */
	protected int anzahl = ANZAHL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RessourcePackage.Literals.RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcenEnum getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTyp(RessourcenEnum newTyp) {
		RessourcenEnum oldTyp = typ;
		typ = newTyp == null ? TYP_EDEFAULT : newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RessourcePackage.RESSOURCE__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnzahl() {
		return anzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnzahl(int newAnzahl) {
		int oldAnzahl = anzahl;
		anzahl = newAnzahl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RessourcePackage.RESSOURCE__ANZAHL, oldAnzahl, anzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RessourcePackage.RESSOURCE__TYP:
				return getTyp();
			case RessourcePackage.RESSOURCE__ANZAHL:
				return getAnzahl();
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
			case RessourcePackage.RESSOURCE__TYP:
				setTyp((RessourcenEnum)newValue);
				return;
			case RessourcePackage.RESSOURCE__ANZAHL:
				setAnzahl((Integer)newValue);
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
			case RessourcePackage.RESSOURCE__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case RessourcePackage.RESSOURCE__ANZAHL:
				setAnzahl(ANZAHL_EDEFAULT);
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
			case RessourcePackage.RESSOURCE__TYP:
				return typ != TYP_EDEFAULT;
			case RessourcePackage.RESSOURCE__ANZAHL:
				return anzahl != ANZAHL_EDEFAULT;
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
		result.append(" (typ: ");
		result.append(typ);
		result.append(", anzahl: ");
		result.append(anzahl);
		result.append(')');
		return result.toString();
	}

} //RessourceImpl
