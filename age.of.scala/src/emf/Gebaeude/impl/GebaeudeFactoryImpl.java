/**
 */
package emf.Gebaeude.impl;

import emf.Gebaeude.*;

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
public class GebaeudeFactoryImpl extends EFactoryImpl implements GebaeudeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GebaeudeFactory init() {
		try {
			GebaeudeFactory theGebaeudeFactory = (GebaeudeFactory)EPackage.Registry.INSTANCE.getEFactory(GebaeudePackage.eNS_URI);
			if (theGebaeudeFactory != null) {
				return theGebaeudeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GebaeudeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GebaeudeFactoryImpl() {
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
			case GebaeudePackage.WOHNGEBAEUDE: return createWohngebaeude();
			case GebaeudePackage.LAGER_GEBAEUDE: return createLagerGebaeude();
			case GebaeudePackage.PRODUZIERENDES_GEBAEUDE: return createProduzierendesGebaeude();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wohngebaeude createWohngebaeude() {
		WohngebaeudeImpl wohngebaeude = new WohngebaeudeImpl();
		return wohngebaeude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LagerGebaeude createLagerGebaeude() {
		LagerGebaeudeImpl lagerGebaeude = new LagerGebaeudeImpl();
		return lagerGebaeude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProduzierendesGebaeude createProduzierendesGebaeude() {
		ProduzierendesGebaeudeImpl produzierendesGebaeude = new ProduzierendesGebaeudeImpl();
		return produzierendesGebaeude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GebaeudePackage getGebaeudePackage() {
		return (GebaeudePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GebaeudePackage getPackage() {
		return GebaeudePackage.eINSTANCE;
	}

} //GebaeudeFactoryImpl
