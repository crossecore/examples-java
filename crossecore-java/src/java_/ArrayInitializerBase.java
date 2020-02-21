package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ArrayInitializerBase 
extends ExpressionImpl implements ArrayInitializer
{
	private com.crossecore.ocl.OrderedSet<Expression> _expressions;
	
	public com.crossecore.ocl.OrderedSet<Expression> getExpressions()
	{
		if(_expressions==null){
			_expressions = new com.crossecore.ocl.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.ARRAY_INITIALIZER__EXPRESSIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAY_INITIALIZER__EXPRESSIONS);
		}
		return _expressions;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ARRAYINITIALIZER;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.ARRAY_INITIALIZER__EXPRESSIONS:
				return getExpressions();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ARRAY_INITIALIZER__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ARRAY_INITIALIZER__EXPRESSIONS:
				return _expressions != null && !_expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
