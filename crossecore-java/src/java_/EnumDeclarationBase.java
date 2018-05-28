package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EnumDeclarationBase 
extends AbstractTypeDeclarationImpl implements EnumDeclaration
{
	private Ocllib.OrderedSet<EnumConstantDeclaration> _enumConstants;
	
	public Ocllib.OrderedSet<EnumConstantDeclaration> getEnumConstants()
	{
		if(_enumConstants==null){
			_enumConstants = new Ocllib.OrderedSet<EnumConstantDeclaration>(EnumConstantDeclaration.class, this, Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS);
		}
		return _enumConstants;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ENUMDECLARATION;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS:
				return getEnumConstants();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ENUMDECLARATION_ENUMCONSTANTS:
				getEnumConstants().clear();
				getEnumConstants().addAll((java.util.Collection<? extends EnumConstantDeclaration>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
