package java_;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class AbstractTypeDeclarationBase 
extends BodyDeclarationImpl implements AbstractTypeDeclaration
{
	private com.crossecore.ocl.Set<TypeAccess> _usagesInTypeAccess;
	
	public com.crossecore.ocl.Set<TypeAccess> getUsagesInTypeAccess()
	{
		if(_usagesInTypeAccess==null){
			_usagesInTypeAccess = new com.crossecore.ocl.Set<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS, Java_PackageImpl.TYPE_ACCESS__TYPE);
		}
		return _usagesInTypeAccess;
	
	}
	private com.crossecore.ocl.OrderedSet<BodyDeclaration> _bodyDeclarations;
	
	public com.crossecore.ocl.OrderedSet<BodyDeclaration> getBodyDeclarations()
	{
		if(_bodyDeclarations==null){
			_bodyDeclarations = new com.crossecore.ocl.OrderedSet<BodyDeclaration>(BodyDeclaration.class, this, Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, Java_PackageImpl.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION);
		}
		return _bodyDeclarations;
	
	}
	private com.crossecore.ocl.OrderedSet<Comment> _commentsBeforeBody;
	
	public com.crossecore.ocl.OrderedSet<Comment> getCommentsBeforeBody()
	{
		if(_commentsBeforeBody==null){
			_commentsBeforeBody = new com.crossecore.ocl.OrderedSet<Comment>(Comment.class, this, Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY);
		}
		return _commentsBeforeBody;
	
	}
	private com.crossecore.ocl.OrderedSet<Comment> _commentsAfterBody;
	
	public com.crossecore.ocl.OrderedSet<Comment> getCommentsAfterBody()
	{
		if(_commentsAfterBody==null){
			_commentsAfterBody = new com.crossecore.ocl.OrderedSet<Comment>(Comment.class, this, Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY);
		}
		return _commentsAfterBody;
	
	}
	public Package getPackage()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__PACKAGE) return null;
			return (Package)eInternalContainer();
		
		
	}
	public void setPackage(Package value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.PACKAGE__OWNED_ELEMENTS, Package.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.PACKAGE__OWNED_ELEMENTS, Package.class, msgs);
			}
			msgs = basicSetPackage(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__PACKAGE , value, value));
		}
	}
	private com.crossecore.ocl.OrderedSet<TypeAccess> _superInterfaces;
	
	public com.crossecore.ocl.OrderedSet<TypeAccess> getSuperInterfaces()
	{
		if(_superInterfaces==null){
			_superInterfaces = new com.crossecore.ocl.OrderedSet<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES);
		}
		return _superInterfaces;
	
	}

	
	@Override
	protected EClass eStaticClass() {
		return Java_PackageImpl.Literals.ABSTRACTTYPEDECLARATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations().basicAdd((BodyDeclaration)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess().basicAdd((TypeAccess)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetPackage((Package)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations().basicRemove((BodyDeclaration)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess().basicRemove((TypeAccess)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return basicSetPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__PACKAGE, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess();
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations();
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
				return getCommentsBeforeBody();
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
				return getCommentsAfterBody();
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return getPackage();
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				return getSuperInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				getUsagesInTypeAccess().clear();
				getUsagesInTypeAccess().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				getBodyDeclarations().addAll((java.util.Collection<? extends BodyDeclaration>) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
				getCommentsBeforeBody().clear();
				getCommentsBeforeBody().addAll((java.util.Collection<? extends Comment>) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
				getCommentsAfterBody().clear();
				getCommentsAfterBody().addAll((java.util.Collection<? extends Comment>) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				setPackage((Package) newValue);
				return;
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				getSuperInterfaces().clear();
				getSuperInterfaces().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess().isEmpty(); //many, volatile
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return _bodyDeclarations != null && !_bodyDeclarations.isEmpty();
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
				return _commentsBeforeBody != null && !_commentsBeforeBody.isEmpty();
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
				return _commentsAfterBody != null && !_commentsAfterBody.isEmpty();
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return getPackage() != null; //single, volatile
			case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				return _superInterfaces != null && !_superInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS: return Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case Java_PackageImpl.TYPE__USAGES_IN_TYPE_ACCESS: return Java_PackageImpl.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
