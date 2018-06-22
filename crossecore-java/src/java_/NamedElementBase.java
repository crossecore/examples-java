package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class NamedElementBase 
extends ASTNodeImpl implements NamedElement
{
	protected static final java.lang.String NAME_EDEFAULT = "";
	private java.lang.String _name = NAME_EDEFAULT;
	public java.lang.String getName()
	{
		return _name;
	}
	public void setName(java.lang.String value){
		
		java.lang.String oldValue = _name;
		_name = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.NAMEDELEMENT_NAME, oldValue, value));
		
	}
	
	
	
	protected static final boolean PROXY_EDEFAULT = false;
	private boolean _proxy = PROXY_EDEFAULT;
	public boolean isProxy()
	{
		return _proxy;
	}
	public void setProxy(boolean value){
		
		boolean oldValue = _proxy;
		_proxy = value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_PackageImpl.NAMEDELEMENT_PROXY, oldValue, value));
		
	}
	
	
	
	private Ocllib.Set<ImportDeclaration> _usagesInImports;
	
	public Ocllib.Set<ImportDeclaration> getUsagesInImports()
	{
		if(_usagesInImports==null){
			_usagesInImports = new Ocllib.Set<ImportDeclaration>(ImportDeclaration.class, this, Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS, Java_PackageImpl.IMPORTDECLARATION_IMPORTEDELEMENT);
		}
		return _usagesInImports;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.NAMEDELEMENT;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
				return getUsagesInImports().basicAdd((ImportDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
				return getUsagesInImports().basicRemove((ImportDeclaration)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.NAMEDELEMENT_NAME:
				return getName();
			case Java_PackageImpl.NAMEDELEMENT_PROXY:
				return isProxy();
			case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
				return getUsagesInImports();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.NAMEDELEMENT_NAME:
				setName((java.lang.String) newValue);
				return;
			case Java_PackageImpl.NAMEDELEMENT_PROXY:
				setProxy((boolean) newValue);
				return;
			case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
				getUsagesInImports().clear();
				getUsagesInImports().addAll((java.util.Collection<? extends ImportDeclaration>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.NAMEDELEMENT_NAME:
				return NAME_EDEFAULT == null ? _name != null : !NAME_EDEFAULT.equals(_name);
			case Java_PackageImpl.NAMEDELEMENT_PROXY:
				return _proxy != PROXY_EDEFAULT;
			case Java_PackageImpl.NAMEDELEMENT_USAGESINIMPORTS:
				return getUsagesInImports().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
