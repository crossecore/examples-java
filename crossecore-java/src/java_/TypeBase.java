package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class TypeBase 
extends NamedElementImpl implements Type
{
	private com.crossecore.ocl.Set<TypeAccess> _usagesInTypeAccess;
	
	public com.crossecore.ocl.Set<TypeAccess> getUsagesInTypeAccess()
	{
		if(_usagesInTypeAccess==null){
			_usagesInTypeAccess = new com.crossecore.ocl.Set<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS, Java_PackageImpl.TYPE_ACCESS__TYPE);
		}
		return _usagesInTypeAccess;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.TYPE;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess().basicAdd((TypeAccess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess().basicRemove((TypeAccess)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS:
				getUsagesInTypeAccess().clear();
				getUsagesInTypeAccess().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
