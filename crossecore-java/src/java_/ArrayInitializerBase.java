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
	private Ocllib.OrderedSet<Expression> _expressions;
	
	public Ocllib.OrderedSet<Expression> getExpressions()
	{
		if(_expressions==null){
			_expressions = new Ocllib.OrderedSet<Expression>(Expression.class, this, Java_PackageImpl.ARRAYINITIALIZER_EXPRESSIONS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ARRAYINITIALIZER_EXPRESSIONS);
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
			case Java_PackageImpl.ARRAYINITIALIZER_EXPRESSIONS:
				return getExpressions();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ARRAYINITIALIZER_EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((java.util.Collection<? extends Expression>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	
}
