/**
 */
package emf.Enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gebaeude Information</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emf.Enum.EnumPackage#getGebaeudeInformation()
 * @model
 * @generated
 */
public enum GebaeudeInformation implements Enumerator {
	/**
	 * The '<em><b>Kostet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOSTET_VALUE
	 * @generated
	 * @ordered
	 */
	KOSTET(0, "Kostet", "Kostet"),

	/**
	 * The '<em><b>Produziert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUZIERT_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUZIERT(1, "Produziert", "Produziert"),

	/**
	 * The '<em><b>Betriebskosten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETRIEBSKOSTEN_VALUE
	 * @generated
	 * @ordered
	 */
	BETRIEBSKOSTEN(2, "Betriebskosten", "Betriebskosten"),

	/**
	 * The '<em><b>Typ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYP_VALUE
	 * @generated
	 * @ordered
	 */
	TYP(3, "Typ", "Typ"),

	/**
	 * The '<em><b>Kategorie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KATEGORIE_VALUE
	 * @generated
	 * @ordered
	 */
	KATEGORIE(4, "Kategorie", "Kategorie"),

	/**
	 * The '<em><b>Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION(5, "Information", "Information");

	/**
	 * The '<em><b>Kostet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kostet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOSTET
	 * @model name="Kostet"
	 * @generated
	 * @ordered
	 */
	public static final int KOSTET_VALUE = 0;

	/**
	 * The '<em><b>Produziert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Produziert</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRODUZIERT
	 * @model name="Produziert"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUZIERT_VALUE = 1;

	/**
	 * The '<em><b>Betriebskosten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Betriebskosten</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BETRIEBSKOSTEN
	 * @model name="Betriebskosten"
	 * @generated
	 * @ordered
	 */
	public static final int BETRIEBSKOSTEN_VALUE = 2;

	/**
	 * The '<em><b>Typ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Typ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYP
	 * @model name="Typ"
	 * @generated
	 * @ordered
	 */
	public static final int TYP_VALUE = 3;

	/**
	 * The '<em><b>Kategorie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kategorie</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KATEGORIE
	 * @model name="Kategorie"
	 * @generated
	 * @ordered
	 */
	public static final int KATEGORIE_VALUE = 4;

	/**
	 * The '<em><b>Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Information</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFORMATION
	 * @model name="Information"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Gebaeude Information</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GebaeudeInformation[] VALUES_ARRAY =
		new GebaeudeInformation[] {
			KOSTET,
			PRODUZIERT,
			BETRIEBSKOSTEN,
			TYP,
			KATEGORIE,
			INFORMATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Gebaeude Information</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GebaeudeInformation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gebaeude Information</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GebaeudeInformation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GebaeudeInformation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gebaeude Information</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GebaeudeInformation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GebaeudeInformation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gebaeude Information</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GebaeudeInformation get(int value) {
		switch (value) {
			case KOSTET_VALUE: return KOSTET;
			case PRODUZIERT_VALUE: return PRODUZIERT;
			case BETRIEBSKOSTEN_VALUE: return BETRIEBSKOSTEN;
			case TYP_VALUE: return TYP;
			case KATEGORIE_VALUE: return KATEGORIE;
			case INFORMATION_VALUE: return INFORMATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GebaeudeInformation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GebaeudeInformation
