/**
 */
package dtmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtmodel.Port#getConnectorend <em>Connectorend</em>}</li>
 *   <li>{@link dtmodel.Port#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dtmodel.DtmodelPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Connectorend</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dtmodel.ConnectorEnd#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectorend</em>' reference.
	 * @see #setConnectorend(ConnectorEnd)
	 * @see dtmodel.DtmodelPackage#getPort_Connectorend()
	 * @see dtmodel.ConnectorEnd#getPort
	 * @model opposite="port"
	 * @generated
	 */
	ConnectorEnd getConnectorend();

	/**
	 * Sets the value of the '{@link dtmodel.Port#getConnectorend <em>Connectorend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectorend</em>' reference.
	 * @see #getConnectorend()
	 * @generated
	 */
	void setConnectorend(ConnectorEnd value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dtmodel.DtmodelPackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dtmodel.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Port
