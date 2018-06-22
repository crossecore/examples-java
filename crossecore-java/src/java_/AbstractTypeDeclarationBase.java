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
	private Ocllib.Set<TypeAccess> _usagesInTypeAccess;
	
	public Ocllib.Set<TypeAccess> getUsagesInTypeAccess()
	{
		if(_usagesInTypeAccess==null){
			_usagesInTypeAccess = new Ocllib.Set<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.TYPE_USAGESINTYPEACCESS, Java_PackageImpl.TYPEACCESS_TYPE);
		}
		return _usagesInTypeAccess;
	
	}
	private Ocllib.OrderedSet<BodyDeclaration> _bodyDeclarations;
	
	public Ocllib.OrderedSet<BodyDeclaration> getBodyDeclarations()
	{
		if(_bodyDeclarations==null){
			_bodyDeclarations = new Ocllib.OrderedSet<BodyDeclaration>(BodyDeclaration.class, this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS, Java_PackageImpl.BODYDECLARATION_ABSTRACTTYPEDECLARATION);
		}
		return _bodyDeclarations;
	
	}
	private Ocllib.OrderedSet<Comment> _commentsBeforeBody;
	
	public Ocllib.OrderedSet<Comment> getCommentsBeforeBody()
	{
		if(_commentsBeforeBody==null){
			_commentsBeforeBody = new Ocllib.OrderedSet<Comment>(Comment.class, this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY);
		}
		return _commentsBeforeBody;
	
	}
	private Ocllib.OrderedSet<Comment> _commentsAfterBody;
	
	public Ocllib.OrderedSet<Comment> getCommentsAfterBody()
	{
		if(_commentsAfterBody==null){
			_commentsAfterBody = new Ocllib.OrderedSet<Comment>(Comment.class, this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY);
		}
		return _commentsAfterBody;
	
	}
	public Package getPackage()
	{
		
			if (eContainerFeatureID() != Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE) return null;
			return (Package)eInternalContainer();
		
		
	}
	public void setPackage(Package value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, Java_PackageImpl.PACKAGE_OWNEDELEMENTS, AbstractTypeDeclaration.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, Java_PackageImpl.PACKAGE_OWNEDELEMENTS, AbstractTypeDeclaration.class, msgs);
			}
			msgs = basicSetPackage(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE , value, value));
		}
	}
	private Ocllib.OrderedSet<TypeAccess> _superInterfaces;
	
	public Ocllib.OrderedSet<TypeAccess> getSuperInterfaces()
	{
		if(_superInterfaces==null){
			_superInterfaces = new Ocllib.OrderedSet<TypeAccess>(TypeAccess.class, this, Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES, EOPPOSITE_FEATURE_BASE - Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES);
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
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetPackage((Package)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
				return getBodyDeclarations().basicAdd((BodyDeclaration)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
				return getUsagesInTypeAccess().basicAdd((TypeAccess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
				return basicSetPackage(null, msgs);
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
				return getBodyDeclarations().basicRemove((BodyDeclaration)otherEnd, msgs);
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
				return getUsagesInTypeAccess().basicRemove((TypeAccess)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetPackage(Package newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
				return getUsagesInTypeAccess();
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
				return getBodyDeclarations();
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
				return getCommentsBeforeBody();
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
				return getCommentsAfterBody();
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
				return getPackage();
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
				return getSuperInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
				getUsagesInTypeAccess().clear();
				getUsagesInTypeAccess().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
				getBodyDeclarations().clear();
				getBodyDeclarations().addAll((java.util.Collection<? extends BodyDeclaration>) newValue);
				return;
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
				getCommentsBeforeBody().clear();
				getCommentsBeforeBody().addAll((java.util.Collection<? extends Comment>) newValue);
				return;
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
				getCommentsAfterBody().clear();
				getCommentsAfterBody().addAll((java.util.Collection<? extends Comment>) newValue);
				return;
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
				setPackage((Package) newValue);
				return;
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
				getSuperInterfaces().clear();
				getSuperInterfaces().addAll((java.util.Collection<? extends TypeAccess>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS:
				return getUsagesInTypeAccess().isEmpty(); //many, volatile
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_BODYDECLARATIONS:
				return _bodyDeclarations != null && !_bodyDeclarations.isEmpty();
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSBEFOREBODY:
				return _commentsBeforeBody != null && !_commentsBeforeBody.isEmpty();
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_COMMENTSAFTERBODY:
				return _commentsAfterBody != null && !_commentsAfterBody.isEmpty();
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_PACKAGE:
				return getPackage() != null; //single, volatile
			case Java_PackageImpl.ABSTRACTTYPEDECLARATION_SUPERINTERFACES:
				return _superInterfaces != null && !_superInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS: return Java_PackageImpl.TYPE_USAGESINTYPEACCESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
				
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case Java_PackageImpl.TYPE_USAGESINTYPEACCESS: return Java_PackageImpl.ABSTRACTTYPEDECLARATION_USAGESINTYPEACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	
}
