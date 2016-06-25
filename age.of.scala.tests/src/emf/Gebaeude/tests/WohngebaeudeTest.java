/**
 */
package emf.Gebaeude.tests;

import emf.Gebaeude.GebaeudeFactory;
import emf.Gebaeude.Wohngebaeude;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wohngebaeude</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WohngebaeudeTest extends GebaeudeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WohngebaeudeTest.class);
	}

	/**
	 * Constructs a new Wohngebaeude test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WohngebaeudeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wohngebaeude test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Wohngebaeude getFixture() {
		return (Wohngebaeude)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GebaeudeFactory.eINSTANCE.createWohngebaeude());
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

} //WohngebaeudeTest
