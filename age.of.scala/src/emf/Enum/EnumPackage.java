/**
 */
package emf.Enum;

import org.eclipse.emf.ecore.EEnum;
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
 * @see emf.Enum.EnumFactory
 * @model kind="package"
 * @generated
 */
public interface EnumPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Enum";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:/www.vogella.de/base/emf/Enum/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Enum";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumPackage eINSTANCE = emf.Enum.impl.EnumPackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.Enum.GebaeudeEnum <em>Gebaeude Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.Enum.GebaeudeEnum
	 * @see emf.Enum.impl.EnumPackageImpl#getGebaeudeEnum()
	 * @generated
	 */
	int GEBAEUDE_ENUM = 0;

	/**
	 * The meta object id for the '{@link emf.Enum.RessourcenEnum <em>Ressourcen Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.Enum.RessourcenEnum
	 * @see emf.Enum.impl.EnumPackageImpl#getRessourcenEnum()
	 * @generated
	 */
	int RESSOURCEN_ENUM = 1;

	/**
	 * The meta object id for the '{@link emf.Enum.KategorieScoreEnum <em>Kategorie Score Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.Enum.KategorieScoreEnum
	 * @see emf.Enum.impl.EnumPackageImpl#getKategorieScoreEnum()
	 * @generated
	 */
	int KATEGORIE_SCORE_ENUM = 2;

	/**
	 * The meta object id for the '{@link emf.Enum.GebaeudeInformation <em>Gebaeude Information</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.Enum.GebaeudeInformation
	 * @see emf.Enum.impl.EnumPackageImpl#getGebaeudeInformation()
	 * @generated
	 */
	int GEBAEUDE_INFORMATION = 3;

	/**
	 * The meta object id for the '{@link emf.Enum.ResultEnum <em>Result Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.Enum.ResultEnum
	 * @see emf.Enum.impl.EnumPackageImpl#getResultEnum()
	 * @generated
	 */
	int RESULT_ENUM = 4;


	/**
	 * Returns the meta object for enum '{@link emf.Enum.GebaeudeEnum <em>Gebaeude Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gebaeude Enum</em>'.
	 * @see emf.Enum.GebaeudeEnum
	 * @generated
	 */
	EEnum getGebaeudeEnum();

	/**
	 * Returns the meta object for enum '{@link emf.Enum.RessourcenEnum <em>Ressourcen Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ressourcen Enum</em>'.
	 * @see emf.Enum.RessourcenEnum
	 * @generated
	 */
	EEnum getRessourcenEnum();

	/**
	 * Returns the meta object for enum '{@link emf.Enum.KategorieScoreEnum <em>Kategorie Score Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kategorie Score Enum</em>'.
	 * @see emf.Enum.KategorieScoreEnum
	 * @generated
	 */
	EEnum getKategorieScoreEnum();

	/**
	 * Returns the meta object for enum '{@link emf.Enum.GebaeudeInformation <em>Gebaeude Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gebaeude Information</em>'.
	 * @see emf.Enum.GebaeudeInformation
	 * @generated
	 */
	EEnum getGebaeudeInformation();

	/**
	 * Returns the meta object for enum '{@link emf.Enum.ResultEnum <em>Result Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Enum</em>'.
	 * @see emf.Enum.ResultEnum
	 * @generated
	 */
	EEnum getResultEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumFactory getEnumFactory();

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
		 * The meta object literal for the '{@link emf.Enum.GebaeudeEnum <em>Gebaeude Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.Enum.GebaeudeEnum
		 * @see emf.Enum.impl.EnumPackageImpl#getGebaeudeEnum()
		 * @generated
		 */
		EEnum GEBAEUDE_ENUM = eINSTANCE.getGebaeudeEnum();

		/**
		 * The meta object literal for the '{@link emf.Enum.RessourcenEnum <em>Ressourcen Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.Enum.RessourcenEnum
		 * @see emf.Enum.impl.EnumPackageImpl#getRessourcenEnum()
		 * @generated
		 */
		EEnum RESSOURCEN_ENUM = eINSTANCE.getRessourcenEnum();

		/**
		 * The meta object literal for the '{@link emf.Enum.KategorieScoreEnum <em>Kategorie Score Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.Enum.KategorieScoreEnum
		 * @see emf.Enum.impl.EnumPackageImpl#getKategorieScoreEnum()
		 * @generated
		 */
		EEnum KATEGORIE_SCORE_ENUM = eINSTANCE.getKategorieScoreEnum();

		/**
		 * The meta object literal for the '{@link emf.Enum.GebaeudeInformation <em>Gebaeude Information</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.Enum.GebaeudeInformation
		 * @see emf.Enum.impl.EnumPackageImpl#getGebaeudeInformation()
		 * @generated
		 */
		EEnum GEBAEUDE_INFORMATION = eINSTANCE.getGebaeudeInformation();

		/**
		 * The meta object literal for the '{@link emf.Enum.ResultEnum <em>Result Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.Enum.ResultEnum
		 * @see emf.Enum.impl.EnumPackageImpl#getResultEnum()
		 * @generated
		 */
		EEnum RESULT_ENUM = eINSTANCE.getResultEnum();

	}

} //EnumPackage
