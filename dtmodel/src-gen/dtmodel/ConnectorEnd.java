/**
 */
package dtmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtmodel.ConnectorEnd#getPort <em>Port</em>}</li>
 *   <li>{@link dtmodel.ConnectorEnd#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dtmodel.DtmodelPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dtmodel.Port#getConnectorend <em>Connectorend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see dtmodel.DtmodelPackage#getConnectorEnd_Port()
	 * @see dtmodel.Port#getConnectorend
	 * @model opposite="connectorend"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link dtmodel.ConnectorEnd#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dtmodel.DtmodelPackage#getConnectorEnd_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dtmodel.ConnectorEnd#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConnectorEnd
