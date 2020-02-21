package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class AnonymousClassDeclarationBase 
extends ASTNodeImpl implements AnonymousClassDeclaration
{
	private com.crossecore.ocl.OrderedSet<BodyDeclaration> _bodyDeclarations;
	
	public com.crossecore.ocl.OrderedSet<BodyDeclaration> getBodyDeclarations()
	{
		if(_bodyDeclarations==null){
			_bodyDeclarations = new com.crossecore.ocl.OrderedSet<BodyDeclaration>(BodyDeclaration.class, this, Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, Java_PackageImpl.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER);
		}
		return _bodyDeclarations;
	
	}
	public ClassInstanceCreation getClassInstanceCreation()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION) return null;
			return (ClassInstanceCreation)eInternalContainer();
		
		
	}
	public void setClassInstanceCreation(ClassInstanceCreation value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION, ClassInstanceCreation.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION, ClassInstanceCreation.class, msgs);
			}
			msgs = basicSetClassInstanceCreation(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION , value, value));
		}
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ANONYMOUSCLASSDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations().basicAdd((BodyDeclaration)otherEnd, msgs);
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetClassInstanceCreation((ClassInstanceCreation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations().basicRemove((BodyDeclaration)otherEnd, msgs);
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				return basicSetClassInstanceCreation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetClassInstanceCreation(ClassInstanceCreation newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations();
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				return getClassInstanceCreation();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				getBodyDeclarations().addAll((java.util.Collection<? extends BodyDeclaration>) newValue);
				return;
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				setClassInstanceCreation((ClassInstanceCreation) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				return _bodyDeclarations != null && !_bodyDeclarations.isEmpty();
			case Java_PackageImpl.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				return getClassInstanceCreation() != null; //single, volatile
		}
		return super.eIsSet(featureID);
	}
	
	
	
}
