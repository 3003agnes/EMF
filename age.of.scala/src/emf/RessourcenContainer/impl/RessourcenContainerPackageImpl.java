/**
 */
package emf.RessourcenContainer.impl;

import emf.Enum.EnumPackage;

import emf.Enum.impl.EnumPackageImpl;

import emf.Gebaeude.GebaeudePackage;

import emf.Gebaeude.impl.GebaeudePackageImpl;

import emf.Ressource.RessourcePackage;

import emf.Ressource.impl.RessourcePackageImpl;

import emf.RessourcenContainer.RessourcenContainer;
import emf.RessourcenContainer.RessourcenContainerFactory;
import emf.RessourcenContainer.RessourcenContainerPackage;

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
public class RessourcenContainerPackageImpl extends EPackageImpl implements RessourcenContainerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ressourcenContainerEClass = null;

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
	 * @see emf.RessourcenContainer.RessourcenContainerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RessourcenContainerPackageImpl() {
		super(eNS_URI, RessourcenContainerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RessourcenContainerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RessourcenContainerPackage init() {
		if (isInited) return (RessourcenContainerPackage)EPackage.Registry.INSTANCE.getEPackage(RessourcenContainerPackage.eNS_URI);

		// Obtain or create and register package
		RessourcenContainerPackageImpl theRessourcenContainerPackage = (RessourcenContainerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RessourcenContainerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RessourcenContainerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GebaeudePackageImpl theGebaeudePackage = (GebaeudePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GebaeudePackage.eNS_URI) instanceof GebaeudePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GebaeudePackage.eNS_URI) : GebaeudePackage.eINSTANCE);
		EnumPackageImpl theEnumPackage = (EnumPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI) instanceof EnumPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI) : EnumPackage.eINSTANCE);
		RessourcePackageImpl theRessourcePackage = (RessourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RessourcePackage.eNS_URI) instanceof RessourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RessourcePackage.eNS_URI) : RessourcePackage.eINSTANCE);

		// Create package meta-data objects
		theRessourcenContainerPackage.createPackageContents();
		theGebaeudePackage.createPackageContents();
		theEnumPackage.createPackageContents();
		theRessourcePackage.createPackageContents();

		// Initialize created meta-data
		theRessourcenContainerPackage.initializePackageContents();
		theGebaeudePackage.initializePackageContents();
		theEnumPackage.initializePackageContents();
		theRessourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRessourcenContainerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RessourcenContainerPackage.eNS_URI, theRessourcenContainerPackage);
		return theRessourcenContainerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRessourcenContainer() {
		return ressourcenContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRessourcenContainer__GetRessource__RessourcenEnum() {
		return ressourcenContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRessourcenContainer__AddRessource__RessourcenEnum_int() {
		return ressourcenContainerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRessourcenContainer__MinusRessource__RessourcenEnum_int() {
		return ressourcenContainerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourcenContainerFactory getRessourcenContainerFactory() {
		return (RessourcenContainerFactory)getEFactoryInstance();
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
		ressourcenContainerEClass = createEClass(RESSOURCEN_CONTAINER);
		createEOperation(ressourcenContainerEClass, RESSOURCEN_CONTAINER___GET_RESSOURCE__RESSOURCENENUM);
		createEOperation(ressourcenContainerEClass, RESSOURCEN_CONTAINER___ADD_RESSOURCE__RESSOURCENENUM_INT);
		createEOperation(ressourcenContainerEClass, RESSOURCEN_CONTAINER___MINUS_RESSOURCE__RESSOURCENENUM_INT);
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
		RessourcePackage theRessourcePackage = (RessourcePackage)EPackage.Registry.INSTANCE.getEPackage(RessourcePackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ressourcenContainerEClass, RessourcenContainer.class, "RessourcenContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getRessourcenContainer__GetRessource__RessourcenEnum(), theRessourcePackage.getRessource(), "getRessource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEnumPackage.getRessourcenEnum(), "typ", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRessourcenContainer__AddRessource__RessourcenEnum_int(), this.getRessourcenContainer(), "addRessource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEnumPackage.getRessourcenEnum(), "typ", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "anzahl", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRessourcenContainer__MinusRessource__RessourcenEnum_int(), this.getRessourcenContainer(), "minusRessource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEnumPackage.getRessourcenEnum(), "typ", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "anzahl", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RessourcenContainerPackageImpl
