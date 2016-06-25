/**
 */
package emf.Gebaeude.impl;

import emf.Enum.EnumPackage;

import emf.Enum.impl.EnumPackageImpl;

import emf.Gebaeude.Gebaeude;
import emf.Gebaeude.GebaeudeFactory;
import emf.Gebaeude.GebaeudePackage;
import emf.Gebaeude.LagerGebaeude;
import emf.Gebaeude.ProduzierendesGebaeude;
import emf.Gebaeude.Wohngebaeude;

import emf.Ressource.RessourcePackage;

import emf.Ressource.impl.RessourcePackageImpl;

import emf.RessourcenContainer.RessourcenContainerPackage;

import emf.RessourcenContainer.impl.RessourcenContainerPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GebaeudePackageImpl extends EPackageImpl implements GebaeudePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gebaeudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wohngebaeudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lagerGebaeudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass produzierendesGebaeudeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see emf.Gebaeude.GebaeudePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GebaeudePackageImpl() {
		super(eNS_URI, GebaeudeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GebaeudePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GebaeudePackage init() {
		if (isInited) return (GebaeudePackage)EPackage.Registry.INSTANCE.getEPackage(GebaeudePackage.eNS_URI);

		// Obtain or create and register package
		GebaeudePackageImpl theGebaeudePackage = (GebaeudePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GebaeudePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GebaeudePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EnumPackageImpl theEnumPackage = (EnumPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI) instanceof EnumPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI) : EnumPackage.eINSTANCE);
		RessourcenContainerPackageImpl theRessourcenContainerPackage = (RessourcenContainerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RessourcenContainerPackage.eNS_URI) instanceof RessourcenContainerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RessourcenContainerPackage.eNS_URI) : RessourcenContainerPackage.eINSTANCE);
		RessourcePackageImpl theRessourcePackage = (RessourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RessourcePackage.eNS_URI) instanceof RessourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RessourcePackage.eNS_URI) : RessourcePackage.eINSTANCE);

		// Create package meta-data objects
		theGebaeudePackage.createPackageContents();
		theEnumPackage.createPackageContents();
		theRessourcenContainerPackage.createPackageContents();
		theRessourcePackage.createPackageContents();

		// Initialize created meta-data
		theGebaeudePackage.initializePackageContents();
		theEnumPackage.initializePackageContents();
		theRessourcenContainerPackage.initializePackageContents();
		theRessourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGebaeudePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GebaeudePackage.eNS_URI, theGebaeudePackage);
		return theGebaeudePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGebaeude() {
		return gebaeudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGebaeude_Information() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGebaeude_Name() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGebaeude_Bild() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGebaeude_Kategorie() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGebaeude__BenoetigteBauRessourcen() {
		return gebaeudeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWohngebaeude() {
		return wohngebaeudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWohngebaeude_AnzahlSiedler() {
		return (EAttribute)wohngebaeudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLagerGebaeude() {
		return lagerGebaeudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLagerGebaeude_Kapazitaet() {
		return (EAttribute)lagerGebaeudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduzierendesGebaeude() {
		return produzierendesGebaeudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProduzierendesGebaeude__GetInputProSekunde() {
		return produzierendesGebaeudeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProduzierendesGebaeude__GetOutputProSekunde() {
		return produzierendesGebaeudeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GebaeudeFactory getGebaeudeFactory() {
		return (GebaeudeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gebaeudeEClass = createEClass(GEBAEUDE);
		createEAttribute(gebaeudeEClass, GEBAEUDE__INFORMATION);
		createEAttribute(gebaeudeEClass, GEBAEUDE__NAME);
		createEAttribute(gebaeudeEClass, GEBAEUDE__BILD);
		createEAttribute(gebaeudeEClass, GEBAEUDE__KATEGORIE);
		createEOperation(gebaeudeEClass, GEBAEUDE___BENOETIGTE_BAU_RESSOURCEN);

		wohngebaeudeEClass = createEClass(WOHNGEBAEUDE);
		createEAttribute(wohngebaeudeEClass, WOHNGEBAEUDE__ANZAHL_SIEDLER);

		lagerGebaeudeEClass = createEClass(LAGER_GEBAEUDE);
		createEAttribute(lagerGebaeudeEClass, LAGER_GEBAEUDE__KAPAZITAET);

		produzierendesGebaeudeEClass = createEClass(PRODUZIERENDES_GEBAEUDE);
		createEOperation(produzierendesGebaeudeEClass, PRODUZIERENDES_GEBAEUDE___GET_INPUT_PRO_SEKUNDE);
		createEOperation(produzierendesGebaeudeEClass, PRODUZIERENDES_GEBAEUDE___GET_OUTPUT_PRO_SEKUNDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		RessourcenContainerPackage theRessourcenContainerPackage = (RessourcenContainerPackage)EPackage.Registry.INSTANCE.getEPackage(RessourcenContainerPackage.eNS_URI);
		RessourcePackage theRessourcePackage = (RessourcePackage)EPackage.Registry.INSTANCE.getEPackage(RessourcePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wohngebaeudeEClass.getESuperTypes().add(this.getGebaeude());
		lagerGebaeudeEClass.getESuperTypes().add(this.getGebaeude());
		produzierendesGebaeudeEClass.getESuperTypes().add(this.getGebaeude());

		// Initialize classes, features, and operations; add parameters
		initEClass(gebaeudeEClass, Gebaeude.class, "Gebaeude", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGebaeude_Information(), ecorePackage.getEString(), "information", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_Name(), theEnumPackage.getGebaeudeEnum(), "name", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_Bild(), ecorePackage.getEByteArray(), "bild", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_Kategorie(), theEnumPackage.getKategorieScoreEnum(), "kategorie", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGebaeude__BenoetigteBauRessourcen(), theRessourcenContainerPackage.getRessourcenContainer(), "benoetigteBauRessourcen", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(wohngebaeudeEClass, Wohngebaeude.class, "Wohngebaeude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWohngebaeude_AnzahlSiedler(), ecorePackage.getEInt(), "anzahlSiedler", null, 0, 1, Wohngebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lagerGebaeudeEClass, LagerGebaeude.class, "LagerGebaeude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLagerGebaeude_Kapazitaet(), ecorePackage.getEInt(), "kapazitaet", null, 0, 1, LagerGebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(produzierendesGebaeudeEClass, ProduzierendesGebaeude.class, "ProduzierendesGebaeude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getProduzierendesGebaeude__GetInputProSekunde(), theRessourcePackage.getRessource(), "getInputProSekunde", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduzierendesGebaeude__GetOutputProSekunde(), theRessourcePackage.getRessource(), "getOutputProSekunde", 1, -1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GebaeudePackageImpl
