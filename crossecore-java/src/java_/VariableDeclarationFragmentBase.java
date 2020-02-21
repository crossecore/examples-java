package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class VariableDeclarationFragmentBase 
extends VariableDeclarationImpl implements VariableDeclarationFragment
{
	public AbstractVariablesContainer getVariablesContainer()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER) return null;
			return (AbstractVariablesContainer)eInternalContainer();
		
		
	}
	public void setVariablesContainer(AbstractVariablesContainer value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS, AbstractVariablesContainer.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS, AbstractVariablesContainer.class, msgs);
			}
			msgs = basicSetVariablesContainer(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.VARIABLEDECLARATIONFRAGMENT;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetVariablesContainer((AbstractVariablesContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return basicSetVariablesContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetVariablesContainer(AbstractVariablesContainer newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return getVariablesContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				setVariablesContainer((AbstractVariablesContainer) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return getVariablesContainer() != null; //single, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
