/**
 */
package dtmodel.impl;

import dtmodel.Configuration;
import dtmodel.DigitalTwin;
import dtmodel.DtmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Twin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dtmodel.impl.DigitalTwinImpl#getDigitaltwin <em>Digitaltwin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalTwinImpl extends MinimalEObjectImpl.Container implements DigitalTwin {
	/**
	 * The cached value of the '{@link #getDigitaltwin() <em>Digitaltwin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitaltwin()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> digitaltwin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalTwinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmodelPackage.Literals.DIGITAL_TWIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getDigitaltwin() {
		if (digitaltwin == null) {
			digitaltwin = new EObjectContainmentEList<Configuration>(Configuration.class, this,
					DtmodelPackage.DIGITAL_TWIN__DIGITALTWIN);
		}
		return digitaltwin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DtmodelPackage.DIGITAL_TWIN__DIGITALTWIN:
			return ((InternalEList<?>) getDigitaltwin()).basicRemove(otherEnd, msgs);
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
		case DtmodelPackage.DIGITAL_TWIN__DIGITALTWIN:
			return getDigitaltwin();
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
		case DtmodelPackage.DIGITAL_TWIN__DIGITALTWIN:
			getDigitaltwin().clear();
			getDigitaltwin().addAll((Collection<? extends Configuration>) newValue);
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
		case DtmodelPackage.DIGITAL_TWIN__DIGITALTWIN:
			getDigitaltwin().clear();
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
		case DtmodelPackage.DIGITAL_TWIN__DIGITALTWIN:
			return digitaltwin != null && !digitaltwin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DigitalTwinImpl
