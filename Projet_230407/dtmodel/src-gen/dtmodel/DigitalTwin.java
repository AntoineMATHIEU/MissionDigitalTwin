/**
 */
package dtmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Twin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtmodel.DigitalTwin#getDigitaltwin <em>Digitaltwin</em>}</li>
 * </ul>
 *
 * @see dtmodel.DtmodelPackage#getDigitalTwin()
 * @model
 * @generated
 */
public interface DigitalTwin extends EObject {
	/**
	 * Returns the value of the '<em><b>Digitaltwin</b></em>' containment reference list.
	 * The list contents are of type {@link dtmodel.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digitaltwin</em>' containment reference list.
	 * @see dtmodel.DtmodelPackage#getDigitalTwin_Digitaltwin()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getDigitaltwin();

} // DigitalTwin
