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
	protected static final boolean STATIC_EDEFAULT = false;
	private boolean _static = STATIC_EDEFAULT;
	public boolean isStatic()
	{
		return _static;
	}
	public void setStatic(boolean value){
		
		boolean oldValue = _static;
		_static = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.IMPORT_DECLARATION__STATIC, oldValue, value));
		
	}
	
	
	
	private NamedElement _importedElement;
	public NamedElement getImportedElement()
	{
		
			return _importedElement;
		
		
	}
	public void setImportedElement(NamedElement value){
		if (value != _importedElement) {
			NotificationChain msgs = null;
			if (_importedElement != null){
				msgs = ((InternalEObject)_importedElement).eInverseRemove(this, Java_PackageImpl.NAMED_ELEMENT__USAGES_IN_IMPORTS, NamedElement.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.NAMED_ELEMENT__USAGES_IN_IMPORTS, NamedElement.class, msgs);
			}
			msgs = basicSetImportedElement(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.IMPORT_DECLARATION__IMPORTED_ELEMENT , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.IMPORTDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				if (_importedElement != null){
					msgs = ((InternalEObject)_importedElement).eInverseRemove(this, Java_PackageImpl.IMPORT_DECLARATION__IMPORTED_ELEMENT, NamedElement.class, msgs);
				}
				return basicSetImportedElement((NamedElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return basicSetImportedElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetImportedElement(NamedElement newobj, NotificationChain msgs) {
		NamedElement oldobj = _importedElement;
		_importedElement = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.IMPORT_DECLARATION__IMPORTED_ELEMENT, oldobj, newobj);
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
			case Java_PackageImpl.IMPORT_DECLARATION__STATIC:
				return isStatic();
			case Java_PackageImpl.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return getImportedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.IMPORT_DECLARATION__STATIC:
				setStatic((boolean) newValue);
				return;
			case Java_PackageImpl.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				setImportedElement((NamedElement) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.IMPORT_DECLARATION__STATIC:
				return _static != STATIC_EDEFAULT;
			case Java_PackageImpl.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return getImportedElement() != null; //single, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
