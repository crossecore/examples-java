package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class BlockBase 
extends StatementImpl implements Block
{
	private Ocllib.OrderedSet<Statement> _statements;
	
	public Ocllib.OrderedSet<Statement> getStatements()
	{
		if(_statements==null){
			_statements = new Ocllib.OrderedSet<Statement>(Statement.class, this, Java_PackageImpl.BLOCK_STATEMENTS, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.BLOCK_STATEMENTS);
		}
		return _statements;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.BLOCK;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.BLOCK_STATEMENTS:
				return getStatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.BLOCK_STATEMENTS:
				getStatements().clear();
				getStatements().addAll((java.util.Collection<? extends Statement>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.BLOCK_STATEMENTS:
				return _statements != null && !_statements.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
