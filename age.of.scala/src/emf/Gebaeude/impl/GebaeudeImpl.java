/**
 */
package emf.Gebaeude.impl;

import emf.Enum.GebaeudeEnum;
import emf.Enum.KategorieScoreEnum;

import emf.Gebaeude.Gebaeude;
import emf.Gebaeude.GebaeudePackage;

import emf.RessourcenContainer.RessourcenContainer;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emf.Gebaeude.impl.GebaeudeImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link emf.Gebaeude.impl.GebaeudeImpl#getName <em>Name</em>}</li>
 *   <li>{@link emf.Gebaeude.impl.GebaeudeImpl#getBild <em>Bild</em>}</li>
 *   <li>{@link emf.Gebaeude.impl.GebaeudeImpl#getKategorie <em>Kategorie</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GebaeudeImpl extends MinimalEObjectImpl.Container implements Gebaeude {
	/**
	 * The default value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected String information = INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final GebaeudeEnum NAME_EDEFAULT = GebaeudeEnum.RATHAUS;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected GebaeudeEnum name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBild() <em>Bild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBild()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BILD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBild() <em>Bild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBild()
	 * @generated
	 * @ordered
	 */
	protected byte[] bild = BILD_EDEFAULT;

	/**
	 * The default value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected static final KategorieScoreEnum KATEGORIE_EDEFAULT = KategorieScoreEnum.A;

	/**
	 * The cached value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected KategorieScoreEnum kategorie = KATEGORIE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GebaeudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GebaeudePackage.Literals.GEBAEUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GebaeudeEnum getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBild() {
		return bild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KategorieScoreEnum getKategorie() {
		return kategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcenContainer benoetigteBauRessourcen() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GebaeudePackage.GEBAEUDE__INFORMATION:
				return getInformation();
			case GebaeudePackage.GEBAEUDE__NAME:
				return getName();
			case GebaeudePackage.GEBAEUDE__BILD:
				return getBild();
			case GebaeudePackage.GEBAEUDE__KATEGORIE:
				return getKategorie();
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
			case GebaeudePackage.GEBAEUDE__INFORMATION:
				return INFORMATION_EDEFAULT == null ? information != null : !INFORMATION_EDEFAULT.equals(information);
			case GebaeudePackage.GEBAEUDE__NAME:
				return name != NAME_EDEFAULT;
			case GebaeudePackage.GEBAEUDE__BILD:
				return BILD_EDEFAULT == null ? bild != null : !BILD_EDEFAULT.equals(bild);
			case GebaeudePackage.GEBAEUDE__KATEGORIE:
				return kategorie != KATEGORIE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GebaeudePackage.GEBAEUDE___BENOETIGTE_BAU_RESSOURCEN:
				return benoetigteBauRessourcen();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (information: ");
		result.append(information);
		result.append(", name: ");
		result.append(name);
		result.append(", bild: ");
		result.append(bild);
		result.append(", kategorie: ");
		result.append(kategorie);
		result.append(')');
		return result.toString();
	}

} //GebaeudeImpl
