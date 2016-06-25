/**
 */
package emf.Gebaeude.tests;

import emf.Gebaeude.GebaeudeFactory;
import emf.Gebaeude.LagerGebaeude;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lager Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LagerGebaeudeTest extends GebaeudeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LagerGebaeudeTest.class);
	}

	/**
	 * Constructs a new Lager Gebaeude test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LagerGebaeudeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lager Gebaeude test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LagerGebaeude getFixture() {
		return (LagerGebaeude)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GebaeudeFactory.eINSTANCE.createLagerGebaeude());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LagerGebaeudeTest
