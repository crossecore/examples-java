package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class TypeDeclarationStatementBase 
extends StatementImpl implements TypeDeclarationStatement
{
	private AbstractTypeDeclaration _declaration;
	public AbstractTypeDeclaration getDeclaration()
	{
		
			return _declaration;
		
		
	}
	public void setDeclaration(AbstractTypeDeclaration value){
		if (value != _declaration) {
			NotificationChain msgs = null;
			if (_declaration != null){
				msgs = ((InternalEObject)_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPE_DECLARATION_STATEMENT__DECLARATION, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.TYPE_DECLARATION_STATEMENT__DECLARATION, null, msgs);
			}
			msgs = basicSetDeclaration(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.TYPE_DECLARATION_STATEMENT__DECLARATION , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.TYPEDECLARATIONSTATEMENT;
	}
	
	
	public NotificationChain basicSetDeclaration(AbstractTypeDeclaration newobj, NotificationChain msgs) {
		AbstractTypeDeclaration oldobj = _declaration;
		_declaration = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, Java_PackageImpl.TYPE_DECLARATION_STATEMENT__DECLARATION, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_DECLARATION_STATEMENT__DECLARATION:
				return getDeclaration();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_DECLARATION_STATEMENT__DECLARATION:
				setDeclaration((AbstractTypeDeclaration) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.TYPE_DECLARATION_STATEMENT__DECLARATION:
				return _declaration != null; //single != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
