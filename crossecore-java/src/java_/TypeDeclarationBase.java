package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class TypeDeclarationBase 
extends AbstractTypeDeclarationImpl implements TypeDeclaration
{
	private Ocllib.OrderedSet<TypeParameter> _typeParameters;
	
	public Ocllib.OrderedSet<TypeParameter> getTypeParameters()
	{
		if(_typeParameters==null){
			_typeParameters = new Ocllib.OrderedSet<TypeParameter>(TypeParameter.class, this, Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS);
		}
		return _typeParameters;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.TYPEDECLARATION;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS:
				return getTypeParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((java.util.Collection<? extends TypeParameter>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.TYPEDECLARATION_TYPEPARAMETERS:
				return _typeParameters != null && !_typeParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
