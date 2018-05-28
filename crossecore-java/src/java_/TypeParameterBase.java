package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class TypeParameterBase 
extends TypeImpl implements TypeParameter
{
	private Ocllib.OrderedSet<TypeAccess> _bounds;
	
	public Ocllib.OrderedSet<TypeAccess> getBounds()
	{
		if(_bounds==null){
			_bounds = new Ocllib.OrderedSet<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.TYPEPARAMETER_BOUNDS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPEPARAMETER_BOUNDS);
		}
		return _bounds;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.TYPEPARAMETER;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.TYPEPARAMETER_BOUNDS:
				return getBounds();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TYPEPARAMETER_BOUNDS:
				getBounds().clear();
				getBounds().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
