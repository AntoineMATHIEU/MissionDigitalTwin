/**
 */
package dtmodel.impl;

import dtmodel.ConnectorEnd;
import dtmodel.DtmodelPackage;
import dtmodel.Port;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dtmodel.impl.PortImpl#getConnectorend <em>Connectorend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port {
	/**
	 * The cached value of the '{@link #getConnectorend() <em>Connectorend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorend()
	 * @generated
	 * @ordered
	 */
	protected ConnectorEnd connectorend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmodelPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd getConnectorend() {
		if (connectorend != null && connectorend.eIsProxy()) {
			InternalEObject oldConnectorend = (InternalEObject) connectorend;
			connectorend = (ConnectorEnd) eResolveProxy(oldConnectorend);
			if (connectorend != oldConnectorend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DtmodelPackage.PORT__CONNECTOREND,
							oldConnectorend, connectorend));
			}
		}
		return connectorend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd basicGetConnectorend() {
		return connectorend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorend(ConnectorEnd newConnectorend, NotificationChain msgs) {
		ConnectorEnd oldConnectorend = connectorend;
		connectorend = newConnectorend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DtmodelPackage.PORT__CONNECTOREND, oldConnectorend, newConnectorend);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorend(ConnectorEnd newConnectorend) {
		if (newConnectorend != connectorend) {
			NotificationChain msgs = null;
			if (connectorend != null)
				msgs = ((InternalEObject) connectorend).eInverseRemove(this, DtmodelPackage.CONNECTOR_END__PORT,
						ConnectorEnd.class, msgs);
			if (newConnectorend != null)
				msgs = ((InternalEObject) newConnectorend).eInverseAdd(this, DtmodelPackage.CONNECTOR_END__PORT,
						ConnectorEnd.class, msgs);
			msgs = basicSetConnectorend(newConnectorend, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmodelPackage.PORT__CONNECTOREND, newConnectorend,
					newConnectorend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DtmodelPackage.PORT__CONNECTOREND:
			if (connectorend != null)
				msgs = ((InternalEObject) connectorend).eInverseRemove(this, DtmodelPackage.CONNECTOR_END__PORT,
						ConnectorEnd.class, msgs);
			return basicSetConnectorend((ConnectorEnd) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DtmodelPackage.PORT__CONNECTOREND:
			return basicSetConnectorend(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DtmodelPackage.PORT__CONNECTOREND:
			if (resolve)
				return getConnectorend();
			return basicGetConnectorend();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DtmodelPackage.PORT__CONNECTOREND:
			setConnectorend((ConnectorEnd) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DtmodelPackage.PORT__CONNECTOREND:
			setConnectorend((ConnectorEnd) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DtmodelPackage.PORT__CONNECTOREND:
			return connectorend != null;
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
