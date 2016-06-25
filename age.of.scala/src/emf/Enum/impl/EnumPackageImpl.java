/**
 */
package emf.Enum.impl;

import emf.Enum.EnumFactory;
import emf.Enum.EnumPackage;
import emf.Enum.GebaeudeEnum;
import emf.Enum.GebaeudeInformation;
import emf.Enum.KategorieScoreEnum;
import emf.Enum.RessourcenEnum;
import emf.Enum.ResultEnum;

import emf.Gebaeude.GebaeudePackage;

import emf.Gebaeude.impl.GebaeudePackageImpl;

import emf.Ressource.RessourcePackage;

import emf.Ressource.impl.RessourcePackageImpl;

import emf.RessourcenContainer.RessourcenContainerPackage;

import emf.RessourcenContainer.impl.RessourcenContainerPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumPackageImpl extends EPackageImpl implements EnumPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gebaeudeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ressourcenEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kategorieScoreEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gebaeudeInformationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resultEnumEEnum = null;

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
	 * @see emf.Enum.EnumPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumPackageImpl() {
		super(eNS_URI, EnumFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumPackage init() {
		if (isInited) return (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);

		// Obtain or create and register package
		EnumPackageImpl theEnumPackage = (EnumPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnumPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnumPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GebaeudePackageImpl theGebaeudePackage = (GebaeudePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GebaeudePackage.eNS_URI) instanceof GebaeudePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GebaeudePackage.eNS_URI) : GebaeudePackage.eINSTANCE);
		RessourcenContainerPackageImpl theRessourcenContainerPackage = (RessourcenContainerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RessourcenContainerPackage.eNS_URI) instanceof RessourcenContainerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RessourcenContainerPackage.eNS_URI) : RessourcenContainerPackage.eINSTANCE);
		RessourcePackageImpl theRessourcePackage = (RessourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RessourcePackage.eNS_URI) instanceof RessourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RessourcePackage.eNS_URI) : RessourcePackage.eINSTANCE);

		// Create package meta-data objects
		theEnumPackage.createPackageContents();
		theGebaeudePackage.createPackageContents();
		theRessourcenContainerPackage.createPackageContents();
		theRessourcePackage.createPackageContents();

		// Initialize created meta-data
		theEnumPackage.initializePackageContents();
		theGebaeudePackage.initializePackageContents();
		theRessourcenContainerPackage.initializePackageContents();
		theRessourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumPackage.eNS_URI, theEnumPackage);
		return theEnumPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGebaeudeEnum() {
		return gebaeudeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRessourcenEnum() {
		return ressourcenEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKategorieScoreEnum() {
		return kategorieScoreEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGebaeudeInformation() {
		return gebaeudeInformationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResultEnum() {
		return resultEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumFactory getEnumFactory() {
		return (EnumFactory)getEFactoryInstance();
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

		// Create enums
		gebaeudeEnumEEnum = createEEnum(GEBAEUDE_ENUM);
		ressourcenEnumEEnum = createEEnum(RESSOURCEN_ENUM);
		kategorieScoreEnumEEnum = createEEnum(KATEGORIE_SCORE_ENUM);
		gebaeudeInformationEEnum = createEEnum(GEBAEUDE_INFORMATION);
		resultEnumEEnum = createEEnum(RESULT_ENUM);
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

		// Initialize enums and add enum literals
		initEEnum(gebaeudeEnumEEnum, GebaeudeEnum.class, "GebaeudeEnum");
		addEEnumLiteral(gebaeudeEnumEEnum, GebaeudeEnum.RATHAUS);
		addEEnumLiteral(gebaeudeEnumEEnum, GebaeudeEnum.HOLZFÄLLER);
		addEEnumLiteral(gebaeudeEnumEEnum, GebaeudeEnum.SÄGEWERK);
		addEEnumLiteral(gebaeudeEnumEEnum, GebaeudeEnum.STEINMETZ);
		addEEnumLiteral(gebaeudeEnumEEnum, GebaeudeEnum.WOHNHAUS);
		addEEnumLiteral(gebaeudeEnumEEnum, GebaeudeEnum.LAGER);
		addEEnumLiteral(gebaeudeEnumEEnum, GebaeudeEnum.FISCHER);
		addEEnumLiteral(gebaeudeEnumEEnum, GebaeudeEnum.JÄGER);

		initEEnum(ressourcenEnumEEnum, RessourcenEnum.class, "RessourcenEnum");
		addEEnumLiteral(ressourcenEnumEEnum, RessourcenEnum.HOLZ);
		addEEnumLiteral(ressourcenEnumEEnum, RessourcenEnum.STEIN);
		addEEnumLiteral(ressourcenEnumEEnum, RessourcenEnum.GOLD);
		addEEnumLiteral(ressourcenEnumEEnum, RessourcenEnum.NAHRUNG);
		addEEnumLiteral(ressourcenEnumEEnum, RessourcenEnum.EISEN);
		addEEnumLiteral(ressourcenEnumEEnum, RessourcenEnum.KOHLE);
		addEEnumLiteral(ressourcenEnumEEnum, RessourcenEnum.SIEDLER);

		initEEnum(kategorieScoreEnumEEnum, KategorieScoreEnum.class, "KategorieScoreEnum");
		addEEnumLiteral(kategorieScoreEnumEEnum, KategorieScoreEnum.A);
		addEEnumLiteral(kategorieScoreEnumEEnum, KategorieScoreEnum.B);
		addEEnumLiteral(kategorieScoreEnumEEnum, KategorieScoreEnum.C);

		initEEnum(gebaeudeInformationEEnum, GebaeudeInformation.class, "GebaeudeInformation");
		addEEnumLiteral(gebaeudeInformationEEnum, GebaeudeInformation.KOSTET);
		addEEnumLiteral(gebaeudeInformationEEnum, GebaeudeInformation.PRODUZIERT);
		addEEnumLiteral(gebaeudeInformationEEnum, GebaeudeInformation.BETRIEBSKOSTEN);
		addEEnumLiteral(gebaeudeInformationEEnum, GebaeudeInformation.TYP);
		addEEnumLiteral(gebaeudeInformationEEnum, GebaeudeInformation.KATEGORIE);
		addEEnumLiteral(gebaeudeInformationEEnum, GebaeudeInformation.INFORMATION);

		initEEnum(resultEnumEEnum, ResultEnum.class, "ResultEnum");
		addEEnumLiteral(resultEnumEEnum, ResultEnum.GEBÄUDE_ERSTELLT);
		addEEnumLiteral(resultEnumEEnum, ResultEnum.GEBÄUDE_ENTFERNT);
		addEEnumLiteral(resultEnumEEnum, ResultEnum.GEBÄUDE_NICHT_VORHANDEN);
		addEEnumLiteral(resultEnumEEnum, ResultEnum.ZU_WENIG_RESSOURCE);

		// Create resource
		createResource(eNS_URI);
	}

} //EnumPackageImpl
