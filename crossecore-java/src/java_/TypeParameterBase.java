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
	private com.crossecore.ocl.OrderedSet<TypeAccess> _bounds;
	
	public com.crossecore.ocl.OrderedSet<TypeAccess> getBounds()
	{
		if(_bounds==null){
			_bounds = new com.crossecore.ocl.OrderedSet<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.TYPE_PARAMETER__BOUNDS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPE_PARAMETER__BOUNDS);
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
			case Java_PackageImpl.TYPE_PARAMETER__BOUNDS:
				return getBounds();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_PARAMETER__BOUNDS:
				getBounds().clear();
				getBounds().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_PARAMETER__BOUNDS:
				return _bounds != null && !_bounds.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
