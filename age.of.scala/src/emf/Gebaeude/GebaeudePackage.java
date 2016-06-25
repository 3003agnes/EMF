/**
 */
package emf.Gebaeude;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see emf.Gebaeude.GebaeudeFactory
 * @model kind="package"
 * @generated
 */
public interface GebaeudePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Gebaeude";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:/www.vogella.de/base/emf/Gebaeude/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Gebaeude";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GebaeudePackage eINSTANCE = emf.Gebaeude.impl.GebaeudePackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.Gebaeude.impl.GebaeudeImpl <em>Gebaeude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.Gebaeude.impl.GebaeudeImpl
	 * @see emf.Gebaeude.impl.GebaeudePackageImpl#getGebaeude()
	 * @generated
	 */
	int GEBAEUDE = 0;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Bild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__BILD = 2;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__KATEGORIE = 3;

	/**
	 * The number of structural features of the '<em>Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Benoetigte Bau Ressourcen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE___BENOETIGTE_BAU_RESSOURCEN = 0;

	/**
	 * The number of operations of the '<em>Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link emf.Gebaeude.impl.WohngebaeudeImpl <em>Wohngebaeude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.Gebaeude.impl.WohngebaeudeImpl
	 * @see emf.Gebaeude.impl.GebaeudePackageImpl#getWohngebaeude()
	 * @generated
	 */
	int WOHNGEBAEUDE = 1;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNGEBAEUDE__INFORMATION = GEBAEUDE__INFORMATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNGEBAEUDE__NAME = GEBAEUDE__NAME;

	/**
	 * The feature id for the '<em><b>Bild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNGEBAEUDE__BILD = GEBAEUDE__BILD;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNGEBAEUDE__KATEGORIE = GEBAEUDE__KATEGORIE;

	/**
	 * The feature id for the '<em><b>Anzahl Siedler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNGEBAEUDE__ANZAHL_SIEDLER = GEBAEUDE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wohngebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNGEBAEUDE_FEATURE_COUNT = GEBAEUDE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Benoetigte Bau Ressourcen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNGEBAEUDE___BENOETIGTE_BAU_RESSOURCEN = GEBAEUDE___BENOETIGTE_BAU_RESSOURCEN;

	/**
	 * The number of operations of the '<em>Wohngebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNGEBAEUDE_OPERATION_COUNT = GEBAEUDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.Gebaeude.impl.LagerGebaeudeImpl <em>Lager Gebaeude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.Gebaeude.impl.LagerGebaeudeImpl
	 * @see emf.Gebaeude.impl.GebaeudePackageImpl#getLagerGebaeude()
	 * @generated
	 */
	int LAGER_GEBAEUDE = 2;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_GEBAEUDE__INFORMATION = GEBAEUDE__INFORMATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_GEBAEUDE__NAME = GEBAEUDE__NAME;

	/**
	 * The feature id for the '<em><b>Bild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_GEBAEUDE__BILD = GEBAEUDE__BILD;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_GEBAEUDE__KATEGORIE = GEBAEUDE__KATEGORIE;

	/**
	 * The feature id for the '<em><b>Kapazitaet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_GEBAEUDE__KAPAZITAET = GEBAEUDE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lager Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_GEBAEUDE_FEATURE_COUNT = GEBAEUDE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Benoetigte Bau Ressourcen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_GEBAEUDE___BENOETIGTE_BAU_RESSOURCEN = GEBAEUDE___BENOETIGTE_BAU_RESSOURCEN;

	/**
	 * The number of operations of the '<em>Lager Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_GEBAEUDE_OPERATION_COUNT = GEBAEUDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emf.Gebaeude.impl.ProduzierendesGebaeudeImpl <em>Produzierendes Gebaeude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.Gebaeude.impl.ProduzierendesGebaeudeImpl
	 * @see emf.Gebaeude.impl.GebaeudePackageImpl#getProduzierendesGebaeude()
	 * @generated
	 */
	int PRODUZIERENDES_GEBAEUDE = 3;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUZIERENDES_GEBAEUDE__INFORMATION = GEBAEUDE__INFORMATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUZIERENDES_GEBAEUDE__NAME = GEBAEUDE__NAME;

	/**
	 * The feature id for the '<em><b>Bild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUZIERENDES_GEBAEUDE__BILD = GEBAEUDE__BILD;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUZIERENDES_GEBAEUDE__KATEGORIE = GEBAEUDE__KATEGORIE;

	/**
	 * The number of structural features of the '<em>Produzierendes Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUZIERENDES_GEBAEUDE_FEATURE_COUNT = GEBAEUDE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Benoetigte Bau Ressourcen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUZIERENDES_GEBAEUDE___BENOETIGTE_BAU_RESSOURCEN = GEBAEUDE___BENOETIGTE_BAU_RESSOURCEN;

	/**
	 * The operation id for the '<em>Get Input Pro Sekunde</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUZIERENDES_GEBAEUDE___GET_INPUT_PRO_SEKUNDE = GEBAEUDE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Output Pro Sekunde</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUZIERENDES_GEBAEUDE___GET_OUTPUT_PRO_SEKUNDE = GEBAEUDE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Produzierendes Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUZIERENDES_GEBAEUDE_OPERATION_COUNT = GEBAEUDE_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link emf.Gebaeude.Gebaeude <em>Gebaeude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gebaeude</em>'.
	 * @see emf.Gebaeude.Gebaeude
	 * @generated
	 */
	EClass getGebaeude();

	/**
	 * Returns the meta object for the attribute '{@link emf.Gebaeude.Gebaeude#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information</em>'.
	 * @see emf.Gebaeude.Gebaeude#getInformation()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Information();

	/**
	 * Returns the meta object for the attribute '{@link emf.Gebaeude.Gebaeude#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emf.Gebaeude.Gebaeude#getName()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Name();

	/**
	 * Returns the meta object for the attribute '{@link emf.Gebaeude.Gebaeude#getBild <em>Bild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bild</em>'.
	 * @see emf.Gebaeude.Gebaeude#getBild()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Bild();

	/**
	 * Returns the meta object for the attribute '{@link emf.Gebaeude.Gebaeude#getKategorie <em>Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kategorie</em>'.
	 * @see emf.Gebaeude.Gebaeude#getKategorie()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Kategorie();

	/**
	 * Returns the meta object for the '{@link emf.Gebaeude.Gebaeude#benoetigteBauRessourcen() <em>Benoetigte Bau Ressourcen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Benoetigte Bau Ressourcen</em>' operation.
	 * @see emf.Gebaeude.Gebaeude#benoetigteBauRessourcen()
	 * @generated
	 */
	EOperation getGebaeude__BenoetigteBauRessourcen();

	/**
	 * Returns the meta object for class '{@link emf.Gebaeude.Wohngebaeude <em>Wohngebaeude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wohngebaeude</em>'.
	 * @see emf.Gebaeude.Wohngebaeude
	 * @generated
	 */
	EClass getWohngebaeude();

	/**
	 * Returns the meta object for the attribute '{@link emf.Gebaeude.Wohngebaeude#getAnzahlSiedler <em>Anzahl Siedler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Siedler</em>'.
	 * @see emf.Gebaeude.Wohngebaeude#getAnzahlSiedler()
	 * @see #getWohngebaeude()
	 * @generated
	 */
	EAttribute getWohngebaeude_AnzahlSiedler();

	/**
	 * Returns the meta object for class '{@link emf.Gebaeude.LagerGebaeude <em>Lager Gebaeude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lager Gebaeude</em>'.
	 * @see emf.Gebaeude.LagerGebaeude
	 * @generated
	 */
	EClass getLagerGebaeude();

	/**
	 * Returns the meta object for the attribute '{@link emf.Gebaeude.LagerGebaeude#getKapazitaet <em>Kapazitaet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kapazitaet</em>'.
	 * @see emf.Gebaeude.LagerGebaeude#getKapazitaet()
	 * @see #getLagerGebaeude()
	 * @generated
	 */
	EAttribute getLagerGebaeude_Kapazitaet();

	/**
	 * Returns the meta object for class '{@link emf.Gebaeude.ProduzierendesGebaeude <em>Produzierendes Gebaeude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produzierendes Gebaeude</em>'.
	 * @see emf.Gebaeude.ProduzierendesGebaeude
	 * @generated
	 */
	EClass getProduzierendesGebaeude();

	/**
	 * Returns the meta object for the '{@link emf.Gebaeude.ProduzierendesGebaeude#getInputProSekunde() <em>Get Input Pro Sekunde</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input Pro Sekunde</em>' operation.
	 * @see emf.Gebaeude.ProduzierendesGebaeude#getInputProSekunde()
	 * @generated
	 */
	EOperation getProduzierendesGebaeude__GetInputProSekunde();

	/**
	 * Returns the meta object for the '{@link emf.Gebaeude.ProduzierendesGebaeude#getOutputProSekunde() <em>Get Output Pro Sekunde</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output Pro Sekunde</em>' operation.
	 * @see emf.Gebaeude.ProduzierendesGebaeude#getOutputProSekunde()
	 * @generated
	 */
	EOperation getProduzierendesGebaeude__GetOutputProSekunde();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GebaeudeFactory getGebaeudeFactory();

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
		 * The meta object literal for the '{@link emf.Gebaeude.impl.GebaeudeImpl <em>Gebaeude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.Gebaeude.impl.GebaeudeImpl
		 * @see emf.Gebaeude.impl.GebaeudePackageImpl#getGebaeude()
		 * @generated
		 */
		EClass GEBAEUDE = eINSTANCE.getGebaeude();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__INFORMATION = eINSTANCE.getGebaeude_Information();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__NAME = eINSTANCE.getGebaeude_Name();

		/**
		 * The meta object literal for the '<em><b>Bild</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__BILD = eINSTANCE.getGebaeude_Bild();

		/**
		 * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__KATEGORIE = eINSTANCE.getGebaeude_Kategorie();

		/**
		 * The meta object literal for the '<em><b>Benoetigte Bau Ressourcen</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEBAEUDE___BENOETIGTE_BAU_RESSOURCEN = eINSTANCE.getGebaeude__BenoetigteBauRessourcen();

		/**
		 * The meta object literal for the '{@link emf.Gebaeude.impl.WohngebaeudeImpl <em>Wohngebaeude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.Gebaeude.impl.WohngebaeudeImpl
		 * @see emf.Gebaeude.impl.GebaeudePackageImpl#getWohngebaeude()
		 * @generated
		 */
		EClass WOHNGEBAEUDE = eINSTANCE.getWohngebaeude();

		/**
		 * The meta object literal for the '<em><b>Anzahl Siedler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WOHNGEBAEUDE__ANZAHL_SIEDLER = eINSTANCE.getWohngebaeude_AnzahlSiedler();

		/**
		 * The meta object literal for the '{@link emf.Gebaeude.impl.LagerGebaeudeImpl <em>Lager Gebaeude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.Gebaeude.impl.LagerGebaeudeImpl
		 * @see emf.Gebaeude.impl.GebaeudePackageImpl#getLagerGebaeude()
		 * @generated
		 */
		EClass LAGER_GEBAEUDE = eINSTANCE.getLagerGebaeude();

		/**
		 * The meta object literal for the '<em><b>Kapazitaet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAGER_GEBAEUDE__KAPAZITAET = eINSTANCE.getLagerGebaeude_Kapazitaet();

		/**
		 * The meta object literal for the '{@link emf.Gebaeude.impl.ProduzierendesGebaeudeImpl <em>Produzierendes Gebaeude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.Gebaeude.impl.ProduzierendesGebaeudeImpl
		 * @see emf.Gebaeude.impl.GebaeudePackageImpl#getProduzierendesGebaeude()
		 * @generated
		 */
		EClass PRODUZIERENDES_GEBAEUDE = eINSTANCE.getProduzierendesGebaeude();

		/**
		 * The meta object literal for the '<em><b>Get Input Pro Sekunde</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUZIERENDES_GEBAEUDE___GET_INPUT_PRO_SEKUNDE = eINSTANCE.getProduzierendesGebaeude__GetInputProSekunde();

		/**
		 * The meta object literal for the '<em><b>Get Output Pro Sekunde</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUZIERENDES_GEBAEUDE___GET_OUTPUT_PRO_SEKUNDE = eINSTANCE.getProduzierendesGebaeude__GetOutputProSekunde();

	}

} //GebaeudePackage
