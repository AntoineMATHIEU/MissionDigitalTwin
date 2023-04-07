/**
 */
package dtmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtmodel.Connector#getConnectorend <em>Connectorend</em>}</li>
 *   <li>{@link dtmodel.Connector#getName <em>Name</em>}</li>
 *   <li>{@link dtmodel.Connector#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see dtmodel.DtmodelPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Connectorend</b></em>' containment reference list.
	 * The list contents are of type {@link dtmodel.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectorend</em>' containment reference list.
	 * @see dtmodel.DtmodelPackage#getConnector_Connectorend()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorEnd> getConnectorend();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dtmodel.DtmodelPackage#getConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dtmodel.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dtmodel.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dtmodel.ConnectorType
	 * @see #setType(ConnectorType)
	 * @see dtmodel.DtmodelPackage#getConnector_Type()
	 * @model
	 * @generated
	 */
	ConnectorType getType();

	/**
	 * Sets the value of the '{@link dtmodel.Connector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dtmodel.ConnectorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectorType value);

} // Connector
