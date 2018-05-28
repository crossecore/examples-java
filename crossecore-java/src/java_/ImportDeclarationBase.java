package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ImportDeclarationBase 
extends ASTNodeImpl implements ImportDeclaration
{
	private boolean _static = false;
	public boolean isStatic()
	{
		return _static;
	}
	public void setStatic(boolean value){
		
		boolean oldValue = _static;
		_static = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.IMPORTDECLARATION_STATIC, oldValue, value));
		
	}
	
	/*
	@Override
	public boolean isStatic() {
		//return this.eGet();
		
		return false;
	}
	*/
	private NamedElement _importedElement;
	public NamedElement getImportedElement()
	{
		
			return _importedElement;
		
		
	}
	public void setImportedElement(NamedElement value){
		if (value != _importedElement) {
			NotificationChain msgs = null;
			if (_importedElement != null){
				msgs = ((InternalEObject)_importedElement).eInverseRemove(this, Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS, ImportDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS, ImportDeclaration.class, msgs);
			}
			msgs = basicSetImportedElement(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.IMPORTDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT:
				if (_importedElement != null){
					msgs = ((InternalEObject)_importedElement).eInverseRemove(this, Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT, NamedElement.class, msgs);
				}
				return basicSetImportedElement((NamedElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT:
				return basicSetImportedElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetImportedElement(NamedElement newobj, NotificationChain msgs) {
		NamedElement oldobj = _importedElement;
		_importedElement = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.IMPORTDECLARATION_STATIC:
				return isStatic();
			case Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT:
				return getImportedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.IMPORTDECLARATION_STATIC:
				setStatic((boolean) newValue);
				return;
			case Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT:
				setImportedElement((NamedElement) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
