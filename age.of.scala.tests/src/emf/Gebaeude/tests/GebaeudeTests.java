/**
 */
package emf.Gebaeude.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Gebaeude</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GebaeudeTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new GebaeudeTests("Gebaeude Tests");
		suite.addTestSuite(WohngebaeudeTest.class);
		suite.addTestSuite(LagerGebaeudeTest.class);
		suite.addTestSuite(ProduzierendesGebaeudeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GebaeudeTests(String name) {
		super(name);
	}

} //GebaeudeTests
