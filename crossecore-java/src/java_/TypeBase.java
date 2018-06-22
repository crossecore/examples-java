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
	private Ocllib.Set<TypeAccess> _usagesInTypeAccess;
	
	public Ocllib.Set<TypeAccess> getUsagesInTypeAccess()
	{
		if(_usagesInTypeAccess==null){
			_usagesInTypeAccess = new Ocllib.Set<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.TYPE_USAGESINTYPEACCESS, Java_PackageImpl.TYPEACCESS_TYPE);
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
			case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
				return getUsagesInTypeAccess().basicAdd((TypeAccess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
				return getUsagesInTypeAccess().basicRemove((TypeAccess)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
				return getUsagesInTypeAccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
				getUsagesInTypeAccess().clear();
				getUsagesInTypeAccess().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_USAGESINTYPEACCESS:
				return getUsagesInTypeAccess().isEmpty(); //many, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
