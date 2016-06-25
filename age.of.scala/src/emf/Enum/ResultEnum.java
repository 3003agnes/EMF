/**
 */
package emf.Enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Result Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emf.Enum.EnumPackage#getResultEnum()
 * @model
 * @generated
 */
public enum ResultEnum implements Enumerator {
	/**
	 * The '<em><b>Gebäude Erstellt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEBÄUDE_ERSTELLT_VALUE
	 * @generated
	 * @ordered
	 */
	GEBÄUDE_ERSTELLT(0, "GebäudeErstellt", "Geb\u00e4udeErstellt"),

	/**
	 * The '<em><b>Gebäude Entfernt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEBÄUDE_ENTFERNT_VALUE
	 * @generated
	 * @ordered
	 */
	GEBÄUDE_ENTFERNT(1, "GebäudeEntfernt", "Geb\u00e4udeEntfernt"),

	/**
	 * The '<em><b>Gebäude Nicht Vorhanden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEBÄUDE_NICHT_VORHANDEN_VALUE
	 * @generated
	 * @ordered
	 */
	GEBÄUDE_NICHT_VORHANDEN(2, "GebäudeNichtVorhanden", "Geb\u00e4udeNichtVorhanden"),

	/**
	 * The '<em><b>Zu Wenig Ressource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZU_WENIG_RESSOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	ZU_WENIG_RESSOURCE(3, "ZuWenigRessource", "ZuWenigRessource");

	/**
	 * The '<em><b>Gebäude Erstellt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gebäude Erstellt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEBÄUDE_ERSTELLT
	 * @model name="GebäudeErstellt"
	 * @generated
	 * @ordered
	 */
	public static final int GEBÄUDE_ERSTELLT_VALUE = 0;

	/**
	 * The '<em><b>Gebäude Entfernt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gebäude Entfernt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEBÄUDE_ENTFERNT
	 * @model name="GebäudeEntfernt"
	 * @generated
	 * @ordered
	 */
	public static final int GEBÄUDE_ENTFERNT_VALUE = 1;

	/**
	 * The '<em><b>Gebäude Nicht Vorhanden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gebäude Nicht Vorhanden</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEBÄUDE_NICHT_VORHANDEN
	 * @model name="GebäudeNichtVorhanden"
	 * @generated
	 * @ordered
	 */
	public static final int GEBÄUDE_NICHT_VORHANDEN_VALUE = 2;

	/**
	 * The '<em><b>Zu Wenig Ressource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zu Wenig Ressource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZU_WENIG_RESSOURCE
	 * @model name="ZuWenigRessource"
	 * @generated
	 * @ordered
	 */
	public static final int ZU_WENIG_RESSOURCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Result Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResultEnum[] VALUES_ARRAY =
		new ResultEnum[] {
			GEBÄUDE_ERSTELLT,
			GEBÄUDE_ENTFERNT,
			GEBÄUDE_NICHT_VORHANDEN,
			ZU_WENIG_RESSOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Result Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResultEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Result Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResultEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResultEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Result Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResultEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResultEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Result Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResultEnum get(int value) {
		switch (value) {
			case GEBÄUDE_ERSTELLT_VALUE: return GEBÄUDE_ERSTELLT;
			case GEBÄUDE_ENTFERNT_VALUE: return GEBÄUDE_ENTFERNT;
			case GEBÄUDE_NICHT_VORHANDEN_VALUE: return GEBÄUDE_NICHT_VORHANDEN;
			case ZU_WENIG_RESSOURCE_VALUE: return ZU_WENIG_RESSOURCE;
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
	private ResultEnum(int value, String name, String literal) {
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
	
} //ResultEnum
