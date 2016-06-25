/**
 */
package emf.Gebaeude.impl;

import emf.Gebaeude.GebaeudePackage;
import emf.Gebaeude.Wohngebaeude;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wohngebaeude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emf.Gebaeude.impl.WohngebaeudeImpl#getAnzahlSiedler <em>Anzahl Siedler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WohngebaeudeImpl extends GebaeudeImpl implements Wohngebaeude {
	/**
	 * The default value of the '{@link #getAnzahlSiedler() <em>Anzahl Siedler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlSiedler()
	 * @generated
	 * @ordered
	 */
	protected static final int ANZAHL_SIEDLER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnzahlSiedler() <em>Anzahl Siedler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlSiedler()
	 * @generated
	 * @ordered
	 */
	protected int anzahlSiedler = ANZAHL_SIEDLER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WohngebaeudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GebaeudePackage.Literals.WOHNGEBAEUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnzahlSiedler() {
		return anzahlSiedler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GebaeudePackage.WOHNGEBAEUDE__ANZAHL_SIEDLER:
				return getAnzahlSiedler();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GebaeudePackage.WOHNGEBAEUDE__ANZAHL_SIEDLER:
				return anzahlSiedler != ANZAHL_SIEDLER_EDEFAULT;
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
		result.append(" (anzahlSiedler: ");
		result.append(anzahlSiedler);
		result.append(')');
		return result.toString();
	}

} //WohngebaeudeImpl
