/**
 */
package emf.Ressource.impl;

import emf.Enum.EnumPackage;

import emf.Enum.impl.EnumPackageImpl;

import emf.Gebaeude.GebaeudePackage;

import emf.Gebaeude.impl.GebaeudePackageImpl;

import emf.Ressource.Ressource;
import emf.Ressource.RessourceFactory;
import emf.Ressource.RessourcePackage;

import emf.RessourcenContainer.RessourcenContainerPackage;

import emf.RessourcenContainer.impl.RessourcenContainerPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RessourcePackageImpl extends EPackageImpl implements RessourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourceEClass = null;

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
	 * @see emf.Ressource.RessourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RessourcePackageImpl() {
		super(eNS_URI, RessourceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RessourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RessourcePackage init() {
		if (isInited) return (RessourcePackage)EPackage.Registry.INSTANCE.getEPackage(RessourcePackage.eNS_URI);

		// Obtain or create and register package
		RessourcePackageImpl theRessourcePackage = (RessourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RessourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RessourcePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GebaeudePackageImpl theGebaeudePackage = (GebaeudePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GebaeudePackage.eNS_URI) instanceof GebaeudePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GebaeudePackage.eNS_URI) : GebaeudePackage.eINSTANCE);
		EnumPackageImpl theEnumPackage = (EnumPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI) instanceof EnumPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI) : EnumPackage.eINSTANCE);
		RessourcenContainerPackageImpl theRessourcenContainerPackage = (RessourcenContainerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RessourcenContainerPackage.eNS_URI) instanceof RessourcenContainerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RessourcenContainerPackage.eNS_URI) : RessourcenContainerPackage.eINSTANCE);

		// Create package meta-data objects
		theRessourcePackage.createPackageContents();
		theGebaeudePackage.createPackageContents();
		theEnumPackage.createPackageContents();
		theRessourcenContainerPackage.createPackageContents();

		// Initialize created meta-data
		theRessourcePackage.initializePackageContents();
		theGebaeudePackage.initializePackageContents();
		theEnumPackage.initializePackageContents();
		theRessourcenContainerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRessourcePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RessourcePackage.eNS_URI, theRessourcePackage);
		return theRessourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessource() {
		return ressourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Typ() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRessource_Anzahl() {
		return (EAttribute)ressourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceFactory getRessourceFactory() {
		return (RessourceFactory)getEFactoryInstance();
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
		ressourceEClass = createEClass(RESSOURCE);
		createEAttribute(ressourceEClass, RESSOURCE__TYP);
		createEAttribute(ressourceEClass, RESSOURCE__ANZAHL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ressourceEClass, Ressource.class, "Ressource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRessource_Typ(), theEnumPackage.getRessourcenEnum(), "typ", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRessource_Anzahl(), ecorePackage.getEInt(), "anzahl", null, 0, 1, Ressource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RessourcePackageImpl
